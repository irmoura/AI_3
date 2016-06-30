/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Memoria {
    
    public static void verificaFrase(String TEXTO_USUARIO) throws IOException{
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        File dir = new File(CODIGOS.Diretorio.letra+":\\"+CODIGOS.Diretorio.pasta_do_programa+"\\Perguntas");
        
        File arq = new File(dir,CODIGOS.Tela.TEXTO_USUARIO.getText()+".txt");
        
        try {
            
            FileReader fileReader = new FileReader(arq);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String Resposta = bufferedReader.readLine();
            
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+Resposta+" "+CODIGOS.Tela.nome);
             
        }//FIM ARQUIVO ENCONTRADO
//FIM ARQUIVO NAO ENCONTRADO
         catch (FileNotFoundException ex) {//INICIO ARQUIVO NAO ENCONTRADO
            
            try {
                arq.createNewFile();
            } catch (IOException ex1) {
                Logger.getLogger(Memoria.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
            FileWriter Obs = null;
            
            try {
            Obs = new FileWriter(CODIGOS.Diretorio.letra+":\\"+CODIGOS.Diretorio.pasta_do_programa+"\\Perguntas\\"+CODIGOS.Tela.TEXTO_USUARIO.getText()+".txt");
        } catch (IOException exe) {
            Logger.getLogger(Memoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+CODIGOS.Tela.TEXTO_USUARIO.getText()+" ???");
        
        String resposta = JOptionPane.showInputDialog(null,"Digite uma resposta para essa pergunta: ","AI_3",JOptionPane.QUESTION_MESSAGE);
        
        PrintWriter gravarArq = new PrintWriter(Obs); 
        {
              gravarArq.println(resposta);//LINHA DA RESPOSTA
 
        }
        try {
            Obs.close();
        } catch (IOException exi) {
            Logger.getLogger(Memoria.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }//FIM ARQUIVO NAO ENCONTRADO        catch (IOException ex) {
            
            //Logger.getLogger(GUI_Principal.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
}