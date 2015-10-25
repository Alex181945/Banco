package com.itgam.cachorros.dao.impl;

import org.springframework.stereotype.Repository;

import com.itgam.cachorros.dao.ClienteDao;
import com.itgam.cachorros.modelo.Cliente;

@Repository
public class ClienteDaoImp implements ClienteDao {

	public void add_Cliente(Cliente obj){
		System.out.println("Llego hasta el dao");
		
	}
	
	public void update_Cliente(Cliente obj){
		
	}
	
	public void delete_Cliente(Integer id){
		
	}
}
