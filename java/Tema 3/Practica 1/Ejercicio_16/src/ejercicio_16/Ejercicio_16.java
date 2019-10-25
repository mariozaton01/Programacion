/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;

import javax.swing.JOptionPane;
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float edadtotal=0;
        float promedio;
        String continuar;
                do {
            float edad= Float.parseFloat(JOptionPane.showInputDialog(null, "Edad?"));
            
            edadtotal= edadtotal +edad;
           continuar =  JOptionPane.showInputDialog(null, "Desea continuar?");
        } while (continuar.equals("si"));
        
        
        promedio=edadtotal/2;
        JOptionPane.showMessageDialog(null, "El promedio es"+promedio);  
        }
        
    }
    

