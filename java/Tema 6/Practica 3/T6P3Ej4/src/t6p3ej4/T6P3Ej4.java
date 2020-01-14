/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class T6P3Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato=JOptionPane.showInputDialog("Introduce un DNI");
        boolean condicion= true;
        
        do{
            Pattern dni=Pattern.compile("^[0-9]{8}[A-Z]{1}$");
            Matcher m = dni.matcher(dato);
            
           if(!m.matches()){
               JOptionPane.showMessageDialog(null,"NO es un DNI");
           }
           else
               JOptionPane.showMessageDialog(null,"Es un DNI");
           condicion=false;
        }
        while(condicion);
        
    }
    
}
