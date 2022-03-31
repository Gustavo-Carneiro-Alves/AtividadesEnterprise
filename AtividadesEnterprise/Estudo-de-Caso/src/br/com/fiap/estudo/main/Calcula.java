package br.com.fiap.estudo.main;



import java.util.Scanner;

import br.com.fiap.estudo.model.Contrato;

public class Calcula {

	public static void main(String[] args) throws Exception {
		
		
		
		
		
		
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data ");
		
		System.out.print("Number: ");
		int numContrato = sc.nextInt();
		
		System.out.print("Date (dd/MM/yyyy): ");
		String dtContrato = sc.next();
		
		System.out.print("Contract value: ");
		Double vlContrato = sc.nextDouble();
		
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		
		System.out.println("Installments: ");
		
		Contrato contrato = new Contrato(numContrato, dtContrato, vlContrato);
		
		contrato.CalculaImposto(contrato.getTotal(),contrato.getData(), installments);
		
		
	}
	
}
