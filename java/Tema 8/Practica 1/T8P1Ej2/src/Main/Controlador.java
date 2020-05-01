package Main;


import Ventanas.*;
import Clases.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */ private static VentanaListaPersonas vLista;
     private static VentanaRegistroPersonas vRegistro;
     
     private static ArrayList<Personas> listaPersonas;
     
     private static String mensaje="";
    public static void main(String[] args) {
        // TODO code application logic here
        
        vRegistro= new VentanaRegistroPersonas();
        vRegistro.setVisible(true);
        vRegistro.setLocationRelativeTo(null);
        
    }

    public static void cambiarVentana() {
        vLista= new VentanaListaPersonas();
        vLista.setVisible(true);
        vLista.setLocationRelativeTo(null);
        vRegistro.setVisible(false);
    }

    public static void AnadirPersona(String nombre, String apellido, String dni) {
        
       Personas p = new Personas();
       p.setDNI(dni);
       p.setApellido(apellido);
       p.setNombre(nombre);
       
       listaPersonas= new ArrayList();
       listaPersonas.add(p);
       
       mensaje += p.toString() +"\n";
    }

    public static String mensaje() {
        return mensaje;
    }
    
}
