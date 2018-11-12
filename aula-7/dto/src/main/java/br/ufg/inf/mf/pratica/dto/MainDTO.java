package br.ufg.inf.mf.pratica.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

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
}
