/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2ej4;

import Clases.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class T6P2Ej4 {

    /**
     * @param args the command line arguments
     */public static ArrayList <Avion> listaAviones;
     public static ArrayList<Vuelo> listaVuelos;
     public static ArrayList <Piloto> listaPilotos;
     public static ArrayList<Asiento> listaAsientos;
     public static ArrayList<Pasajero> listaPasajeros;
     public static ArrayList<Ciudad> listaCiudades;
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        crearAvion();
        crearPiloto();
        crearCiudad();
        crearPasajero();
        crearAsiento();
        crearVuelo();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    public static void crearAvion()throws Exception{
        
        listaAviones=new ArrayList();
        
        Avion av= new Avion( "Highway Airlines", "001", 150, "50");
        listaAviones.add(av);
        
      /*  av=new Avion("American Airlines", "002", 200, "80");
        listaAviones.add(av);
        
        av=new Avion("Turkish Airlines", "003",170, "70");
        listaAviones.add(av);*/
    }
    public static void crearVuelo () throws Exception{
        
        listaVuelos=new ArrayList();
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy"); 
        
        Vuelo vue= new Vuelo(1, "06:00", "17:00", listaCiudades.get(1).getNombre(), listaCiudades.get(1).getNombre(),formatter.parse("12-01-2020"), formatter.parse("25-06-2020"), "Regular");
        vue.setCiuda(listaCiudades.get(0));
        
        listaVuelos.add(vue);
        
      /*  vue= new Vuelo(2, "08:00","21:00","Bilbao","Lisboa", formatter.parse("03-04-2020"),formatter.parse("15-04-2020"),"Low Cost" );
        listaVuelos.add(vue);
        
        vue= new Vuelo(3, "05:00","15:00","Washintong DC", "Paris", formatter.parse("23-02-2020"), formatter.parse("04-02-2020"),"Regular");
        listaVuelos.add(vue);*/
        
    }
    public static void crearPiloto()throws Exception{
        
        listaPilotos=new ArrayList();
        
        Piloto pilo= new Piloto("010","Matias","Prats", 23415);
        listaPilotos.add(pilo);
        
       /* pilo= new Piloto( "012","Pablo", "Motos", 42313);
        listaPilotos.add(pilo);
        
        pilo= new Piloto(" 013","El Hombre","de Negro", 52133);
        listaPilotos.add(pilo);*/
        
    }
    public static void crearAsiento() throws Exception{
        
        listaAsientos=new ArrayList();
        
        Asiento asien=new Asiento(33, true, "17");
        asien.setPasajer(listaPasajeros.get(0));
        listaPasajeros.get(0).setAsient(asien);
        listaAsientos.add(asien);
        
       /* asien=new Asiento(54, false, "23");
        listaAsientos.add(asien);
        
        asien= new Asiento(130,false, "65");
        listaAsientos.add(asien);
        
        asien= new Asiento(78, false, "34");
        listaAsientos.add(asien);
        
        asien= new Asiento( 23, false, "17");
        listaAsientos.add(asien);
        
        asien= new Asiento(143, false, "72");
        listaAsientos.add(asien);*/
        
       
        
    }
    public static void crearPasajero()throws Exception{
        
        listaPasajeros=new ArrayList();
        
        Pasajero pasa= new Pasajero("584935489T","Iker", "Toronto", "Hombre",26);
        listaPasajeros.add(pasa);
        
        /*pasa= new Pasajero("58734785I", "Mikel", "Montoro", "Hombre", 13);
        listaPasajeros.add(pasa);
        
        pasa=new Pasajero("34985347Q", "Moe", "Sislack", "Hombre", 47);
        listaPasajeros.add(pasa);
        
        pasa=new Pasajero("4398548R","Inma", "Culiada","Mujer",53);
        listaPasajeros.add(pasa);
        
        pasa= new Pasajero("4385978H", "Maria","Cala","Mujer",25);
        listaPasajeros.add(pasa);
        
        pasa=new Pasajero ("345346P","Juan","Castillo","Hombre", 32);
        listaPasajeros.add(pasa);*/
        
 
        
    }
    public static void crearCiudad()throws Exception{
        
        listaCiudades=new ArrayList();
        
        Ciudad ciu= new Ciudad("002","Bruselas");
        listaCiudades.add(ciu);
        
        ciu= new Ciudad("003","Nueva York");
        listaCiudades.add(ciu);
        
       /* ciu=new Ciudad("004","Bilbao");
        listaCiudades.add(ciu);

        ciu=new Ciudad("005", "Lisboa");
        listaCiudades.add(ciu);
        
        ciu=new Ciudad("006", "Wshintong DC");
        listaCiudades.add(ciu);

        ciu=new Ciudad("008","Paris");
         listaCiudades.add(ciu);*/



    }
    
    
}
