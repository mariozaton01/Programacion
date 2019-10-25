/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import javax.swing.JOptionPane;
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int minutos= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce los minutos utilizados"));
        double total=0;
        
        if (minutos<300){
            total= minutos*0.04;
            
        }
            else
                if (minutos>300 && minutos<500){
                    total=minutos*003;
                    
                }
                else
                    if (minutos>500 && minutos<800){
                        total=((minutos-300)*0.02)+(300*0.03); 
                       
                    }
                    else
                        if (minutos>800){
                            total=(minutos-300)*0.02+300*0.03;
                            total= total-total*0.0875;
                            
                        }
        JOptionPane.showMessageDialog(null, "Ha gastado"+total+"$");
    }
    
}
