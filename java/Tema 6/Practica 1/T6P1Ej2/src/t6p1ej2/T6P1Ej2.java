/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p1ej2;
import Clases.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class T6P1Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista= new ArrayList();
        String  nombre, domicilio;
        int telefono,codigo;
        char continuar;
        do{
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo que le quieras poner al alumno"));
            nombre=JOptionPane.showInputDialog("Introduce el nombre del alumno");
            domicilio=JOptionPane.showInputDialog("Introduce el domicilio del alumno");
            telefono=Integer.parseInt(JOptionPane.showInputDialog("Introduce el telefono alumno"));
            
            Alumno a= new Alumno();
            a.setNombre(nombre);
            a.setCodigo(codigo);
            a.setDomicilio(domicilio);
            a.setTelefono(telefono);
            
            lista.add(a);
                    
            
            continuar=JOptionPane.showInputDialog("¿Quiere seguir introduciendo alumnos?\n s/n").charAt(0);
        }
        while(continuar=='s');
        
        String pedirCodigo=JOptionPane.showInputDialog("Introduce el codigo del alumno del que quieras recoger datos");
        int x=0;
        
        for(x=0; x<lista.size(); x++){
            if(pedirCodigo==lista.size(x).getCodigo())
        }
        
        
    }
    
}
