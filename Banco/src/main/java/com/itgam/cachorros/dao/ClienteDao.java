package com.itgam.cachorros.dao;

import com.itgam.cachorros.modelo.Cliente;

public interface ClienteDao {

	public void add_Cliente(Cliente obj);
	
	public void update_Cliente(Cliente obj);
	
	public void delete_Cliente(Integer id);
	
}
