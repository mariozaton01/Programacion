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
public class Piloto {
    
    private String CodigoPiloto;
    private String Nombre;
    private String Apellido;
    private Integer NumLicencia;
    
    /*Constructor*/

    public Piloto(String CodigoPiloto, String Nombre, String Apellido, Integer NumLicencia) {
        this.CodigoPiloto = CodigoPiloto;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumLicencia = NumLicencia;
    }
    
    /*Get &Set*/

    public String getCodigoPiloto() {
        return CodigoPiloto;
    }

    public void setCodigoPiloto(String CodigoPiloto) {
        this.CodigoPiloto = CodigoPiloto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getNumLicencia() {
        return NumLicencia;
    }

    public void setNumLicencia(Integer NumLicencia) {
        this.NumLicencia = NumLicencia;
    }
    
    /*Metodos*/
    
    public void agregar_nuevo(){
        
    }
    public void AsignarAVuelo(){
        
    }
    public void cancelarVuelo(){
        
    }
    public void modificar(){
        
    }
    public Piloto buscar(){
        
    }
}
