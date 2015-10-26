package com.itgam.cachorros.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.cachorros.dao.TransaccionDao;
import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.modelo.Transaccion;
import com.itgam.cachorros.service.TransaccionService;

@Service
public class TransaccionServiceImp implements TransaccionService {
	
	@Autowired
	private TransaccionDao transaccionDao;

	public List<Transaccion> list_Transaccion(String cFecha) throws SQLException{
		return this.transaccionDao.list_Transaccion(cFecha);
	}
	
	public List<Transaccion> list_Transaccion(Integer iCuenta) throws SQLException{
		return this.transaccionDao.list_Transaccion(iCuenta);
	}
}
