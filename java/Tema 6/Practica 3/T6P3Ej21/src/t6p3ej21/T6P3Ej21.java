/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej21;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import t6p3ej21.Clases.Alumno;

/**
 *
 * @author mario
 */
public class T6P3Ej21 {

    /**
     * @param args the command line arguments
     */static ArrayList <Alumno> listaAlumno= new ArrayList();
     static Alumno alum;
    public static void main(String[] args) {
        // TODO code application logic here 
        boolean proceso=false;
        do{
            crearAlumno();
            

            char continuar=JOptionPane.showInputDialog("Quiere seguir introduciendo alumnos?\n s/n").charAt(0);
            
            if (continuar=='n')
                proceso=true;
            
        }
        while(proceso==false);
        sacarDatosAlumno(); 
        
                
                
    }
    public static void crearAlumno(){
      
        
        //Introducir datos en atributos de Alumno
        alum= new Alumno();
        alum.setCodigo(validarCodigo());
        alum.setNombre(validarNombre());
        alum.setDomicilio(validarDomicilio());
        alum.setEdad(validarEdad());
        alum.setTelefono(validarTelefono());
        alum.setSexo(validarSexo());
        alum.setCorreo(validarCorreo());
        alum.setFechaNac(validarFechaNac());
        
        listaAlumno.add(alum);
    }
    public static int validarCodigo(){
        boolean proceso=false;
        String codigostring;
        int codigo=0;
        do{
             codigostring=JOptionPane.showInputDialog("Introduce el codigo del alumno");
             Pattern pcod= Pattern.compile("^[0-9]{5}$");
             Matcher mcod= pcod.matcher(codigostring);
             
             if(mcod.matches()){
                 proceso=true;
                codigo= Integer.parseInt(codigostring);
             }
             else
                 JOptionPane.showMessageDialog(null, "El codigo es incorrecto, vuelve a intentarlo");
        }
        while(proceso==false);
        return codigo;
    }
    
    public static String validarNombre(){
        boolean proceso=false;
        String nombre;
        do{
            nombre=JOptionPane.showInputDialog("Introduce el n ombre del alumno");
            Pattern pnom= Pattern.compile("^[A-Z][a-z]+$");
            Matcher mnom= pnom.matcher(nombre);
            
            if(mnom.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "El nombre no se ha introducido correctamente, numeros y signos no son validos.\n Vuelve a intentarlo");
        }
        while(proceso==false);
        return nombre;
    }
    public static String validarDomicilio(){
        boolean proceso=false;
        String domicilio;
        
        do{
            domicilio=JOptionPane.showInputDialog("Introduce el domicilio del alumno");
            Pattern pdom= Pattern.compile("^(calle|senda|plaza|avenida)([ ][A-z]+)+$");
            Matcher mdom= pdom.matcher(domicilio);
            
            if(mdom.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Domicilio invalido, vuelve a intentarlo");
        }
        while(proceso==false);
        return domicilio;
    }
    public static int validarTelefono(){
        boolean proceso=false;
        String telefonostring;
        int telefono=0;
        do{
            telefonostring=JOptionPane.showInputDialog("Introduce el telefono del alumno");
            Pattern ptel= Pattern.compile("^945[0-9]{6}$");
            Matcher mtel= ptel.matcher(telefonostring);
            
            if(mtel.matches()){
                proceso=true;
              telefono=Integer.parseInt(telefonostring);
            }
            else
                JOptionPane.showInputDialog("El telefono introducido no es valido, vuelve a intentarlo.");
            
        }
        while(proceso==false);
        return telefono;
    }
    
    public static int validarEdad(){
        boolean proceso= false;
        String edadstring;
        int edad=0;
        do{
            edadstring=JOptionPane.showInputDialog("Introduce la edad del alumno.\n Desde 12 hasta 60 años");
            Pattern pedad= Pattern.compile("^12|[1-5][1-9]|60");
            Matcher medad= pedad.matcher(edadstring);
            
            if(medad.matches()){
                proceso= true;
               edad=Integer.parseInt(edadstring);
            }
            else
                JOptionPane.showMessageDialog(null, "La edad no esta comprendida entre los digitos validos");
        }
        while(proceso==false);
        return edad;
    }
    public static char validarSexo(){
        boolean proceso=false;
        String sexostring;
        char sexo;
        do{
            sexostring=JOptionPane.showInputDialog("Introduce el sexo del alumno.\nH/M/O");
            Pattern psex= Pattern.compile("^(h|H)|(m|M)|(o|O)$");
            Matcher msex= psex.matcher(sexostring);
            if(msex.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "Sexo mal introducido, vuelve a intentarlo.");
          }
        while(proceso==false);
        
        sexo=sexostring.charAt(0);
        return sexo;  
    }
    public static String validarCorreo(){
        boolean proceso=false;
        String correo;
        
        do{
            correo=JOptionPane.showInputDialog("Introduce el correo del alumno");
            Pattern pcor= Pattern.compile("^[A-z1-9._-]+@(gmail.com|outlook.es|egibide.org)$");
            Matcher mcor= pcor.matcher(correo);
            if(mcor.matches())
                proceso=true;
            else
                JOptionPane.showMessageDialog(null, "El correo no cumple con las opciones validas, vuelve a intentarlo"); 
        }
        while(proceso==false);
        return correo;
    }
    public static Date validarFechaNac(){
        boolean proceso=false;
        String fechastring;
        SimpleDateFormat formato= new SimpleDateFormat("dd/mm/yyyy");
        Date fecha=null;
        do{
            fechastring=JOptionPane.showInputDialog("Introduce la fecha de nacimietno del alumno^siguiendo este formato:\ndd/mm/yyyy.");
            Pattern pfecha= Pattern.compile("");
            Matcher mfecha= pfecha.matcher(fechastring);
            if (mfecha.matches()){
                proceso=true;
                try{
                    fecha= formato.parse(fechastring);
                    proceso=true;
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "La fecha no esta introducida correctamente.");
                }
            }
            else
                JOptionPane.showMessageDialog(null, "La fecha no esta introducida correctamente, vuelve a intentarlo");
        }
        while(proceso==false);
        return fecha;
    }
    public static void sacarDatosAlumno(){
        int x;
        int sacarAlumno=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del alumno del que quieras sacar informacion"));
        
        for(x=0;x<listaAlumno.size() && sacarAlumno!= listaAlumno.get(x).getCodigo();x++){}
        
        String texto= listaAlumno.get(x).toString();
        JOptionPane.showMessageDialog(null, texto);
            
    }
    
}
