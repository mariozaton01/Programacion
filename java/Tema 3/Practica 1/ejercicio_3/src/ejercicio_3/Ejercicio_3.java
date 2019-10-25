/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1;
        String n2;
        
        n1= JOptionPane.showInputDialog(null, "Introduce la medida de la base");
        n2= JOptionPane.showInputDialog(null, "Introduce la medida de la altura");
        
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        float perimetro;
        perimetro=num1*num2;
        
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es "+perimetro);
        
    }
    
}
