/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p1ej1;

import javax.swing.JOptionPane;
import t6p1ej1.Clases.Circulo;

/**
 *
 * @author 1GDAW08
 */
public class T6P1Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r= Double.parseDouble(JOptionPane.showInputDialog("Introduce el readio del circulo"));
    Circulo c= new Circulo();
    c.setRadio(r);
    
    JOptionPane.showMessageDialog(null,"Datos:\n" + "\n Longitud: "+ c.getLongitud()+"\n"  + "Area: "+ c.getArea()+"\n" + "Volumen "+ c.getVolumen());
    }
    
}
