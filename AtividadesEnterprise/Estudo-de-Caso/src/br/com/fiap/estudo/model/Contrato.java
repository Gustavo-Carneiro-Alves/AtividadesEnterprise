package br.com.fiap.estudo.model;



public class Contrato {

	private Integer numero;
	private String data;
	private Double valor;
	
	public Contrato(Integer numero, String data, Double total) {
		super();
		this.numero = numero;
		this.data = data;
		this.valor = total;
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
		return valor;
	}
	public void setTotal(Double total) {
		this.valor = total;
	}
	
	
	
	public void CalculaImposto (Double valor, String data, int installments) {
		
		for (int i = 1; i <= installments; i++) {
				Double parcela = (((valor/3) * (1 + (0.01*i)))*1.02);
				System.out.println(data + " - " + parcela);
			}
		
	}
	
	
	

	
	
}
