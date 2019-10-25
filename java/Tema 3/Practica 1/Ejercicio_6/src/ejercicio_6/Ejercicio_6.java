/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import javax.swing.JOptionPane;
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String R= JOptionPane.showInputDialog(null," Introduce el radio de la circunferencia para conocer su area");
        double r= Float.parseFloat(R);
        double area= Math.PI*r*r;
        JOptionPane.showMessageDialog(null, " El AREA ES"+ area);
    }
    
}
