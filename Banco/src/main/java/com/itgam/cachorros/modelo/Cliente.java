package com.itgam.cachorros.modelo;

public class Cliente {
	
	private Integer iIdCliente;
	private String cNombre;
	private String cApellidos;
	private Integer iNumCuenta;
	
	public Integer getiIdCliente() {
		return iIdCliente;
	}
	public void setiIdCliente(Integer iIdCliente) {
		this.iIdCliente = iIdCliente;
	}
	public String getcNombre() {
		return cNombre;
	}
	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}
	public String getcApellidos() {
		return cApellidos;
	}
	public void setcApellidos(String cApellidos) {
		this.cApellidos = cApellidos;
	}
	public Integer getiNumCuenta() {
		return iNumCuenta;
	}
	public void setiNumCuenta(Integer iNumCuenta) {
		this.iNumCuenta = iNumCuenta;
	}
	
}
