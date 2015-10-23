package com.itgam.cachorros.dao;

import com.itgam.cachorros.modelo.Cuenta;

public interface CuentaDao {

	public void add_Cuenta(Cuenta obj);
	
	public void update_Cuenta(Cuenta obj);
	
	public void delete_Cuenta(Integer id);
	
}
