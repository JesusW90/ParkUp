/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Manchita
 */
public class PlazaDao {
    
    Connection con;
	
	public PlazaDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost/parking","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*selecciona el driver a utilizar */ catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
        
        public boolean ocuparPlaza(int numeroPlaza, Vehiculo v) {
		try {
		Statement sentencia= con.createStatement();
		sentencia.executeUpdate("update plazas set estado=true, matriculaVehiculo="
                                                       + "\""+v.getMatricula()+"\"WHERE numero="+numeroPlaza);
		sentencia.close();
		return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}
        
        public boolean liberarPlaza(Vehiculo v){
		try {
			Statement sentencia= con.createStatement();
		sentencia.executeUpdate("update plazas set estado=false, matriculaVehiculo=NULL WHERE "
                                                              + "matriculaVehiculo=\""+v.getMatricula()+"\"");
		sentencia.close();
		return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
        
        public void cerrarConexion(){
		try{
			con.close();
		}catch (Exception e) {
			System.out.println("No se puede cerrar la conexion");
			e.printStackTrace();
		}
	}
}
