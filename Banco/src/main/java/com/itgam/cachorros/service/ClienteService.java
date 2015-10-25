package com.itgam.cachorros.service;

import java.sql.SQLException;

import com.itgam.cachorros.modelo.Cliente;

public interface ClienteService {
	
	public void add_Cliente(Cliente obj);
	
	public void update_Cliente(Cliente obj);
	
	public void delete_Cliente(Integer id);
	
	public String acceso(Cliente obj) throws SQLException;

}
