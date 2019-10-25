/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_1;

import javax.swing.JOptionPane;
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra=JOptionPane.showInputDialog("Introduce una palabra");
        int vocales=0;
        
        
        for(int x=0;x<palabra.length();x++) {
            if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='e') || (palabra.charAt(x)=='i') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='u'))
            {
                 vocales++;
             }
}
        JOptionPane.showMessageDialog(null, palabra+" tiene "+ vocales+ " vocales");
        
        
        
    }
    
}
