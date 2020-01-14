/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5p1ej1;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author 1GDAW08
 */import javax.swing.JOptionPane;
public class T5P1Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Float> lista= new ArrayList();
        
        int operaciones= Integer.parseInt(JOptionPane.showInputDialog("1.- Visualizar el valor maximo y el minimo\n 2.- Solicitar un numeroy buscarlo. Muestra un mensaje indicando si lo has encontrado o no.\n 3.- Solicitar un numero, buscarlo y borrarlo.Sino se encuetnra muestra un mensaje de error.\n 4.- Convertit el arrayList en un array\n 5.- Si no esta vacio, mostrae el numero de elementos que contiene.\n 6.- Insertar un nuevo elemetno por el final.\n 7.- Insertar un nuveo elemento en la posicion que te indique el usuario.\n 8.- Borrar un elemento de una posiciom concreta.\n 9.- Calcular la suma y la media aritmetica de los valores contenidos.\n 10.-Finalizar.   "));
        
        switch(operaciones){
            case 1:
                uno(lista);
                break;
            case 2:
                dos(lista);
                break;
            case 3:
                tres(lista);
                break;
            case 4:
                cuatro(lista);
                break;
            case 5:
                cinco(lista);
                break;
            case 6:
                seis(lista);
                break;
            case 7:
                siete(lista);
                break;
            case 8:
                ocho(lista);
                break;
            case 9:
                nueve(lista);
                break;
            case 10:
                
                break;          
        }
        
        
        
   
}
    public static void pedirDatos(ArrayList<Float> lista){
        char continuar;
        do{
            Float valor=Float.parseFloat(JOptionPane.showInputDialog("Introduzca un valor"));
            lista.add(valor);
            continuar=JOptionPane.showInputDialog("¿Quiere continuar introduciendo datos?  s/n").charAt(0);
        }
        while(continuar=='s');
    }
    
    public static void uno(ArrayList<Float> lista){
        pedirDatos(lista);
    float max=0;
    float min=0;
    for(int x=0; x<lista.size();x++){
        if(lista.get(x)>max){
            max=lista.get(x);
        }
        min=max;
        if(lista.get(x)<min){
            min=lista.get(x);
        }
        
    }
    JOptionPane.showMessageDialog(null,"Max= "+max+"\n Min= "+min);
}
     public static void dos(ArrayList<Float> lista){
         pedirDatos(lista);
         int x;
    float numero=Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero que quieres buscar"));
    for(x=0;x<lista.size() && lista.get(x)!=numero;x++){
        
    } 
     if (x != lista.size()){
            JOptionPane.showMessageDialog(null,lista.get(x));
        }
    else{
            JOptionPane.showMessageDialog(null,"No existe ese numero en la lista.");
        }
    
}
      public static void tres(ArrayList<Float> lista){
          pedirDatos(lista);
      int x;
    float numero=Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero que quieres borrar"));
    for(x=0;x<lista.size() && lista.get(x)!=numero;x++){
        
    } 
     if (x != lista.size()){
            lista.remove(lista.get(x));
        }
    else{
        JOptionPane.showMessageDialog(null,"No existe ese numero en la lista");
    }
}
       public static void cuatro(ArrayList<Float> lista){
           Object[] array =lista.toArray();
           float []floatArray = new float [lista.size()];
           int i=0;
           for (Float f : lista){
               floatArray[i++] = (f !=null ? f: Float.NaN);               
           }
           for(int x=0; x<floatArray.length;x++){
               JOptionPane.showMessageDialog(null, x);
           }
           
    
}
        public static void cinco(ArrayList<Float> lista){
           
            boolean ans = lista.isEmpty(); 
             
        if (ans == true) 
            JOptionPane.showMessageDialog(null,"The ArrayList is empty");
            else{
                pedirDatos(lista);
                JOptionPane.showMessageDialog(null,lista.size()+" elementos");
            }
        ans = lista.isEmpty(); 
        pedirDatos(lista);
        if (ans == false) 
            JOptionPane.showMessageDialog(null,lista.size()+" elementos");
            
}
         public static void seis(ArrayList<Float> lista){
             pedirDatos(lista);
             float valor=Float.parseFloat(JOptionPane.showInputDialog("Introduce un nuevo valor por el final"));
             lista.add(valor);
             
}
          public static void siete(ArrayList<Float> lista){
              pedirDatos(lista);
              float valor=Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor"));
              int posicion= Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieras añadir el nuevo valor"));
              lista.add(posicion-1,valor);
              JOptionPane.showMessageDialog(null,"El valor ha sido añadido.");
    
}
           public static void ocho(ArrayList<Float> lista){
               pedirDatos(lista);
              
              int posicion= Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion del valor que quieres borrar."));
              lista.remove(posicion-1);
              JOptionPane.showMessageDialog(null,"El valor ha sido borrado.");
}
            public static void nueve(ArrayList<Float> lista){
                pedirDatos(lista);
                float suma=0;
                float media=0;
                for(int x=0; x<lista.size();x++){
                    suma=lista.get(x);
                    suma= suma + lista.get(x);
                     media= suma/lista.size();
                    
                }
                JOptionPane.showMessageDialog(null,"la suma es "+suma+"\n La media es "+media);
}
             
    

}
