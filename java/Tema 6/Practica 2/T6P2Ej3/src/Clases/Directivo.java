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
public class Directivo extends Empleado {
    
    private String Categoria;

    public Directivo(String Categoria, float Sueldo_bruto, String Nombre, int Edad) {
        super(Sueldo_bruto, Nombre, Edad);
        this.Categoria = Categoria;
    }
    
    
    /*Getter & Setter*/

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    /*Matodos*/

    @Override
    public String toString() {
        return  "Nombre: "+super.getNombre()+"\nEdad: "+ super.getEdad()+"\nSueldo Bruto: "+ super.getSueldo_bruto() +"\nCategoria: " + Categoria;
    }
    
    
}
