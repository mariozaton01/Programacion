/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import t6p3ej22.Clases.*;

/**
 *
 * @author mario
 */
public class T6P3Ej22 {

    /**
     * @param args the command line arguments
     */static ArrayList <Obra> listaObras= new ArrayList();;
     static ArrayList <Artista> listaArtistas= new ArrayList();;
     static Libro lib;
     static Pelicula peli;
     static Disco disc;
     static Artista artis;
    public static void main(String[] args) {
        // TODO code application logic here
        char continuar;
        do{
         crearObra();
         continuar=JOptionPane.showInputDialog("¿Quiere seguir introduciendo obras?\ns/n.").charAt(0);
        }
        while( continuar=='s');
        
        sacarObra();
        
        
    }
    public static void crearObra(){
        String opciones= JOptionPane.showInputDialog("Que tipo de obra quieres crear?\n Libro/ Pelicula/ Disco").toLowerCase();
        switch(opciones){
            case ("libro"):
                 lib=new Libro();
        
                lib.setTitulo(validarTitulo());
                lib.setAnoEdicion(validarAño());
                lib.setNumPaginas(validarNumPag());
                lib.setEditorial(validarEditorial());
                
                artis= new Artista();
                artis=crearArtista();

                
                listaObras.add(lib);
                ListaArtistas_Obras.set(artis);
            break;
            case ("pelicula"):
                 peli= new Pelicula();
                
                peli.setTitulo(validarTitulo());
                peli.setProductora(validarProductora());
                peli.setAnoEdicion(validarAño());
                peli.setDuracion(validarDuracion());
                
                listaObras.add(peli);
            break;
            case ("disco"):
                disc= new Disco();
                disc.setTitulo(validarTitulo());
                disc.setDiscografica(validarDisco());
                disc.setNumCanciones(validarNumCanciones());
                disc.setAnoEdicion(validarAño());

                listaObras.add(disc);
            break;
            
        }
  
    }
    public static Artista crearArtista(){
        
        artis.setNombre(validarNombre());
        artis.setFechaNac(LocalDate.MIN);
        
        listaArtistas.add(artis); 
        return artis;
    }
    public static String validarTitulo(){
        boolean proceso= false;
        String titulo;
        do{
            titulo=JOptionPane.showInputDialog("Titulo de la obra:");
            Pattern p= Pattern.compile("^(([A-z1-9,.-]+)?[ .])+$");
            Matcher m= p.matcher(titulo);
            
            if (m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Titulo no valido, vuelve a intentarlo.");
     
        }
        while(proceso==false);
        return titulo;   
    }
    public static int validarAño(){
        boolean proceso=false;
        int año;
        String añoString;
        do{
            añoString=JOptionPane.showInputDialog(" Año de edicion:");
            Pattern p= Pattern.compile("^1[89][0-9]{2}|2[0-1][0-9]{2}|2020$");
            Matcher m= p.matcher(añoString);
            
            if(m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Año o formato no valido, vuelve a intentarlo");
        }
        while(proceso==false);
        año= Integer.parseInt(añoString);
        return año;
    }
    public static int validarNumPag(){
        boolean proceso= false;
        int num;
        String numString;
        do{
            numString=JOptionPane.showInputDialog("Numero de Paginas:");
            Pattern p= Pattern.compile("^[0-9]{2}$");
            Matcher m= p.matcher(numString);
            
            if (m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Formato incorrecto, vuelve a intentarlo");
        }
        while(proceso==false);
        num= Integer.parseInt(numString);
        return num;    
    }
    public static String validarEditorial(){
        boolean proceso=false;
        String editorial;
        do{
            editorial=JOptionPane.showInputDialog("Editorial:");
            Pattern p= Pattern.compile("^(([A-z1-9,.-]+)?[ .])+$");
            Matcher m= p.matcher(editorial);
            
            if( m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Editorial no valida, vuelve a intentarlo");
        }
        while(proceso==false);
        return editorial;
    }
    public static String validarProductora(){
        boolean proceso=false;
        String productora;
        do{
            productora=JOptionPane.showInputDialog("Productora:");
            Pattern p= Pattern.compile("^(([A-z1-9,.-]+)?[ .])+$");
            Matcher m= p.matcher(productora);
            
            if( m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Productora no valida, vuelve a intentarlo");
        }
        while(proceso==false);
        return productora;
    }
    public static int validarDuracion(){
        boolean proceso= false;
        int duracion;
        String duracionString;
        do{
            duracionString=JOptionPane.showInputDialog("Duracion de la pelicula:");
            Pattern p= Pattern.compile("^[0-9]{3}$");
            Matcher m= p.matcher(duracionString);
            
            if (m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Formato incorrecto, vuelve a intentarlo");
        }
        while(proceso==false);
        duracion= Integer.parseInt(duracionString);
        return duracion;    
    }
    public static String validarDisco(){
        boolean proceso=false;
        String discografica;
        do{
            discografica=JOptionPane.showInputDialog("Discografica:");
            Pattern p= Pattern.compile("^([A-z]+?[ ])+$");
            Matcher m= p.matcher(discografica);
            
            if( m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Discografica no valida, vuelve a intentarlo");
        }
        while(proceso==false);
        return discografica;
    }
    public static int validarNumCanciones(){
        boolean proceso= false;
        int canciones;
        String cancionesString;
        do{
            cancionesString=JOptionPane.showInputDialog("Duracion de la pelicula:");
            Pattern p= Pattern.compile("^[0-9]{3}$");
            Matcher m= p.matcher(cancionesString);
            
            if (m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Formato incorrecto, vuelve a intentarlo");
        }
        while(proceso==false);
        canciones= Integer.parseInt(cancionesString);
        return canciones; 
    }
    public static String validarNombre(){
        boolean proceso= false;
        String nombre;
        do{
            nombre=JOptionPane.showInputDialog("Nombre del artista:");
            Pattern p= Pattern.compile("^(([A-z]+)?[ .])+$");
            Matcher m= p.matcher(nombre);
            
            if(m.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "El nombre no cumple con el formato requerido, vuelve a intentarlo");
    } 
        while(proceso==false);
        return nombre;
  
}
    public static void sacarObra(){
        String obra =JOptionPane.showInputDialog("Titulo de la obra que quieres sacar:");
        int x;
        
        for(x=0;x<listaObras.size() && !obra.equalsIgnoreCase(listaObras.get(x).getTitulo());x++){
            
        }
    }
}
