package br.ufg.inf.mf.pratica.dto;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class DadoDemograficoDTOTest extends TestCase {

	public void testJson() {
		Instancia instacia = new Instancia();
		DadoDemograficoDTO model = instacia.dadoDemografico();
		String json = model.toJson();

		DadoDemograficoDTO modelJson = new DadoDemograficoDTO();
		modelJson = (DadoDemograficoDTO) modelJson.fromJson(json);

		assertEquals(model.getIndividuo(), modelJson.getIndividuo());
	}

	public void testXml() throws JAXBException {
		Instancia instacia = new Instancia();
		DadoDemograficoDTO model = instacia.dadoDemografico();
		String xml = model.toXml();
		
		DadoDemograficoDTO modelXml = new DadoDemograficoDTO();
		modelXml = (DadoDemograficoDTO) modelXml.fromXml(xml);
		
		assertEquals(model.getIndividuo(), modelXml.getIndividuo());
	}

	public void testValideXml() throws IOException, SAXException, JAXBException {
		Instancia instacia = new Instancia();
		DadoDemograficoDTO model = instacia.dadoDemografico();
		String xml = model.toXml();
		
		assertEquals(model.valideXml(xml, model.getXmlSchema()), false);
	}

	public void testValideJson() {
		Instancia instacia = new Instancia();
		DadoDemograficoDTO model = instacia.dadoDemografico();
		String json = model.toJson();
		
		assertEquals(model.valideJson(json, model.getJsonSchema()), true);
	}

}
