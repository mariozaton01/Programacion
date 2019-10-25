/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import javax.swing.JOptionPane;
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
        int b= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro numero")); 
        int c= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un último numero"));
        
        if (a>b && b>c)
            JOptionPane.showMessageDialog(null, a+">"+b+">"+c);
            else
                if (a>c && c>b)
                    JOptionPane.showMessageDialog(null, a+">"+c+">"+b);
                    else
                        if (b>a && a>c)
                            JOptionPane.showMessageDialog(null, b+">"+a+">"+c);
                            else
                                if (b>c && c>a)
                                    JOptionPane.showMessageDialog(null, b+">"+c+">"+a);
                                    else
                                        if (c>a && a>b)
                                            JOptionPane.showMessageDialog(null, c+">"+a+">"+b);
                                            else
                                                if (c>b && b>a)
                                                    JOptionPane.showMessageDialog(null, c+">"+b+">"+a);
                                                
                    
           
    }
    
}
