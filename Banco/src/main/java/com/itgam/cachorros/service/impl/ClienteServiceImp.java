package com.itgam.cachorros.service.impl;

import org.springframework.stereotype.Service;

import com.itgam.cachorros.dao.ClienteDao;
import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {
	
	private ClienteDao clienteDao;

	public void add_Cliente(Cliente obj){
		clienteDao.add_Cliente(obj);
	}
	
	public void update_Cliente(Cliente obj){
		clienteDao.update_Cliente(obj);
	}
	
	public void delete_Cliente(Integer id){
		clienteDao.delete_Cliente(id);
	}
}
