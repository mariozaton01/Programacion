/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import javax.swing.JOptionPane;
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String n1= JOptionPane.showInputDialog(null, "Introduce tu nota");
       double nota= Double.parseDouble (n1);
       if (nota<=4)
       JOptionPane.showMessageDialog(null, "Insuficiente");
       else
           if(nota>=5 && nota<7)
       JOptionPane.showMessageDialog(null, "Bien");
                else
                    if(nota>7 && nota<9)
                        JOptionPane.showMessageDialog(null, "notable");
                         else
                            if(nota>=9 && nota<=10)
                                JOptionPane.showMessageDialog(null, "Sobresaliente");
         
       
       
    }
    
}
