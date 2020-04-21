/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;

/**
 *
 * @author mario
 */
public class TablaPersonas {
    
    private Connection con;

    public TablaPersonas(Connection con) {
        this.con = con;
    }
    
     public void insertar(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO tpersonas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getID());
        ps.setString(2,p.getNombre());
        ps.setInt(3,p.getEdad());
        ps.setString(4,p.getProfesion());
        ps.setInt(5, p.getTelefono());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
}
