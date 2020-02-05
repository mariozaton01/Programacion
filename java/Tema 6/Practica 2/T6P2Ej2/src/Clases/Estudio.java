/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1GDAW08
 */
public class Estudio {
    private String Nombre;
    private String Ciudad;
    private String Direccion;
    private String DirWeb;
    private Date FechaFundacion;
    private String Pais;
    ArrayList <String> Telefono;
    
    //Constructores

    public Estudio(String Nombre, String Ciudad, String Direccion, String DirWeb, Date FechaFundacion, String Pais, ArrayList<String> Telefono) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.DirWeb = DirWeb;
        this.FechaFundacion = FechaFundacion;
        this.Pais = Pais;
        this.Telefono = Telefono;
    }

    //Get & Set
 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDirWeb() {
        return DirWeb;
    }

    public void setDirWeb(String DirWeb) {
        this.DirWeb = DirWeb;
    }

    public Date getFechaFundacion() {
        return FechaFundacion;
    }

    public void setFechaFundacion(Date FechaFundacion) {
        this.FechaFundacion = FechaFundacion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public ArrayList<String> getTelefono() {
        return Telefono;
    }

    public void setTelefono(ArrayList<String> Telefono) {
        this.Telefono = Telefono;
    }

    

    
    
    
            
}
