/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej22.Clases;

import java.time.LocalDate;

/**
 *
 * @author mario
 */
public class Artista {
    private String Nombre;
    private LocalDate FechaNac;

    public Artista() {
    }

    public Artista(String Nombre, LocalDate FechaNac) {
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }
    
    
}
