/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

import javax.swing.JOptionPane;
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s;
        s=0;
        for(int suma=0;suma<=10;suma++)
        {
            
            int n= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));
            
            s=s+n;
            JOptionPane.showMessageDialog(null, s);
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
}
