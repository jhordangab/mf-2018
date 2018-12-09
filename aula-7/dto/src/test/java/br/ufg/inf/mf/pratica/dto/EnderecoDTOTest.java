package br.ufg.inf.mf.pratica.dto;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class EnderecoDTOTest extends TestCase {

	public void testJson() {
		Instancia instacia = new Instancia();
		EnderecoDTO model = instacia.endereco();
		String json = model.toJson();

		EnderecoDTO modelJson = new EnderecoDTO();
		modelJson = (EnderecoDTO) modelJson.fromJson(json);

		assertEquals(model.getIndividuo(), modelJson.getIndividuo());
	}

	public void testXml() throws JAXBException {
		Instancia instacia = new Instancia();
		EnderecoDTO model = instacia.endereco();
		String xml = model.toXml();
		
		EnderecoDTO modelXml = new EnderecoDTO();
		modelXml = (EnderecoDTO) modelXml.fromXml(xml);
		
		assertEquals(model.getIndividuo(), modelXml.getIndividuo());
	}

	public void testValideXml() throws IOException, SAXException, JAXBException {
		Instancia instacia = new Instancia();
		EnderecoDTO model = instacia.endereco();
		String xml = model.toXml();
		
		assertEquals(model.valideXml(xml, model.getXmlSchema()), false);
	}

	public void testValideJson() {
		Instancia instacia = new Instancia();
		EnderecoDTO model = instacia.endereco();
		String json = model.toJson();
		
		assertEquals(model.valideJson(json, model.getJsonSchema()), true);
	}

}
