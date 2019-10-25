/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

import javax.swing.JOptionPane;

public class Ejercicio_13 {

    public static int sexo, contchico=0, contchica=0;
    public static void main(String[] args) {
        
        
        for (int cont=0;cont<3;cont++)
        {
            sexo=Integer.parseInt(JOptionPane.showInputDialog(null, "sexo:  1 para hombre,  2 para mujer"));
        if (sexo==1){
            contadorchico();
                    {
                        
    }
        }
        else{
            contadorchica();
            {
        
    }
    }
        }
        JOptionPane.showMessageDialog(null, "Hay " + contchico + "chicos aptos y" + contchica + "chicas aptas");
        }
       public static void contadorchico(){
               
    String nombre=JOptionPane.showInputDialog(null, "Nombre?");
    int edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Edad?"));
    float peso= Float.parseFloat(JOptionPane.showInputDialog(null, "Peso?"));
    float altura=Float.parseFloat(JOptionPane.showInputDialog( null, "Altura?"));
    
    if(altura>1.70 && peso>70)
        contchico++;
    
}
public static void contadorchica (){
           
    String nombre=JOptionPane.showInputDialog(null, "Nombre?");
    int edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Edad?"));
    float peso=Float.parseFloat(JOptionPane.showInputDialog(null, "Peso?"));
    float altura=Float.parseFloat(JOptionPane.showInputDialog( null, "Altura?"));
    
    if(altura>1.60 && peso>60)
        contchica++;
} 
}
