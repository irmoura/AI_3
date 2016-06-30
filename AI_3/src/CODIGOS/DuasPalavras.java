/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.IOException;

/**
 *
 * @author Ibyte
 */
public class DuasPalavras {
    public static void Duas_Frases(String p1, String p2) throws IOException{
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        if(
          (p1.equals("que")) || (p1.equals("Que")) || (p1.equals("QUE"))
          ){
            if(
          (p2.equals("horas")) || (p2.equals("Horas")) || (p2.equals("HORAS"))
            ){
                CODIGOS.UmaPalavra.Uma_Frase("horas");
            }
        }
        else
        {
            CODIGOS.Memoria.verificaFrase(""+p1+" "+p2);
        }
    }
}