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
public class DuasPalavras {
    public static void Duas_Frases(String p1, String p2){
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        if(
          (p1.equals("bom")) || (p1.equals("Bom")) || (p1.equals("BOM"))
          ){
            if(
          (p2.equals("dia")) || (p2.equals("Dia")) || (p2.equals("DIA"))
            ){
                CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"Bom dia Ismael");
            }
        }
        else
        {
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+p1+" "+p2+" ???");
        }
    }
}