/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW08
 */
public class Directivo extends Empleado {
    
    private String Categoria;  
    ArrayList<Empleado> Subordinados;

    public Directivo(String Categoria, String Nombre, int Edad, float Sueldo_bruto) {
        super(Nombre, Edad, Sueldo_bruto);
        this.Categoria = Categoria;
        this.Subordinados= new ArrayList();
    }

    
    
    
    /*Getter & Setter*/

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return Subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> Subordinados) {
        this.Subordinados = Subordinados;
    }
    
    
    /*Metodos*/

    @Override
    public String toString() {
        return  "Nombre: "+this.getNombre()+"\nEdad: "+ this.getEdad()+"\nSueldo Bruto: "+ this.getSueldo_bruto() +"\nCategoria: " + this.Categoria;
    }
    
    
}
