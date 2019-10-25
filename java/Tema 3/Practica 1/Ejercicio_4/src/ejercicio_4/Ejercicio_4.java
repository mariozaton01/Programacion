/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import javax.swing.JOptionPane;
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1;
        String n2;
        
        n1= JOptionPane.showInputDialog(null, "Introduce la medida de la diagonal mayor");
        n2= JOptionPane.showInputDialog(null,"Introduce la medida de la diagonal menor");
        
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        float area;
        area=num1*(num2/2);
        
        JOptionPane.showMessageDialog(null, "El area es " +area);
        
        
                
    }
    
}
