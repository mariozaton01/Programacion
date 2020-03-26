/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1GDAW08
 */
public class Empleado extends Persona{
    
    private float Sueldo_bruto;

    public Empleado() {
    }

    
    
    public Empleado( String Nombre, int Edad,float Sueldo_bruto) {
        super(Nombre, Edad);
        this.Sueldo_bruto = Sueldo_bruto;
    }
    
    /*Getter & Setter*/

    public float getSueldo_bruto() {
        return Sueldo_bruto;
    }

    public void setSueldo_bruto(float Sueldo_bruto) {
        this.Sueldo_bruto = Sueldo_bruto;
    }
    
    /*Metodos*/

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+"\nEdad: "+ this.getEdad()+ "\nSueldo Bruto: "+this.Sueldo_bruto;
    }

    public double calcularSalarioNeto(){
        double sueldoNeto;
        double sueldo=0;
        if(Sueldo_bruto<12450){
            sueldo=(Sueldo_bruto*0.19)/12;    
        }
        if(Sueldo_bruto>12450 && Sueldo_bruto<20000){
            sueldo=(Sueldo_bruto*0.24)/12;
        }
        if(Sueldo_bruto>20000 &&Sueldo_bruto< 35200){
            sueldo=(Sueldo_bruto*0.30)/12;
        }
        if(Sueldo_bruto>30000 && Sueldo_bruto<60000){
            sueldo=(Sueldo_bruto*0.37)/12;
        }
        if(Sueldo_bruto>60000){
            sueldo=(Sueldo_bruto*0.45)/12;
        }
        sueldoNeto=sueldo-(sueldo*0.064);
        return sueldoNeto;
    }
    
    

    

    
    
    
}
