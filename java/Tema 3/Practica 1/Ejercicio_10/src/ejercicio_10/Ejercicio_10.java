/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import javax.swing.JOptionPane;
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia=JOptionPane.showInputDialog(null,"Introduce un numeros del 1 al 7 para saber que dia es");
        
        int d= Integer.parseInt(dia);
                switch (d){
                    case 1:
                            JOptionPane.showMessageDialog(null, "Lunes");
                            break;
                    case 2:
                            JOptionPane.showMessageDialog(null, "Martes");
                            break;
                    case 3:
                            JOptionPane.showMessageDialog(null, "Miercoles");
                            break;
                    case 4:
                            JOptionPane.showMessageDialog(null," Jueves");
                            break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Viernes");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Sabado");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Domingo");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error");   
                        break;
                
    }
    
    }
}
