package br.ufg.inf.mf.pratica.dto;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

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
	
	public boolean valideXml(String xml)
	{
		return true;
	}
	
	public void valideJson(String json) throws IOException
	{
    	File currentDirectory = new File(new File(".").getAbsolutePath());

		try (InputStream inputStream = getClass().getResourceAsStream(currentDirectory.getCanonicalPath() + "/src/main/java/br/ufg/inf/mf/pratica/dto/schema.json")) {
			  JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
			  Schema schema = SchemaLoader.load(rawSchema);
			  schema.validate(new JSONObject(json));
		}
	}
}
