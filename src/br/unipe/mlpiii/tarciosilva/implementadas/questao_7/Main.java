package br.unipe.mlpiii.tarciosilva.implementadas.questao_7;

import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		
	//*****************************************************************
		ControleAgenda control = new ControleAgenda();
		control.agenda = new Agenda[1];
		String option = "";
		Scanner inner = new Scanner(System.in);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	//******************************************************************
		
			
	while(option != null){
		    
			System.out.println("\t\tAGENDA TELEFÔNICA - VERSÃO 1.0 CONSOLE\n\n");
			System.out.println("Informe a opção desejada: ");
		    System.out.println("\n\n1 - Adicionar Contato\n\n2 - Procurar Contato\n\n3 - Editar Contato\n\n4 - Listar Contatos\n\n5 - Remover Contato\n\n6 - Fechar Agenda\n\n");
		    option = inner.next();
		    final boolean ok = true;
		    
		    while(ok){
		    	
		    	if(option.matches("[1-6]")) break;
		    	else{
		    		
		    		System.out.println("\nOpção inválida! Entre com um número inteiro entre 1 e 6:\\\n");
		    		option = inner.next();
		    		continue;
		    		
		    	}
		    	
		    }
		    		    
		    switch(option){
		    
		    	case "1":{
		    		
		    		String nome = null;
		    		String numero = null;
		    		System.out.println("Informe o nome do novo contato:\t");
		    		
		    		
		    		try {
		    			  nome = buffer.readLine();
		    			} catch (IOException ioe){
		    			  System.out.println("Erro ao ler string");
		    			}
		    	
		    		
		    		
		    		System.out.println("\nInforme o numero de "+nome+": ");
		    		numero = inner.next();
		    		
		    		while(!control.validaContato(numero)){
		    			
		    			System.out.println("\nNúmero inválido! Por favor, entre com um número no formato ####-####: \n\n");
		    			numero = inner.next();
		    					    			
		    		}
		    		
		    		while(ok){
		    			
		    			if(!control.testaNumero(numero))break;
		    			else{
		    				
		    				System.out.println("O numero informado já existe...:/ Por favor informe um novo número:\n");
		    				numero = inner.next();
		    				
		    				while(!control.validaContato(numero)){
				    			
				    			System.out.println("\nNúmero inválido! Por favor, entre com um número no formato ####-####: \n\n");
				    			numero = inner.next();
				    							    			
				    		}continue;		    				
		    			}
		    				    			
		    		}
		    		
		    		if(control.adicionarContato(control.agenda, nome, numero)){
		    			
		    			System.out.println("\n\nContato adicionado com sucesso!\n\n");
		    			
		    		}else System.out.println("Erro ao adicionar contato...:/");
		    				    		
		    	}break;
		    
		    	case "2":{
		    		
		    		String nome = null;
		    		System.out.println("Informe o nome do contato a ser buscado: \n\n");
		    		
		    		try {
		    			  nome = buffer.readLine();
		    			} catch (IOException ioe){
		    			  System.out.println("Erro ao ler string");
		    			}
		    		
		    				    		
		    		while(ok){
		    			
		    			if(nome.matches("[a-zA-Z]*\\s*[a-zA-Z]*")){
		    				
		    				if(control.findContact(nome)[0] == null){
		    					
		    					System.out.println("Nenhum contato encontrado....:/\n");
		    					break;
		    					
		    				}else{
		    					
		    					System.out.println("Contatos encontrados:");
		    					control.Print(control.findContact(nome));	    						
		    						
		    					}
		    					    				
		    				break;	    						    				
		    				
		    			}else{
		    				
		    				System.out.println("Nome inválido, tente novamente...:/\n");
		    				nome = inner.next();
		    				continue;
		    				
		    			}
		    			
		    		}
		    		
		    	}break;
		    	
		    	case "3":{
		    		
		    		
		    		String nome = null;
		    		String numero = null;
		    		System.out.println("Informe o nome completo do contato:\n\n");
		    		nome = inner.next();
		    		
		    		if(control.findContact(nome)[0] == null){
		    			
		    			System.out.println("Contato não encontrado...:/\n");
		    			break;
		    			
		    		}else{
		    			
		    			System.out.println("Nome atual: "+control.findContact(nome)[0].getNome());
		    			System.out.println("Número atual: "+control.findContact(nome)[0].getNumero());
		    			System.out.println("Novo número: ");
		    			numero = inner.next();
		    			
			    		while(!control.validaContato(numero)){
			    			
			    			System.out.println("\nNúmero inválido! Por favor, entre com um número no formato ####-####: \n\n");
			    			numero = inner.next();
			    					    			
			    		}
			    		
			    		while(ok){
			    			
			    			if(!control.testaNumero(numero))break;
			    			else{
			    				
			    				System.out.println("O numero informado já existe...:/ Por favor informe um novo número:\n");
			    				numero = inner.next();
			    				
			    				while(!control.validaContato(numero)){
					    			
					    			System.out.println("\nNúmero inválido! Por favor, entre com um número no formato ####-####: \n\n");
					    			numero = inner.next();
					    							    			
					    		}continue;		    				
			    			}
			    				    			
			    		}
			    		
			    		
		    			
		    			
		    			if(control.deleteContact(control.findContact(nome)[0].getNome())){
		    				
		    				control.adicionarContato(control.agenda, nome, numero);
		    				System.out.println("Contato editado com sucesso...:]");
		    				
		    			}else{
		    				
		    				System.out.println("Erro ao editar contato...:/");
		    				break;
		    				
		    			}
		    					    			
		    		}
		    			    		
		    	}break;
		    	
		    	case "4":{
		    		
		    		control.Print(control.contactSort(control.agenda));
		    		
		    		
		    	}break;
		    	
		    	case "5":{
		    		
		    		String nome = null, decision = null;
		    		System.out.println("Informe o nome do contato a ser removido:\n");
		    		nome = inner.next();
		    		
		    		while(control.findContact(nome)[0] == null){
		    			
		    			System.out.println("Nome não encontrado...:/ Deseja informar um novo nome: (S/N)");
		    			option = inner.next();
		    			if(option.equalsIgnoreCase("s")){
		    				
		    				System.out.println("Informe o nome do contato a ser removido:\n");
				    		nome = inner.next();
		    				option = "";
		    				continue;
		    				
		    			}else if(option.equalsIgnoreCase("n")){
		    				
		    				option = "";
		    				break;
		    				
		    			}else{
		    				
		    				System.out.println("Opção inválida...:/ Por favor, dgite (s) ou (n)\n");
		    				option = inner.next();
		    				continue;
		    				
		    			}
		    			
		    			
		    			
		    		}
		    		
		    		System.out.println("Deseja remover "+nome+"? sim/não");
		    		decision = inner.next();
		    		if(decision.equalsIgnoreCase("sim")){
		    			
		    			if(control.deleteContact(nome)){
		    			
		    				System.out.println("Contato deletado com sucesso...:)");
		    			
		    			}else System.out.println("Erro ao deletar contato...:/");
		    			
		    		}else break;
		    		
		    		
		    	}break;
		    	
		    	case "6": option = null;
		    		    
		    }
		    		    
	}
							
	}

}
