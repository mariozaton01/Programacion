/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2ej3;

import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class T6P2Ej3 {

    /**
     * @param args the command line arguments
     */private static ArrayList <Empleado> listaEmple;
        private static ArrayList <Empresa> listaEmpresas;
        private static ArrayList <Directivo> listaDirectivo;
        
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            crearEmpleado();
            crearDirectivo();
            subordinados();
            DirectivoConMasSubordinados();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
            
        
    }
    public static void crearEmpleado(){
        listaEmple=new ArrayList();
        Empleado emple= new Empleado("Jaime", 33, 30000);
        listaEmple.add(emple);
        
        emple=new Empleado("Josu", 24, 27000);
        listaEmple.add(emple);
        
        emple= new Empleado("Miguel", 26, 37000);
        listaEmple.add(emple);
        
        emple= new Empleado("Aitor",21, 23500);
        listaEmple.add(emple);
        
        emple=new Empleado("Jose", 43, 45000);
        listaEmple.add(emple);
        
        emple=new Empleado("Antonio",56,62000);
        listaEmple.add(emple);
        
        emple=new Empleado("Susana", 41, 58000);
        listaEmple.add(emple);
        
        emple= new Empleado("Marcos", 61, 38000);
        listaEmple.add(emple);
        
        emple =new Empleado("Marisa", 52, 61000);
        listaEmple.add(emple);
    }
    
    public static void crearDirectivo(){
        listaDirectivo= new ArrayList();
        
        Directivo dir=new Directivo("Categoria 2", "Mauricio", 57, 62500);
        listaDirectivo.add(dir);
        
        dir= new Directivo("Categoria 1", "Juan", 36, 45000);
        listaDirectivo.add(dir);
        
        dir= new Directivo("Categoria 3", "Pablo", 29, 39000);
        listaDirectivo.add(dir);
        
    }
    
    public static void crearEmpresa(){
        listaEmpresas=new ArrayList();
        
        Empresa empresa= new Empresa("Michelin");
        listaEmpresas.add(empresa);
        
        empresa=new Empresa("Mercedes");
        listaEmpresas.add(empresa);
        
    }
    public static void subordinados(){
       // ArrayList<Empleado>listaSub= new ArrayList();
        /*Subordinados primer directivo*/
        listaDirectivo.get(0).getSubordinados().add(listaEmple.get(0));
        listaDirectivo.get(0).getSubordinados().add(listaEmple.get(1));
        listaDirectivo.get(0).getSubordinados().add(listaEmple.get(3));
        listaDirectivo.get(0).getSubordinados().add(listaEmple.get(4));
        /*listaSub.add(listaEmple.get(0));
        listaSub.add(listaEmple.get(1));
        listaSub.add(listaEmple.get(2));
        listaSub.add(listaEmple.get(3);
        listaSub.add(listaEmple.get(4));
        listaDirectivo.get(0).setSubordinados(listaSub);
        */
       
        
        /*Subordinados segundo directivo*/
        //listaSub= new ArrayList();
        
        /*listaSub.add(listaEmple.get(0));
        listaSub.add(listaEmple.get(1));
        listaSub.add(listaEmple.get(2));
        listaSub.add(listaEmple.get(3));
        
        listaDirectivo.get(1).setSubordinados(listaSub);*/
        
        listaDirectivo.get(1).getSubordinados().add(listaEmple.get(5));
        listaDirectivo.get(1).getSubordinados().add(listaEmple.get(6));
        listaDirectivo.get(1).getSubordinados().add(listaEmple.get(7));
        
        /*Subordinados segundo directivo*/
        //listaSub= new ArrayList();
        
        /*listaSub.add(listaEmple.get(0));
        listaSub.add(listaEmple.get(1));
        listaSub.add(listaEmple.get(2));
        listaSub.add(listaEmple.get(3));
        
        listaDirectivo.get(2).setSubordinados(listaSub);*/
        listaDirectivo.get(1).getSubordinados().add(listaEmple.get(8));
        

    }
    
    public static void DirectivoConMasSubordinados (){
        String directivoMasSub="";
        int maxSub=0;
        int x;
        int y;
        for(x=0;x<listaDirectivo.size();x++){
            for(y=0; y<listaDirectivo.get(x).getSubordinados().size();y++){
                if(listaDirectivo.get(x).getSubordinados().size()> maxSub){
                    maxSub= listaDirectivo.get(x).getSubordinados().size();
                    directivoMasSub=listaDirectivo.get(x).getNombre();
                }
            }
        
        }
        JOptionPane.showMessageDialog(null,"El directivo con mas subordinados es "+ directivoMasSub+ " con "+ maxSub + " subordinados");
    }
}
