/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import javax.swing.JOptionPane;
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String n1;
      
        n1= JOptionPane.showInputDialog(null, "Introduce la temperatura en grados centígrados");
        double C= Float.parseFloat (n1);
        
        double F=1.8*C+32;
        JOptionPane.showMessageDialog(null, "La temperatura es"+ F+ "Fº");
    }

   
    }
    

