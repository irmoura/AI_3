/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import static CODIGOS.Tela.TEXTO_USUARIO;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author Ibyte
 */
public class UmaPalavra { 
    public static void Uma_Frase(String p1) throws IOException{
        
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR);
        int minuto = calendario.get(Calendar.MINUTE);
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        if(p1.equals("horas") || p1.equals("Horas") || p1.equals("HORAS")){
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"São "+hora+" e "+minuto+" Mael");
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