package com.itgam.cachorros.dao;

import java.sql.SQLException;
import java.util.List;

import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.modelo.Transaccion;

public interface TransaccionDao {
	
	public List<Transaccion> list_Transaccion(String cFecha) throws SQLException;
	
	public List<Transaccion> list_Transaccion(Integer iCuenta) throws SQLException;

}
