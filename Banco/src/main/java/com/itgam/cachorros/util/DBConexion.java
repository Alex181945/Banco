package com.itgam.cachorros.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConexion {

	public static Connection GetConnection(){
		
		Connection conexion = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;"
            		+ "databaseName=PRUEBA_TRANS;user=ALEJANDRO\\alest;password=HCM_1942_esiqie_;";
            conexion= DriverManager.getConnection(url);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en la conexion: "+e);
		}
		return conexion;
	}
}
