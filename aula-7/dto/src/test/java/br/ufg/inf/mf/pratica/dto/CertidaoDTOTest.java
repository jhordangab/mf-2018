package br.ufg.inf.mf.pratica.dto;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class CertidaoDTOTest extends TestCase {

	public void testJson() {
		Instancia instacia = new Instancia();
		CertidaoDTO model = instacia.certidao();
		String json = model.toJson();

		CertidaoDTO modelJson = new CertidaoDTO();
		modelJson = (CertidaoDTO) modelJson.fromJson(json);

		assertEquals(model.getIdentificador(), modelJson.getIdentificador());
	}

	public void testXml() throws JAXBException {
		Instancia instacia = new Instancia();
		CertidaoDTO model = instacia.certidao();
		String xml = model.toXml();
		
		CertidaoDTO modelXml = new CertidaoDTO();
		modelXml = (CertidaoDTO) modelXml.fromXml(xml);
		
		assertEquals(model.getIdentificador(), modelXml.getIdentificador());
	}

	public void testValideXml() throws IOException, SAXException, JAXBException {
		Instancia instacia = new Instancia();
		CertidaoDTO model = instacia.certidao();
		String xml = model.toXml();
		
		assertEquals(model.valideXml(xml, model.getXmlSchema()), true);
	}

	public void testValideJson() {
		Instancia instacia = new Instancia();
		CertidaoDTO model = instacia.certidao();
		String json = model.toJson();
		
		assertEquals(model.valideJson(json, model.getJsonSchema()), true);
	}
}
