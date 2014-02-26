package br.unipe.mlpiii.tarciosilva.implementadas.questao_5;

import java.util.Scanner;;

public class Principal {
	
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario(0);
		func.setSalario(2000.00);
		System.out.println(func.getSalario());
		
		Teste t = new Teste();
		Scanner ent = new Scanner(System.in);
		String in;
		
		System.out.println("string:  ");
		in = ent.next();
		
		if(t.teste(in)){
			
			System.out.println("ok!");
			
		}else System.out.println("bad code!");
		
		
	}
	
	
	


}
