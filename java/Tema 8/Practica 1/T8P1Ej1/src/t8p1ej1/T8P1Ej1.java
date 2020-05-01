/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1ej1;

/**
 *
 * @author mario
 */
public class T8P1Ej1 {
    
    private static Ventana v;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        v= new Ventana();
        v.setVisible(true);
    }
    public static void salir(){
        v.dispose();
        System.exit(0);
    }
    
}
