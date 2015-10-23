package com.itgam.cachorros.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexion {

	public static Connection GetConnection(){
		
		Connection conexion = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/materia","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Conexi�n Intente Mas Tarde"
                    + " O Contact� con el �rea de Sistemas"+"\n"+e);
        }
		return conexion;
	}
}
