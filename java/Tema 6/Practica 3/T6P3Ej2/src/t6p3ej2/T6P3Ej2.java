/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class T6P3Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato= JOptionPane.showInputDialog("Teclea un numero entero");
        if(validarNumeroEntero(dato))
            JOptionPane.showMessageDialog(null, "Dato correcto");
        else
            JOptionPane.showMessageDialog(null, "Dato incorrecto");
        
    }
    public static boolean validarNumeroEntero(String texto){
        Pattern numEntero= Pattern.compile("^[0-9]+$");
        Matcher m= numEntero.matcher(texto);
        return m.matches();
    }
    
}
