package br.unipe.mlpiii.tarciosilva.implementadas.questao_7;

import java.util.*;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
	//*****************************************************************
		Agenda[] agenda = new Agenda[1];
		ControleAgenda control = new ControleAgenda();
		int option = 1000;
		Scanner inner = new Scanner(System.in);
	//******************************************************************
		
			
	while(option != 0){
		    
			System.out.println("\t\tAGENDA TELEFÔNICA - VERSÃO 1.0 CONSOLE\n\n");
			System.out.println("Informe a opção desejada: ");
		    System.out.println("\n\n1 - Adicionar Contato\n\n2 - Procurar Contato\n\n3 - Editar Contato\n\n4 - Listar Contatos\n\n5 - Remover Contato\n\n6 - Fechar Agenda\n\n");
		    option = inner.nextInt();
		    
		    switch(option){
		    
		    	case 1:{
		    		
		    		String nome = null;
		    		int numero = 0;
		    		System.out.println("Informe o nome do novo contato:\t");
		    		nome = inner.next();
		    		System.out.println("\nInforme o numero de "+nome+": ");
		    		numero = inner.nextInt();
		    		if(control.adicionarContato(agenda, nome, numero)){
		    			
		    			System.out.println("\n\nContato adicionado com sucesso!\n\n");
		    			
		    		}else System.out.println("Erro ao adicionar contato...:(");
		    				    		
		    		
		    	}break;
		    
		    	case 2:{
		    		
		    		String nome = null;
		    		System.out.println("Informe o nome do contato a ser buscado: \n\n");
		    		nome = inner.next();
		    		control.Print(control.findContact(nome));
		    		
		    	}break;
		    	
		    	case 3:{
		    				    	
		    		String nome = null;
		    		int numero = 0;
		    		System.out.println("Informe o nome completo do contato:\n\n");
		    		nome = inner.next();
		    		agenda = control.findContact(nome);
		    		System.out.println("Nome atual: "+agenda[0].getNome());
		    		System.out.println("Número atual: "+agenda[0].getNumero());
		    		System.out.println("Novo nome: \n\n");
		    		nome = inner.next();
		    		System.out.println("Novo número: \n\n");
		    		numero = inner.nextInt();
		    		control.deleteContact(agenda[0].getNome());
		    		if(control.adicionarContato(agenda, nome, numero)){
		    			
		    			System.out.println("Contato editado com sucesso!");
		    					    			
		    		}else System.out.println("Falha ao editar contato...:(");
		    		
		    	}break;
		    	
		    	case 4:{
		    		
		    		control.Print(control.agenda);    		
		    		
		    	}break;
		    	
		    	case 5:{
		    		
		    		String nome = null, decision = null;
		    		System.out.println("Informe o nome do contato a ser removido:\n\n");
		    		nome = inner.next();
		    		System.out.println("Tem certeza que deseja remover:\n\n");
		    		control.Print(control.findContact(nome));
		    		System.out.println("?\n\n");
		    		decision = inner.next();
		    		if(decision == "sim"){
		    			
		    			control.deleteContact(nome);
		    			System.out.println("Contato deletado com sucesso...:)");
		    			
		    		}else break;
		    		
		    		
		    	}break;
		    	
		    	case 6: option = 0;
		    		    
		    }
		    		    
	}
							
	}

}
