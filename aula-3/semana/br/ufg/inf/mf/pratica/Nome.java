package br.ufg.inf.mf.pratica;

import java.time.LocalDate;
import java.util.Locale;

class Nome {
  public static void main(String[] args) {
        
        String defaultLanguage = Locale.getDefault().getLanguage();
        String defaultDay;
        
        if(defaultLanguage == "pt") {
            String[] dayOfWeekInPortuguese = new String[10];
            
            dayOfWeekInPortuguese[0] = "Segunda-feira";
            dayOfWeekInPortuguese[1] = "Terça-feira";
            dayOfWeekInPortuguese[2] = "Quarta-feira";
            dayOfWeekInPortuguese[3] = "Quinta-feira";
            dayOfWeekInPortuguese[4] = "Sexta-feira";
            dayOfWeekInPortuguese[5] = "Sábado";
            dayOfWeekInPortuguese[6] = "Domingo";
            
            int day = LocalDate.now().getDayOfWeek().getValue();
            defaultDay = dayOfWeekInPortuguese[day - 1];
        } else { 
            defaultDay = LocalDate.now().getDayOfWeek().name();
        }
        
        System.out.println(defaultDay);
    }
}

