/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import javax.swing.JOptionPane;
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1= JOptionPane.showInputDialog(null, "Introduce la longitud del cateto mayor");
        String n2= JOptionPane.showInputDialog(null, "Introduce la longitud del cateto menor");
        
        double C= Double.parseDouble(n1);
        double c= Double.parseDouble(n2);
        double h=Math.pow( C, 2)+ Math.pow(c, 2);
        JOptionPane.showMessageDialog(null," La hipotenusa es"+ h);
    }
    
}
