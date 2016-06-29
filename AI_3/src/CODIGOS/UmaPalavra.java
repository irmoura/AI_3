/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

/**
 *
 * @author Ibyte
 */
public class UmaPalavra {
    public static void Uma_Frase(String p1){
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        if(
          (p1.equals("oi")) || (p1.equals("Oi")) || (p1.equals("OI")) || 
          (p1.equals("olá")) || (p1.equals("Olá")) || (p1.equals("OLÁ")) || 
          (p1.equals("ola")) || (p1.equals("Ola")) || (p1.equals("OLA"))
          ){
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"Olá Ismael");
        }
        else
        {
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+p1+" ???");
        }
    }
}