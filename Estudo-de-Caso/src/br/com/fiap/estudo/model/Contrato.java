package br.com.fiap.estudo.model;

import java.math.BigDecimal;

public class Contrato {

	private Integer numero;
	private String data;
	private Double total;
	
	public Contrato(Integer numero, String data, Double total) {
		super();
		this.numero = numero;
		this.data = data;
		this.total = total;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	
	

	
	
}
