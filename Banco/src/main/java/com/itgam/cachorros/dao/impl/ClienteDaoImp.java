package com.itgam.cachorros.dao.impl;

import java.sql.*;

import org.springframework.stereotype.Repository;

import com.itgam.cachorros.dao.ClienteDao;
import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.util.DBConexion;

@Repository
public class ClienteDaoImp implements ClienteDao {

	public void add_Cliente(Cliente obj){
		System.out.println("Llego hasta el dao");
		
	}
	
	public void update_Cliente(Cliente obj){
		
	}
	
	public void delete_Cliente(Integer id){
		
	}
	
	public String acceso(Cliente obj) throws SQLException{
		System.out.println("Llego hasta el dao");
		String resultado = null;
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		Statement consulta = inicio.createStatement();
		
		ResultSet res = consulta.executeQuery("SELECT * FROM cliente WHERE cUsuario = '"+obj.getcUsuario()+"' AND cPassword = '"+obj.getcPassword()+"'");
        if (res.next()) {
            resultado = "Existe";
        }
        else{
        	resultado = "No Existe";
        }
        
        return resultado;
	}
}
