package com.itgam.cachorros.service.impl;

import org.springframework.stereotype.Service;

import com.itgam.cachorros.dao.CuentaDao;
import com.itgam.cachorros.modelo.Cuenta;
import com.itgam.cachorros.service.CuentaService;

@Service
public class CuentaServiceImp implements CuentaService {
	
	private CuentaDao cuentaDao;
	
	public void add_Cuenta(Cuenta obj){
		cuentaDao.add_Cuenta(obj);
	}
	
	public void update_Cuenta(Cuenta obj){
		cuentaDao.update_Cuenta(obj);
	}
	
	public void delete_Cuenta(Integer id){
		cuentaDao.delete_Cuenta(id);
	}
}
