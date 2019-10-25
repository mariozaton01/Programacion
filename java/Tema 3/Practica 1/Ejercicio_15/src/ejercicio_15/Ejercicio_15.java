/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;

import javax.swing.JOptionPane;
public class Ejercicio_15 {

    
    public static void main(String[] args) {
        int alumnosaprobados=0;
        String respuesta;
        do {
            String nombre= JOptionPane.showInputDialog(null, "Nombre?");
            float nota= Float.parseFloat(JOptionPane.showInputDialog(null, "Nota?"));
            if (nota>=6)
                alumnosaprobados++;
            respuesta=JOptionPane.showInputDialog(null, "Desea continuar?");
        } while (respuesta.equalsIgnoreCase("si")==false && !respuesta.equalsIgnoreCase ("no"));
       
        JOptionPane.showMessageDialog(null, "hay"+alumnosaprobados+"Alumnos aprobados");
    }
    
}
