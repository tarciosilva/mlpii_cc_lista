package br.unipe.mlpiii.tarciosilva.implementadas.questao_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {
	
	public static void main(String[] args) {
			
		folhaDePagamento generate = new folhaDePagamento();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
				
		String in = "";
		
		System.out.println("\t\t\tDecodofocador de salários\n");
		System.out.println("->Informe o salário do funcionário: ");
		
		try {
			  in = buffer.readLine();
			} catch (IOException ioe){
			  System.out.println("Erro ao ler string");
			}
		
		
		generate.getSalario(in);
		
		System.out.println(generate.getSalario());
		
	}
	
	
	


}
