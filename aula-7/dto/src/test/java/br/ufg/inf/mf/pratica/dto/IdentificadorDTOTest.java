package br.ufg.inf.mf.pratica.dto;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class IdentificadorDTOTest extends TestCase {

	public void testJson() {
		Instancia instacia = new Instancia();
		IdentificadorDTO model = instacia.identificador();
		String json = model.toJson();

		IdentificadorDTO modelJson = new IdentificadorDTO();
		modelJson = (IdentificadorDTO) modelJson.fromJson(json);

		assertEquals(model.getIndividuo(), modelJson.getIndividuo());
	}

	public void testXml() throws JAXBException {
		Instancia instacia = new Instancia();
		IdentificadorDTO model = instacia.identificador();
		String xml = model.toXml();
		
		IdentificadorDTO modelXml = new IdentificadorDTO();
		modelXml = (IdentificadorDTO) modelXml.fromXml(xml);
		
		assertEquals(model.getIndividuo(), modelXml.getIndividuo());
	}

	public void testValideXml() throws IOException, SAXException, JAXBException {
		Instancia instacia = new Instancia();
		IdentificadorDTO model = instacia.identificador();
		String xml = model.toXml();
		
		assertEquals(model.valideXml(xml, model.getXmlSchema()), false);
	}

	public void testValideJson() {
		Instancia instacia = new Instancia();
		IdentificadorDTO model = instacia.identificador();
		String json = model.toJson();
		
		assertEquals(model.valideJson(json, model.getJsonSchema()), true);
	}
}
