/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Calculos_Diretos {
    
    static String operador_procurado, Depois, Antes;
    static int antes_do_operador, depois_do_operador, depois, antes;
    
    public static void Calculo(){
        
        String tela_da_conversa = CODIGOS.Tela.TEXTO_CONVERSA.getText();
        
        String calculo = CODIGOS.Tela.TEXTO_USUARIO.getText();
        
        if(calculo.contains("+")){
            operador_procurado = "+";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        else
        if(calculo.contains("-")){
            operador_procurado = "-";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Depois = Depois.replace("-","");
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        else
        if(calculo.contains("*")){
            operador_procurado = "*";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Depois = Depois.replace("*","");
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        else
        if(calculo.contains("/")){
            operador_procurado = "/";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Depois = Depois.replace("/","");
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        
        if(calculo.contains("+")){
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"O resultado de "+antes_do_operador+" mais "+depois_do_operador+" é "+
            (antes_do_operador+depois_do_operador));
        }
        else
        if(operador_procurado.contains("-")){
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"O resultado de "+antes_do_operador+" menos "+depois_do_operador+" é "+
            (antes_do_operador-depois_do_operador));
        }
        else
        if(operador_procurado.contains("*")){
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"O resultado de "+antes_do_operador+" vezes "+depois_do_operador+" é "+
            (antes_do_operador*depois_do_operador));
        }
        else
        if(operador_procurado.contains("/")){
            CODIGOS.Tela.TEXTO_CONVERSA.setText(""+tela_da_conversa+"\nPC : "+"O resultado de "+antes_do_operador+" dividido "+depois_do_operador+" é "+
            (antes_do_operador/depois_do_operador));
        }
        
}
    
}