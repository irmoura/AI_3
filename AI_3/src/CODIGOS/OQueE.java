package CODIGOS;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibyte
 */
public class OQueE {
    
    public static String frase;
    
    public static void informador(String texto_usuario){
        
        String cores[] = {"amarelo","vermelho","azul"};//,"verde","preto","rosa","marrom","cinza","laranja"};
        //String animais[] = {"cachorro","gato","boi","vaca","coelho","baleia","macaco","peixe","urso"};
        //String vogais[] = {"a","e","i","o","u"};
        //String consoantes[] = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        //String artigos_definidos[] = {"o","a","os","as"};
        //String artigos_indefinidos[] = {"um","uma","uns","umas"};
        
        int total = cores.length;/*+animais.length+vogais.length+
        consoantes.length+artigos_definidos.length+artigos_indefinidos.length*/;
        
        String frase_recebida = texto_usuario.replace(" ",";");
            String[] s = frase_recebida.split(";");
            
            String[] palavras_separadas = new String[total];//s.length
        
            for(int j = 0; j < s.length; j++){
            palavras_separadas[j] = s[j];
            }
        JOptionPane.showMessageDialog(null,""+palavras_separadas[0]);
        /*for(int i=0; i<cores.length; i++){
            frase = cores[i]; 
            if(frase.equals(palavras_separadas[i])){
                JOptionPane.showMessageDialog(null,"Cor "+frase+" encontrada na frase");
                i = cores.length;
            }
        }*/
        /*for(int i=0; i<vogais.length; i++){
            frase = vogais[i];
             if(frase.equals(texto_usuario)){
                JOptionPane.showMessageDialog(null,"Vogal "+frase+" encontrada na frase");
                i = vogais.length;
            }
        }*/ 
        /*for(int i=0; i<animais.length; i++){
            frase = animais[i]; 
            if(frase.equals(texto_usuario)){
                JOptionPane.showMessageDialog(null,"Animal "+frase+" encontrada na frase");
                i = animais.length;
            }
        }*/ 
    }
}