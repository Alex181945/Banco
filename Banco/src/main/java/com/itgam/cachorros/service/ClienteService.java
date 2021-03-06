package com.itgam.cachorros.service;

import java.sql.SQLException;
import java.util.List;

import com.itgam.cachorros.modelo.Cliente;

public interface ClienteService {
	
	public void add_Cliente(Cliente obj);
	
	public void update_Cliente(Cliente obj);
	
	public void delete_Cliente(Integer id);
	
	public Integer acceso(Cliente obj) throws SQLException;

	public List<Cliente> list_Cliente(Cliente obj) throws SQLException;
}
