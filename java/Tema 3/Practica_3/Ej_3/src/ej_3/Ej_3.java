/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_3;

/**
 *
 * @author 1GDAW07
 */import javax.swing.JOptionPane;
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra=JOptionPane.showInputDialog(null,"Escribe una palabra");
        char caracter=JOptionPane.showInputDialog(null, "Que caracter quieres que se muestre?").charAt(0);
        int caracteres=0;
        
       for (int x=0;x<palabra.length();x++){
        if (palabra.charAt(x)==caracter){
            caracteres++;
        
 }
    }
       JOptionPane.showMessageDialog(null, "la palabra "+palabra+" tiene "+caracteres+""+ caracter+"s");                                                                                                                          
    }  
}
