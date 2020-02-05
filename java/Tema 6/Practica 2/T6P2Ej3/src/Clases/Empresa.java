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
public class Empresa {
    
    
    private String Nombre;

    public Empresa(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /*Getter & Setter*/

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Nombrede la empresa:" +Nombre;
    }
    
    
}
