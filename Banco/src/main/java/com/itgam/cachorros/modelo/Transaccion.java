package com.itgam.cachorros.modelo;

public class Transaccion {
	
	private Integer numTransaccion;
	private Integer iIdCuenta;
	private String tipoTransa;
	private Integer monto;
	private String fechaTransa;
	
	public Integer getNumTransaccion() {
		return numTransaccion;
	}
	public void setNumTransaccion(Integer numTransaccion) {
		this.numTransaccion = numTransaccion;
	}
	public Integer getiIdCuenta() {
		return iIdCuenta;
	}
	public void setiIdCuenta(Integer iIdCuenta) {
		this.iIdCuenta = iIdCuenta;
	}
	public String getTipoTransa() {
		return tipoTransa;
	}
	public void setTipoTransa(String tipoTransa) {
		this.tipoTransa = tipoTransa;
	}
	public Integer getMonto() {
		return monto;
	}
	public void setMonto(Integer monto) {
		this.monto = monto;
	}
	public String getFechaTransa() {
		return fechaTransa;
	}
	public void setFechaTransa(String fechaTransa) {
		this.fechaTransa = fechaTransa;
	}

}
