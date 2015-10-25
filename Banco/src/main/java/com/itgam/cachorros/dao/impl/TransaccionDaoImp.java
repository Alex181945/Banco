package com.itgam.cachorros.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itgam.cachorros.dao.TransaccionDao;
import com.itgam.cachorros.modelo.Transaccion;
import com.itgam.cachorros.util.DBConexion;

@Repository
public class TransaccionDaoImp implements TransaccionDao {
	
	public List<Transaccion> list_Transaccion(Integer iIdCuenta) throws SQLException{
		System.out.println(iIdCuenta);
		System.out.println("Estoy en la lista transaccion");
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		Statement consulta = inicio.createStatement();
		
		ResultSet res = consulta.executeQuery("SELECT * FROM Transacciones WHERE iIdCuenta = "+iIdCuenta);
		List<Transaccion> obj = new ArrayList<Transaccion>();
        while (res.next()) {
        	Transaccion obj_Transaccion = new Transaccion();
        	
        	obj_Transaccion.setNumTransaccion(res.getInt("NumTransaccion"));
        	obj_Transaccion.setiIdCuenta(res.getInt("iIdCuenta"));
        	obj_Transaccion.setTipoTransa(res.getString("TipoTransa"));
        	obj_Transaccion.setMonto(res.getInt("Monto"));
        	obj_Transaccion.setFechaTransa(res.getString("FechaTransa"));
        	
        	obj.add(obj_Transaccion);
        }
        inicio.close();
        System.out.println("Salgo del dao");
        return obj;
	}

}
