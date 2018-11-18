package br.ufg.inf.mf.pratica.dto;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class AreaGeograficaDTOTest extends TestCase {

	public void testJson() {
		Instancia instacia = new Instancia();
		AreaGeograficaDTO model = instacia.areaGeografica();
		String json = model.toJson();

		AreaGeograficaDTO modelJson = new AreaGeograficaDTO();
		modelJson = (AreaGeograficaDTO) modelJson.fromJson(json);

		assertEquals(model.getCodigo(), modelJson.getCodigo());
	}

	public void testXml() throws JAXBException {
		Instancia instacia = new Instancia();
		AreaGeograficaDTO model = instacia.areaGeografica();
		String xml = model.toXml();
		
		AreaGeograficaDTO modelXml = new AreaGeograficaDTO();
		modelXml = (AreaGeograficaDTO) modelXml.fromXml(xml);
		
		assertEquals(model.getCodigo(), modelXml.getCodigo());
	}

	public void testValideXml() throws IOException, SAXException, JAXBException {
		Instancia instacia = new Instancia();
		AreaGeograficaDTO model = instacia.areaGeografica();
		String xml = model.toXml();
		
		assertEquals(model.valideXml(xml, model.getXmlSchema()), true);
	}

	public void testValideJson() {
		Instancia instacia = new Instancia();
		AreaGeograficaDTO model = instacia.areaGeografica();
		String json = model.toJson();
		
		assertEquals(model.valideJson(json, model.getJsonSchema()), true);
	}
}
