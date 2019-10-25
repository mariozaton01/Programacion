/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import javax.swing.JOptionPane;
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;        
        int menu=Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Sumar 2 numeros \n 2.- Restar 2 numeros \n 3.- Visualizar tabla de multiplicar de un numero \n 4.- Visualizar cociente y resto de una division \n 5.- Salir del programa \n Elige una opcion:"));
        
        switch(menu){
            case 1:
                 numero1=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
                 numero2=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un segundo numero"));
                int suma;
                suma=numero1+numero2;
                JOptionPane.showMessageDialog(null,suma);
            break;
            case 2:
                 numero1=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
                 numero2=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un segundo numero"));
                 int resta;
                 resta=numero1-numero2;
                 JOptionPane.showMessageDialog(null,resta);
            break;
            case 3:
                int j;
                numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero"));
                for(j = 1; j <= 10; j++)
                {
                    JOptionPane.showMessageDialog(null,(numero1 + " X " + j + " = " + numero1*j));
                }
                    System.out.println();
                    break;
            case 4:
                numero1=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
                 numero2=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un segundo numero"));
                 
                 int division;
                 int resto;
                 division=numero1/numero2;
                 resto=numero1%numero2;
                 JOptionPane.showMessageDialog(null,division+""+ "\n"+""+ resto);
                 
            case 5:
                String salir=JOptionPane.showInputDialog(null,("Quiere salir?"));
                while(salir.equalsIgnoreCase("si"))
                    
                    break;
                    
                                   
                
            
        }
               
    }
    
}
