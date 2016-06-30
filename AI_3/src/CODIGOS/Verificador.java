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
public class Verificador {
    
    public static void resposta(String frase_usuario) throws IOException{
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        if(!frase_usuario.equals("")){
            
        String frase = frase_usuario.replace(" ",";");
            String[] s = frase.split(";");
            
            String[] palavras_separadas = new String[s.length];
        
            for(int j = 0; j < s.length; j++){
            palavras_separadas[j] = s[j];
            }
        
    switch (s.length) {
        case 1:
            UmaPalavra.Uma_Frase(palavras_separadas[0]);
            break;
        case 2:
            DuasPalavras.Duas_Frases(palavras_separadas[0], palavras_separadas[1]);
            break;
        case 3:
            TresPalavras.Tres_Frases(palavras_separadas[0], palavras_separadas[1], palavras_separadas[2]);
            break;
        default:
            break;
            }
        }
        else{
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"???");
        }
    }
}