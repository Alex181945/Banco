package com.itgam.cachorros.modelo;

public class Cliente {
	
	private Integer iIdCliente;
	private String cNombre;
	private String cApellidos;
	private Integer iIdCuenta;
	private String cUsuario;
	private String cPassword;
	
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
	public Integer getiIdCuenta() {
		return iIdCuenta;
	}
	public void setiICuenta(Integer iIdCuenta) {
		this.iIdCuenta = iIdCuenta;
	}
	public String getcUsuario() {
		return cUsuario;
	}
	public void setcUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	
}
