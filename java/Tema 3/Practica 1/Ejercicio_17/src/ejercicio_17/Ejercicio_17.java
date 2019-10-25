/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_17;

import javax.swing.JOptionPane;
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombrealto = null;
        String nombrebajo=null;
        String nombre=null;
        float nota;
        float notaalta=0;
        float notabaja=10;
        
        for(int alumnos=1;alumnos<=40;alumnos++)
        {
            nombre=JOptionPane.showInputDialog(null,"Nombre?");
            nota=Float.parseFloat (JOptionPane.showInputDialog(null, "Nota?"));
            
            if (nota>notaalta)
            {
               notaalta=nota;
               nombrealto=nombre;
                }
            
                if(nota<notabaja)
                    notabaja=nota;
                nombrebajo=nombre;
        }
        JOptionPane.showMessageDialog(null,nombrealto+"Tiene la nota mas alta con un "+notaalta+" y "+nombrebajo+" la mas baja con un "+notabaja);
    }
    
}
