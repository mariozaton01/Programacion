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
public class Cliente extends Persona {
    
    private int Telefono_contacto;

    public Cliente(int Telefono_contacto, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Telefono_contacto = Telefono_contacto;
    }
    
    /*Getter & Setter*/

    public int getTelefono_contacto() {
        return Telefono_contacto;
    }

    public void setTelefono_contacto(int Telefono_contacto) {
        this.Telefono_contacto = Telefono_contacto;
    }

    /*Metodos*/

    @Override
    public String toString() {
        return "Nombre: "+super.getNombre()+"\nEdad: "+ super.getEdad()+"\nTelefono_contacto: " + Telefono_contacto;
    }
    
    
    
}
