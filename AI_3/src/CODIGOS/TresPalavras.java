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
public class TresPalavras {
    public static void Tres_Frases(String p1, String p2, String p3){
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        if(p1.equals("oi") || (p1.equals("Oi")) || (p1.equals("OI"))){//OI
            if(p2.equals("tudo") || (p2.equals("Tudo")) || (p2.equals("TUDO"))){//TUDO
                if(p3.equals("bom") || (p3.equals("Bom")) || (p3.equals("BOM"))){
                    
                    CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"Tudo ótimo Ismael");
                    
                }}}
        else
        {
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+p1+" "+p2+" "+p3+" ???");
        }
    }
}