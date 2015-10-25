package com.itgam.cachorros.modelo;

public class Transaccion {
	
	private Integer NumTransaccion;
	private Integer iIdCuenta;
	private String TipoTransa;
	private Integer Monto;
	private String FechaTransa;
	
	public Integer getNumTransaccion() {
		return NumTransaccion;
	}
	public void setNumTransaccion(Integer numTransaccion) {
		NumTransaccion = numTransaccion;
	}
	public Integer getiIdCuenta() {
		return iIdCuenta;
	}
	public void setiIdCuenta(Integer iIdCuenta) {
		this.iIdCuenta = iIdCuenta;
	}
	public String getTipoTransa() {
		return TipoTransa;
	}
	public void setTipoTransa(String tipoTransa) {
		TipoTransa = tipoTransa;
	}
	public Integer getMonto() {
		return Monto;
	}
	public void setMonto(Integer monto) {
		Monto = monto;
	}
	public String getFechaTransa() {
		return FechaTransa;
	}
	public void setFechaTransa(String fechaTransa) {
		FechaTransa = fechaTransa;
	}

}
