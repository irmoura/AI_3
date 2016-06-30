/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author Ibyte
 */
public class UmaPalavra {
    
    public static String dia_da_semana;
    
    public static void Uma_Frase(String p1) throws IOException{
        
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR);
        int minuto = calendario.get(Calendar.MINUTE);
        int dia = calendario.get(Calendar.DAY_OF_WEEK);
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        if(p1.equals("horas") || p1.equals("Horas") || p1.equals("HORAS")){
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"São "+hora+" e "+minuto+" "+CODIGOS.Tela.nome);
        }
        else
        if(p1.equals("dia")){
            switch (dia) {
        case 1:
            dia_da_semana = "Domingo";
            break;
        case 2:
            dia_da_semana = "Segunda-Feira";
            break;
        case 3:
            dia_da_semana = "Terça-Feira";
            break;
        case 4:
            dia_da_semana = "Quarta-Feira";
            break;
        case 5:
            dia_da_semana = "Quinta-Feira";
            break;
        case 6:
            dia_da_semana = "Sexta-Feira";
            break;
        case 7:
            dia_da_semana = "Sábado";
            break;
        default:
            break;
            }
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"Hoje é "+dia_da_semana+" "+CODIGOS.Tela.nome);
        }
        else
        if((p1.contains("-")) || 
           (p1.contains("+")) || 
           (p1.contains("*")) || 
           (p1.contains("/")))
            {
            CODIGOS.Calculos_Diretos.Calculo();
            }
        else
        {
            CODIGOS.Memoria.verificaFrase(p1);
        }
    }
}