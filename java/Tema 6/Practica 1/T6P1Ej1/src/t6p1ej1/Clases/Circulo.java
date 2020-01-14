/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p1ej1.Clases;

/**
 *
 * @author 1GDAW08
 */
public class Circulo {
    private double radio;
    
    /*Constructores*/

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    /*Get & Set*/
    
   
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
        /*Metodos*/
    public double getLongitud(){
        return 2*Math.PI*radio;
        
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double getVolumen(){
        return 4*Math.PI*Math.pow(radio, 3)/3;
    }
    
    
    
}
