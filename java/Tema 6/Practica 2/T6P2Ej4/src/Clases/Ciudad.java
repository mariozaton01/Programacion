/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mario
 */
public class Ciudad {
    
    private String CodigoCiudad;
    private String Nombre;
    
    /*Constructor*/

    public Ciudad(String CodigoCiudad, String Nombre) {
        this.CodigoCiudad = CodigoCiudad;
        this.Nombre = Nombre;
    }
    
    /*Get &% Set*/

    public String getCodigoCiudad() {
        return CodigoCiudad;
    }

    public void setCodigoCiudad(String CodigoCiudad) {
        this.CodigoCiudad = CodigoCiudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /*Metodos*/
    
    public void agregarNuevo(){
        
    }
    public Ciudad obtener(){
        
    }
}
