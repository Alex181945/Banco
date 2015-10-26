package com.itgam.cachorros.service;

import java.sql.SQLException;
import java.util.List;

import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.modelo.Transaccion;

public interface TransaccionService {

	public List<Transaccion> list_Transaccion(String cFecha) throws SQLException;
	
	public List<Transaccion> list_Transaccion(Integer iCuenta) throws SQLException;
	
	public String transferencia(Transaccion obj) throws SQLException;
}
