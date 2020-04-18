/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1ej1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import t7p1ej1.Clases.*;

/**
 *
 * @author mario
 */
public class T7P1Ej1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Persona> listaPersonas;
    static ArrayList<Vehiculo> listaVehiculos;
    public static void main(String[] args) {
        // TODO code application logic here
        
        crearPersona();
        crearVehiculo();
        asignarVehiculos();
        personasConMasDeUnVehiculo();
        PersonasMasVehiculos();
        PersonaMasMotos();
        //motoDucate();
    }
    
    public static void crearPersona(){
    Persona p= new Persona();
    p.setNombre("Mikel");
    p.setApellido("Gandia");
    p.setTelefono(945368862);
    p.setDireccion("Calle Castilla");
    
    listaPersonas= new ArrayList();
    listaPersonas.add(p);
    
    p = new Persona();
    p.setNombre("Josu");
    p.setApellido("Redondo");
    p.setTelefono(945703621);
    p.setDireccion("Avenida de los Güetos");
    
    listaPersonas.add(p);
    
    p= new Persona();
    p.setNombre("Jon");
    p.setApellido("Cuadrado");
    p.setTelefono(945755267);
    p.setDireccion("Senda de la Quesería");
    
    listaPersonas.add(p);
    
}
    
    public static void crearVehiculo(){
        //Coches:
        Coche c = new Coche();
        c.setMatricula("ABCS-1234");
        c.setMarca(Marca_Coche.Audi.name());
        
        listaVehiculos= new ArrayList();
        listaVehiculos.add(c);
        
        c = new Coche();
        c.setMarca(Marca_Coche.BMW.name());
        c.setMatricula("TRBW-5788");
        
        listaVehiculos.add(c);
        
        //Motos:
        Moto m= new Moto();
        m.setMatricula("VFDT-4378");
        m.setMarca(Marca_Moto.Kawasaki.name());
        
        listaVehiculos.add(m);
        
        m = new Moto();
        m.setMatricula("PVFN-9430");
        m.setMarca(Marca_Moto.Ducate.name());
        
        listaVehiculos.add(m);
        
        m =new Moto();
        m.setMarca(Marca_Moto.Harley_Davidnson.name());
        m.setMatricula("OPEF-5236");
        
        listaVehiculos.add(m);
        
        //Camiones:
        Camion cam = new Camion();
        cam.setMarca(Marca_Camion.Mercedes.name());
        cam.setMatricula("VMRT-7356");
        
        listaVehiculos.add(cam);
        
        cam = new Camion();
        cam.setMarca(Marca_Camion.Scania.name());
        cam.setMatricula("DMKL-4352");
        
        listaVehiculos.add(cam);
        
        
        
    }
    
    public static void asignarVehiculos(){
        listaPersonas.get(0).setVehiculosEnPropiedad(listaVehiculos.get(0));
        listaPersonas.get(0).setVehiculosEnPropiedad(listaVehiculos.get(4));
        listaPersonas.get(0).setVehiculosEnPropiedad(listaVehiculos.get(6));
        
        listaPersonas.get(1).setVehiculosEnPropiedad(listaVehiculos.get(3));
        listaPersonas.get(1).setVehiculosEnPropiedad(listaVehiculos.get(2));
        
        listaPersonas.get(2).setVehiculosEnPropiedad(listaVehiculos.get(1));
        listaPersonas.get(2).setVehiculosEnPropiedad(listaVehiculos.get(5));
        
        
    }
    
    public static void personasConMasDeUnVehiculo(){
        for( int x=0; x<listaPersonas.size(); x++){
            if(listaPersonas.get(x).getVehiculosEnPropiedad().size()>1){
                JOptionPane.showMessageDialog(null, listaPersonas.get(x).getNombre()+" tiene mas de un vehiculo");
                
            }
        }
    }
    public static void   PersonasMasVehiculos(){
        int cantidadVehiculos=0;
        String persona="";
        for( int x =0;x<listaPersonas.size();x++){
            
            if(listaPersonas.get(x).getVehiculosEnPropiedad().size()>cantidadVehiculos){
                persona= listaPersonas.get(x).getNombre() + " "+listaPersonas.get(x).getApellido();
                cantidadVehiculos=listaPersonas.get(x).getVehiculosEnPropiedad().size();
            }
        }
         JOptionPane.showMessageDialog(null, "La persona con mas vehiculos es "+ persona+ " con un total de "+ cantidadVehiculos+ " vehiculos.");
    }
    public static void PersonaMasMotos(){
        
        
        int cantidadMotos=0;
        String persona= "";
        
        for( int x =0; x< listaPersonas.size();x++){
          int cantidad=0;  
            
            for(int y=0; y <listaPersonas.get(x).getVehiculosEnPropiedad().size();y ++ ){
               String p= listaPersonas.get(x).getVehiculosEnPropiedad().get(y).getMarca();
               
                if(p.equals(Marca_Moto.Ducate.name())|| p.equals(Marca_Moto.Harley_Davidnson.name())|| p.equals(Marca_Moto.Kawasaki.name())){
                    cantidad= cantidad+1;
                }
            
        }
                if ( cantidad> cantidadMotos){
                    persona=listaPersonas.get(x).getNombre();
                    cantidadMotos= cantidad;
                }
            }
        JOptionPane.showMessageDialog(null, persona +" es quien tiene mas motos con un total de "+ cantidadMotos+" motos.");
            
            
    }
}
