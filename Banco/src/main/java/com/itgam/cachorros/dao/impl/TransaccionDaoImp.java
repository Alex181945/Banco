package com.itgam.cachorros.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itgam.cachorros.dao.TransaccionDao;
import com.itgam.cachorros.modelo.Transaccion;
import com.itgam.cachorros.util.DBConexion;

@Repository
public class TransaccionDaoImp implements TransaccionDao {
	
	public List<Transaccion> list_Transaccion(String cFecha) throws SQLException{
		System.out.println(cFecha);
		System.out.println("Estoy en la lista transaccion");
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		Statement consulta = inicio.createStatement();
		
		ResultSet res = consulta.executeQuery("SELECT * FROM Transacciones WHERE FechaTransa = "+"'"+cFecha+"'");
		List<Transaccion> obj = new ArrayList<Transaccion>();
        while (res.next()) {
        	System.out.println("Entro");
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
	
	public List<Transaccion> list_Transaccion(Integer iCuenta) throws SQLException{
		
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		Statement consulta = inicio.createStatement();
		
		ResultSet res = consulta.executeQuery("SELECT * FROM Transacciones WHERE iIdCuenta = "+iCuenta);
		List<Transaccion> obj = new ArrayList<Transaccion>();
        while (res.next()) {
        	System.out.println("Entro");
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
	
	public String transferencia(Transaccion obj) throws SQLException{
		
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		Date fecha = new Date();
		
		Statement consulta = inicio.createStatement();
		
		ResultSet res = consulta.executeQuery("SELECT * FROM cuenta WHERE iIdCuenta = "+obj.getiIdCuenta2());
		if(res.next()){
			Integer valor1 = res.getInt("iSaldo");
			
			res = consulta.executeQuery("SELECT * FROM cuenta WHERE iIdCuenta = "+obj.getiIdCuenta());
			if(res.next()){
				
				Integer valor2 = res.getInt("iSaldo");
				valor2 = valor2 - obj.getMonto();
				valor1 = valor1 + obj.getMonto();
				
				int aux1 = consulta.executeUpdate("UPDATE cuenta SET iSaldo="+valor2+" WHERE iIdCuenta = "+obj.getiIdCuenta());
				aux1 = consulta.executeUpdate("UPDATE cuenta SET iSaldo="+valor1+" WHERE iIdCuenta = "+obj.getiIdCuenta2());
				
				aux1 = consulta.executeUpdate("INSERT INTO transacciones (iIdCuenta, TipoTransa, Monto, FechaTransa) values("+obj.getiIdCuenta()+","+
				"'transferencia'"+","+obj.getMonto()+","+"'2015/"+(fecha.getMonth()+1)+"/"+fecha.getDate()+"')");
				
				aux1 = consulta.executeUpdate("INSERT INTO transacciones (iIdCuenta, TipoTransa, Monto, FechaTransa) values("+obj.getiIdCuenta2()+","+
						"'transferencia'"+","+obj.getMonto()+","+"'2015/"+(fecha.getMonth()+1)+"/"+fecha.getDate()+"')");
				inicio.close();
				return "Se realizo la transferencia";
			}
		}
		inicio.close();
		return "No se realizo la transferencia";
	}

}
