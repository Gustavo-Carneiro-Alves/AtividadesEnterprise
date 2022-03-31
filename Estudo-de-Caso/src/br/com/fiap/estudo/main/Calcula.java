package br.com.fiap.estudo.main;

import java.util.Scanner;

import br.com.fiap.estudo.model.Contrato;

public class Calcula {

	public static void main(String[] args) {
		
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do contrato: ");
		int numContrato = sc.nextInt();
		
		System.out.println("Digite a data do contrato (dd/MM/yyy): ");
		String dtContrato = sc.next();
		
		System.out.println("Digite o valor do contrato: ");
		Double vlContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numContrato, dtContrato, vlContrato);
		
		System.out.println(contrato.getNumero());
		System.out.println(contrato.getData());
		System.out.println(contrato.getTotal());
		
		
		
	}
	
}
