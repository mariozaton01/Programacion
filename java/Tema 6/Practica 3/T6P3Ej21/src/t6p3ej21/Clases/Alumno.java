/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej21.Clases;

import java.util.Date;

/**
 *
 * @author mario
 */
public class Alumno {
    
    private int Codigo;
    private String Nombre;
    private String Domicilio;
    private int Telefono;
    private int Edad;
    private char Sexo;
    private Date FechaNac;
    private String Correo;
    
    /*Constructores*/

    public Alumno() {
    }

    public Alumno(int Codigo, String Nombre, String Domicilio, int Telefono, int Edad, char Sexo, Date FechaNac, String Correo) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.FechaNac = FechaNac;
        this.Correo = Correo;
    }
    
    /*Getter & Setter*/

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    //Metodo toString:

    @Override
    public String toString() {
        return "Codigo del alumno:" + Codigo + "\nNombre:" + Nombre + "\nDomicilio:" + Domicilio + "\nTelefono:" + Telefono + "\nEdad:" + Edad + " años\nSexo:" + Sexo + "\nFechaNac:" + FechaNac + "\nCorreo:" + Correo;
    }
    
    
    
    
}
