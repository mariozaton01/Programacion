/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6p3ej1;

/**
 *
 * @author 1GDAW08
 */import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

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
        Pattern numEntero= Pattern.compile("^-?[0-9]+$");
        Matcher m= numEntero.matcher(texto);
        return m.matches();
    }
}
