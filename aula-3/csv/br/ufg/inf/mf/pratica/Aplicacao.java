package br.ufg.inf.mf.pratica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Aplicacao {

    public static void main(String[] args) throws MalformedURLException, IOException {
        
        String defaultUrl = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";
        
        URL stockURL = new URL(defaultUrl);
        BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));
        String s = null;
        int fromTo = 0;
        Set<String> states = new HashSet<String>();
        
        
        while ((s=in.readLine())!=null) {
            if(fromTo > 10) {
                String[] content = s.split(";");
                if(content.length > 8 && content[8] != null) {
                    states.add(content[8]);
                }
            }
            fromTo++;
        }

        System.out.println(states.toString());
    }    
}

