/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import javax.swing.JOptionPane;
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1;
        String n2;
       n1= JOptionPane.showInputDialog("Introduce un número");
       n2= JOptionPane.showInputDialog("Introduce un segundo número");
        
        float num1= Float.parseFloat(n1);
        float num2=Float.parseFloat(n2);
        float resultado;
        resultado= num1*num2;
        
        JOptionPane.showMessageDialog(null,resultado);
        
    }
    
}
