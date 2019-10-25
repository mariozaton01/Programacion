/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_2;

/**
 *
 * @author 1GDAW07
 */import javax.swing.JOptionPane;
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder cadena= new StringBuilder();
        String palabrainvertida= "";
        
        String palabra=JOptionPane.showInputDialog(null, "Escribe una palabra");
        for (int x=palabra.length()-1;x>=0;x--){
		 palabrainvertida = palabrainvertida + palabra.charAt(x);
        }
        JOptionPane.showMessageDialog(null,palabrainvertida);
    }
    
}
