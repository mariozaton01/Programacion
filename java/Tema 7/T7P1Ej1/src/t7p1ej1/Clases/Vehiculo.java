/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1ej1.Clases;

/**
 *
 * @author mario
 */
public class Vehiculo {
    private String Matricula;
    private String Marca;
    private String Propietario;

    public Vehiculo() {
    }

    public Vehiculo(String Matricula, String Marca, String Propietario) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Propietario = Propietario;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }
    
    
          
}
