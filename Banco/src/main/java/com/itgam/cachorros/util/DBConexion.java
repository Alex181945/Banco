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
            System.out.println("Error de Conexión Intente Mas Tarde"
                    + " O Contacté con el área de Sistemas"+"\n"+e);
        }
		return conexion;
	}
}
