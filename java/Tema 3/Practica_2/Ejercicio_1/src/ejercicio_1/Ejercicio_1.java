/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import javax.swing.JOptionPane;
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estado, estudios;
        int sueldo;
        int hora;
        int horaextra;
        int horas= Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas horas has trabajado"));
        int horasextra=0;
        if (horas>40)
        {
            horasextra=horas-40;
            horas=40;
        }
        hora=horas*10;
        horaextra=horasextra*15;
        
        estado=JOptionPane.showInputDialog(null, "¿Cual es su estado civil?");
        estudios=JOptionPane.showInputDialog(null, "¿Que estudios tiene?");
        
        sueldo= hora +horaextra;
        if (estado.equalsIgnoreCase("soltero") && estudios.equalsIgnoreCase("Primario") || (estado.equalsIgnoreCase("viudo") && estudios.equalsIgnoreCase("superior")) || (estado.equalsIgnoreCase("soltero")&& estudios.equalsIgnoreCase("medio")) ||(estado.equalsIgnoreCase("casado")&& estudios.equalsIgnoreCase("superior"))||(estado.equalsIgnoreCase("viudo")&& estudios.equalsIgnoreCase("primario"))||(estado.equalsIgnoreCase("soltero")&& estudios.equalsIgnoreCase("superior"))||(estado.equalsIgnoreCase("divorciado")&& estudios.equalsIgnoreCase("superior")))
        {
            sueldo=sueldo+100;
            
        }
        JOptionPane.showMessageDialog( null, "Su sueldo es de "+sueldo+" €" );
                
    }
    
}
