package br.ufg.inf.mf.pratica.dto;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import com.google.gson.Gson;

public abstract class MainDTO {

	public String toJson()
	{
		Gson gson = new Gson();
		return gson.toJson(this).toString();
	}
	
	public String toXml() throws JAXBException 
	{
        JAXBContext context = JAXBContext.newInstance(this.getClass());
        Marshaller m = context.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        m.marshal(this, sw);

	    return sw.toString();
	}
	
	public MainDTO fromJson(String from)
	{
		Gson gson = new Gson();
		return gson.fromJson(from, this.getClass());
	}
	
	public MainDTO fromXml(String xml) throws JAXBException
	{
		JAXBContext jaxbContext = JAXBContext.newInstance(this.getClass());
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

		StringReader reader = new StringReader(xml);
		return (MainDTO) unmarshaller.unmarshal(reader);
	}
	
	public String getXmlSchema()
	{
		String className = this.getClass().getSimpleName();
		StringBuilder sb = new StringBuilder(className);
		sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
		className = sb.toString();
		
		String schema = "<?xml version=\"1.0\"?>" + 
				"<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">" + 
				"<xs:element name=\""
				+ className + "\">" + 
				"<xs:complexType>" + 
				"<xs:sequence>";
		
		Field[] fields = this.getClass().getDeclaredFields();
		
        for (Field field : fields) {
        	schema += "<xs:element name=\""
        			+ field.getName() + "\" type=\"xs:"
        			+ field.getType().getSimpleName().toLowerCase() + "\"/>";

    	}
		
		schema += "</xs:sequence>" + 
			"</xs:complexType>" + 
			"</xs:element>" + 
			"</xs:schema>";		
		
		return schema;
	}
	
	public String getJsonSchema()
	{
		String schema = "{\"definitions\": {},\"$schema\": "
				+ "\"http://json-schema.org/draft-07/schema#\","
				+ "\"$id\": \"http://example.com/root.json\","
				+ "\"type\": \"object\","
				+ "\"properties\": {";
		
		Field[] fields = this.getClass().getDeclaredFields();
		
        for (Field field : fields) {
        	String fieldName = field.getName();
        	String fieldType = (field.getType().getSimpleName().toLowerCase() == "int") ? "integer" : field.getType().getSimpleName().toLowerCase();
        	fieldType = (fieldType.equals("date")) ? "string" : fieldType;

        	schema += "\""	
        			+ fieldName + "\": {\"$id\": \"#/properties/"
        			+ fieldName + "\",\"type\": \""
					+ fieldType + "\"},";
    	}
		
		schema += "}}";		
		
		return schema;
	}
	
	public boolean valideXml(String xml, String xsd) throws IOException, SAXException
	{
		SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		StreamSource xsdSource = new StreamSource(new StringReader(xsd));
		Schema schema = factory.newSchema(xsdSource);
		Validator validator = schema.newValidator();

		Source xmlSource = new StreamSource(new StringReader(xml));

		boolean isValid = true;
		
		try {	
			validator.validate(xmlSource);
		} catch (SAXException e) {
			isValid = false;
		}

		return isValid;
	}
	
	public boolean valideJson(String json, String xsd)
	{
		JSONObject rawSchema = new JSONObject(xsd);
		org.everit.json.schema.Schema schema = SchemaLoader.load(rawSchema);
		
		boolean isValid = true;
		
		try {	
			schema.validate(new JSONObject(json));
		} catch (Exception e) {
			isValid = false;
		}

		return isValid;
	}
}
