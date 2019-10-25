/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_18;

import javax.swing.JOptionPane;
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int p=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos numeros de la serie quieres"));
       int s=1;
       int suma=0;
       int anterior;
       
       for ( int cont=p;cont>0;cont--)
       {
           anterior=s;
           s=suma;
           suma=s+anterior;
           
            
       }
          JOptionPane.showMessageDialog(null, suma);
       
       
    }
    
}
