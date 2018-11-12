package br.ufg.inf.mf.pratica.dto;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

public class App 
{
    public static void main( String[] args ) throws JAXBException, FileNotFoundException
    {
        CertidaoDTO certidaoTo = new CertidaoDTO();
        certidaoTo.setIdentificador("Certidão 1");
        certidaoTo.setTipo(2);
        certidaoTo.setCartorio("Cartório 1");
        certidaoTo.setLivro(91292);
        certidaoTo.setFolha(828);
        certidaoTo.setTermo(19239);
        
    	String json = certidaoTo.toJson();
        System.out.println(json);
        
        String xml = certidaoTo.toXml();
        System.out.println(xml);
        
    	CertidaoDTO certidaoByJson = new CertidaoDTO();
    	certidaoByJson = (CertidaoDTO) certidaoByJson.fromJson(json);
        System.out.println(certidaoByJson.getLivro());
        
        CertidaoDTO certidaoByXml = new CertidaoDTO();
        certidaoByXml = (CertidaoDTO) certidaoByXml.fromXml(xml);
        System.out.println(certidaoByXml.getIdentificador());
    }
}
