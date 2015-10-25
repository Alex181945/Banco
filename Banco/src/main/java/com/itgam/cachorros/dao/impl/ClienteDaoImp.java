package com.itgam.cachorros.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
	
	public Integer acceso(Cliente obj) throws SQLException{
		System.out.println("Entro en acceso");
		String resultado = null;
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		Statement consulta = inicio.createStatement();
		
		ResultSet res = consulta.executeQuery("SELECT * FROM cliente WHERE cUsuario = '"+obj.getcUsuario()+"' AND cPassword = '"+obj.getcPassword()+"'");
		
        if(res.next()) {
        	return res.getInt("iIdCuenta");
        }
            return 0;
	}
	
	public List<Cliente> list_Cliente(Cliente obj) throws SQLException{
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		Statement consulta = inicio.createStatement();
		
		ResultSet res = consulta.executeQuery("SELECT * FROM cliente WHERE cUsuario = '"+obj.getcUsuario());
		List<Cliente> obj2 = new ArrayList<Cliente>();
        while (res.next()) {
        	Cliente obj_Cliente = new Cliente();
        	
        	obj_Cliente.setiIdCliente(res.getInt("iIdCliente"));
        	obj_Cliente.setcNombre(res.getString("cNombre"));
        	obj_Cliente.setcApellidos(res.getString("cApellidos"));
        	obj_Cliente.setiICuenta(res.getInt("iIdCuenta"));
        	obj_Cliente.setcUsuario(res.getString("cUsuario"));
        	obj_Cliente.setcPassword(res.getString("cPassword"));
        	
        	obj2.add(obj_Cliente);
        }
        inicio.close();
        return obj2;
	}
}
