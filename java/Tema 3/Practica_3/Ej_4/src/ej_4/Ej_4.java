/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 1GDAW07
 */import javax.swing.JOptionPane;
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String fechaString =JOptionPane.showInputDialog(null, "Teclea una fecha dd/MM/yyyy");
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
        Date fechaUno = formato.parse(fechaString);
    
         fechaString=JOptionPane.showInputDialog(null, "Teclea una fecha dd/MM/yyyy");
         Date fechaDos= formato.parse(fechaString);
         
         Long milisegundos=fechaUno.getTime()- fechaDos.getTime();
         Long dias= milisegundos/86400000;
         JOptionPane.showMessageDialog(null, "La diferencia entre "+ fechaUno+ " y "+fechaDos+" es de "+dias+ "dias");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas"+ e.getClass());
        }
    }
        
    
}
