package com.itgam.cachorros.modelo;

public class Transaccion {
	
	private Integer Num_Transaccion;
	private Integer iIdCuenta;
	private String Tipo_Transa;
	private Integer Monto;
	private String Fecha_Transa;
	
	public Integer getNum_Transaccion() {
		return Num_Transaccion;
	}
	public void setNum_Transaccion(Integer num_Transaccion) {
		Num_Transaccion = num_Transaccion;
	}
	public Integer getiIdCuenta() {
		return iIdCuenta;
	}
	public void setiIdCuenta(Integer iIdCuenta) {
		this.iIdCuenta = iIdCuenta;
	}
	public String getTipo_Transa() {
		return Tipo_Transa;
	}
	public void setTipo_Transa(String tipo_Transa) {
		Tipo_Transa = tipo_Transa;
	}
	public Integer getMonto() {
		return Monto;
	}
	public void setMonto(Integer monto) {
		Monto = monto;
	}
	public String getFecha_Transa() {
		return Fecha_Transa;
	}
	public void setFecha_Transa(String fecha_Transa) {
		Fecha_Transa = fecha_Transa;
	}
	
}
