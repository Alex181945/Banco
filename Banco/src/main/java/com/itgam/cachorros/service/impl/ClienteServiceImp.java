package com.itgam.cachorros.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.cachorros.dao.ClienteDao;
import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
	private ClienteDao clienteDao;

	public void add_Cliente(Cliente obj){
		this.clienteDao.add_Cliente(obj);
	}
	
	public void update_Cliente(Cliente obj){
		this.clienteDao.update_Cliente(obj);
	}
	
	public void delete_Cliente(Integer id){
		this.clienteDao.delete_Cliente(id);
	}
	
	public String acceso(Cliente obj) throws SQLException{
		return this.clienteDao.acceso(obj);
	}
}
