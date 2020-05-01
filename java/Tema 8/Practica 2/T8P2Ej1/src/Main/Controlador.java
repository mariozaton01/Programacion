/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Ventana.VentanaCalculadora;

/**
 *
 * @author mario
 */ 
public class Controlador {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaCalculadora ventana= new VentanaCalculadora();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Calculadora");
    }
    
    public static boolean hayDecimal(String cadena) {
        boolean resultado=false;
        for(int x=0;x<cadena.length();x++){
            if(cadena.substring(x, +1).equals(".")){
                resultado=true;
            }
        }
        return resultado;
    }
    /*public static void sumar(String num1, String signo, String resultado) {
        if(!resultado.isEmpty()){
            num1=resultado;
            signo="+"; 
            resultado="";
        }
    }

    public static void restar(String num1, String signo, String resultado) {
        if(!resultado.isEmpty()){
                    num1=resultado;
                    signo="-";
                           
        } 
    }
*/
    public static String calculadora(String num1, String num2, String signo) {
        Double resultado=0.0;
        String respuesta="";
        
        if(signo.equals("+")){
            resultado=Double.parseDouble(num1)+Double.parseDouble(num2);
        }
        if(signo.equals("-")){
            resultado=Double.parseDouble(num1)-Double.parseDouble(num2);
        }
        if(signo.equals("*")){
            resultado=Double.parseDouble(num1)*Double.parseDouble(num2);
        }
        if(signo.equals("/")){
            resultado=Double.parseDouble(num1)/Double.parseDouble(num2);
        }
        respuesta=resultado.toString();
        return respuesta;
    }

   /* public static void multiplicar(String num1, String signo, String resultado) {
        if(!resultado.isEmpty()){
                    num1=resultado;
                    signo="*";                        
        }
    }

    public static void dividir(String num1, String signo, String resultado) {
        if(!resultado.isEmpty()){
                    num1=resultado;
                    signo="/";      
        }
    }
*/
    
}
