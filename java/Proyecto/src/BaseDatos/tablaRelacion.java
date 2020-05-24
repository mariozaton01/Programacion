/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Clases.Alumno;
import Clases.Asignatura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class tablaRelacion {

    private Connection con;
    public tablaRelacion(Connection con){
        this.con=con;
    }
  
    public ArrayList<Asignatura> comprobarAlumno(String dni)throws Exception {
        ArrayList <Asignatura> listaAsigdeAlum= new ArrayList();
       String plantilla="SELECT ID_Asignatura from relacionalumasig WHERE DNI_Alumno=?;";
        PreparedStatement ps= con.prepareStatement(plantilla);
        ps.setString(1, dni);
        
        ResultSet resultado =ps.executeQuery();
        
        while(resultado.next()){
            Asignatura asig= new Asignatura();
            asig.setID(resultado.getInt("ID_Asignatura"));
            listaAsigdeAlum.add(asig);
    }
        return listaAsigdeAlum;
            
    }
    }

