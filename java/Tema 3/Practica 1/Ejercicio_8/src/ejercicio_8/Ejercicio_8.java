/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import javax.swing.JOptionPane;
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1= JOptionPane.showInputDialog(null, " Introduce tu nota");
        float nota= Float.parseFloat(n1);
        if (nota>=5 && nota<=10)
            JOptionPane.showMessageDialog(null, "Estas aprobado");
        else JOptionPane.showMessageDialog(null, "Estas suspendido");
       
        
    }
    
}
