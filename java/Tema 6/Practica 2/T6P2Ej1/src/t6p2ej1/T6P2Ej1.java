/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2ej1;

import Clases.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class T6P2Ej1 {

    /**
     * @param args the command line arguments
     */private static Estudio[] listaEstudios = new Estudio[5];
     private static ArrayList<Pelicula> listaPeliculas;
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        crearEstudio();
        crearPeli();
        pedirPeliMasLarga();
        pedirEstudioConMasPelis();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
                
       
    }
    public static void crearEstudio()throws Exception{
        
        SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy");
        
        ArrayList<String> telefonos= new ArrayList();
        telefonos.add("111112");
        telefonos.add("222221");
        
        listaEstudios[0]= new Estudio("Universal", "Los Angeles"," C/ a","www.universal.es",formato.parse("1950-09-23"),"EEUU",telefonos);
        
         telefonos= new ArrayList();
         telefonos.add("33332");
         telefonos.add("222232");
         listaEstudios[1]= new Estudio("Walt Disney", "Los Angeles"," C/ b","www.disney.es",formato.parse("1960-09-23"),"EEUU",telefonos);
         
         telefonos=new ArrayList();
         telefonos.add("33334");
         telefonos.add("444443");
         listaEstudios[2]= new Estudio("Paramount", "Los Angeles"," C/ d","www.paramount.es",formato.parse("1955-09-23"),"EEUU",telefonos);
         
         telefonos.add("444454");
         telefonos.add("5555545");
         listaEstudios[3]=new Estudio("20Th Century Fox", "Los Angeles"," C/ e","www.fox.es",formato.parse("1953-09-23"),"EEUU",telefonos);
        
    }
    public static void crearPeli() throws Exception{
        listaPeliculas =new ArrayList();
        
        //Creacion de las peliculas:
        
      
        ArrayList<Estudio> lista= new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[1]);
        Pelicula p= new Pelicula( "ET", 1980, 87, "Infantil", lista);
        listaPeliculas.add(p);
        
        
        lista=new ArrayList();
        lista.add(listaEstudios[2]);
        p=new Pelicula ("El Señor De Los Anillos", 2001, 203, "Fantasia", lista);
        listaPeliculas.add(p);
        
        lista=new ArrayList();
        lista.add(listaEstudios[3]);
        p=new Pelicula("Titanic", 1997, 120, "Romantico", lista);
        listaPeliculas.add(p);
        
    }
    public static void pedirPeliMasLarga() throws Exception{
        float maxDuracion=0;
        String peli="";
        
        
        for(int x=0;x<listaPeliculas.size() && listaPeliculas.get(x).getDuracion()>maxDuracion;x++){
            
                maxDuracion=listaPeliculas.get(x).getDuracion();
                peli=listaPeliculas.get(x).toString();
    
        }
       
    
       String mensaje="";
       for(int x=0;x<listaPeliculas.size() && listaPeliculas.get(x).getDuracion() !=maxDuracion;x++){
           for(int y=0; y<listaPeliculas.get(x).getLista().size();y++)
           mensaje=peli+"\nProducida por: "+ listaPeliculas.get(x).getLista().get(x).getNombre();
       }
       JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static void pedirEstudioConMasPelis()throws Exception{
        
    }
}
