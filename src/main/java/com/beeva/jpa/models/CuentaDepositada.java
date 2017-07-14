package com.beeva.jpa.models;


public class CuentaDepositada {
	
	private int idcuenta;
	private double balance;
	private Cliente cliente;
	private Tipocuenta tipocuenta;
	private double deposito;
	private String sospecha;
	
	
	public int getIdcuenta() {
		return idcuenta;
	}
	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Tipocuenta getTipocuenta() {
		return tipocuenta;
	}
	public void setTipocuenta(Tipocuenta tipocuenta) {
		this.tipocuenta = tipocuenta;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	
	
	public String getSospecha() {
		return sospecha;
	}
	public void setSospecha(String sospecha) {
		this.sospecha = sospecha;
	}
	

}
