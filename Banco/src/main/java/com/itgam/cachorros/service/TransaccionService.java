package com.itgam.cachorros.service;

import java.util.List;

import com.itgam.cachorros.modelo.Cliente;
import com.itgam.cachorros.modelo.Transaccion;

public interface TransaccionService {

	public List<Transaccion> list_Transaccion(Cliente obj);
}
