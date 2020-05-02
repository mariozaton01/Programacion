/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Coche;
import Ventanas.VentanaMultas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Controlador {

    /**
     * @param args the command line arguments
     * 
     */private static ArrayList <Coche> listaCoches;
      private static VentanaMultas multas;
      private static Coche c;
    public static void main(String[] args) {
        // TODO code application logic here
        multas= new VentanaMultas();
        multas.setVisible(true);
        multas.setLocationRelativeTo(null);
        multas.setTitle("Multas");
        
        crearCoche();
    }

    private static void crearCoche() {
         c= new Coche();
        c.setNombre("Carlos");
        c.setDNI("123456789T");
        c.setMarca("Audi");
        c.setModelo("R8");
        c.setMatricula("AABB1122");
        c.setColor("Azul");
        
        listaCoches = new ArrayList();
        listaCoches.add(c);
        
        c = new Coche();
        c.setNombre("Marcos");
        c.setDNI("213456789R");
        c.setMarca("Volvo");
        c.setModelo("S60");
        c.setMatricula("HGTY4352");
        c.setColor("Verde");
        listaCoches.add(c);
        
        c = new Coche();
        c.setNombre("Maria");
        c.setDNI("987654321U");
        c.setMarca("Ford");
        c.setModelo("Focus");
        c.setMatricula("MMWW3443");
        c.setColor("Gris");
        listaCoches.add(c);      
    }

    public static void mostrarCoche(String matricula,String numMulta, String tipoMulta) {
        try{
            if(!matricula.isEmpty()){
                int x;
                for( x=0; x<listaCoches.size()&& !matricula.equalsIgnoreCase(listaCoches.get(x).getMatricula()) ;x++){}
                JOptionPane.showMessageDialog(null, listaCoches.get(x).toString()+"\nMulta impuesta: "+numMulta+"-  "+tipoMulta);
            }
            else
                throw new Excepciones.SinDatos();
        }
        catch(Excepciones.SinDatos e){
            JOptionPane.showMessageDialog(null,"Hay campos vacios, rellenalos.");
        }
        
    }

    public static String comprobarCoche(String matricula, String propietario) {
        try{
           int x;
        for(x=0;x<listaCoches.size()&& !matricula.equalsIgnoreCase(listaCoches.get(x).getMatricula()) ;x++){}
            if(x<listaCoches.size()){
                propietario=listaCoches.get(x).getNombre();
            }
            if(matricula.isEmpty())
                throw new Excepciones.SinDatos();
            if(!matricula.equalsIgnoreCase(listaCoches.get(x).getMatricula()))
                throw new Exception();
                                        
        }
        catch(Excepciones.SinDatos e){
            JOptionPane.showMessageDialog(null, "Rellena el campo de la matricula por favor");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "No coincide la matricula con ninguna matricula de nuestros coches registrados.\nIntentalo de nuevo");
        }
        return propietario;
    }

    public static void mostrarMulta() {
        JOptionPane.showMessageDialog(null, "10:  Exceso de velocidad.\n20:  Hablar por telefono.\n30:  No llevar cinto.");
    }

    public static String mostrarTipoMulta( String numMulta, String tipoMulta) {
        
        if(Integer.parseInt(numMulta)==10)
            tipoMulta="Exceso de velocidad";
        
        if(Integer.parseInt(numMulta)==20)
            tipoMulta="Hablar por telefono";
        
        if(Integer.parseInt(numMulta)==30)
            tipoMulta="No llevar cinto";
         return tipoMulta;
         
    }
        
        
    }
    
    

