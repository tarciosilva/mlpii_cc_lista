package br.unipe.mlpiii.tarciosilva.implementadas.questao_7;

public class Main {
	
	public static void main(String[] args) {
		
		Agenda[] agenda = new Agenda[2];
		ControleAgenda realoc = new ControleAgenda();
		
		for(int i = 0; i < agenda.length; i++){
			
			agenda[i] = new Agenda();
			agenda[i].setNome("Tarcio");
			agenda[i].setNumero(94011010);
			
		}
		
		System.out.println("Tamanho agenda: "+agenda.length);
				
		realoc.setAgenda(realoc.realoca(agenda));
		
		//System.out.println(realoc.agenda[0].getNome());
		
		for(int i = 0; i < realoc.agenda.length; i++){
			
			if(realoc.agenda[i] == null){
				
				realoc.agenda[i] = new Agenda();
				realoc.agenda[i].setNome("Natlaia");
				realoc.agenda[i].setNumero(88142128);
				//System.out.println(realoc.agenda[i].getNome());
				
			}
		}
				
		System.out.println("Tamanho agenda: "+realoc.agenda.length);
		
		realoc.setAgenda(realoc.realoca(realoc.agenda));
		
		for(int i = 0; i < realoc.agenda.length; i++){
						
			if(realoc.agenda[i] == null){
				
				realoc.agenda[i] = new Agenda();
				realoc.agenda[i].setNome("Amanda");
				realoc.agenda[i].setNumero(88134128);
				
			}
			
		}
				
		System.out.println("Tamanho agenda: "+realoc.agenda.length);
		
		//realoc.Print();
		realoc.setAgenda(realoc.contactSort(realoc.agenda));
		realoc.Print();
		
		if(realoc.deleteContact("Tarcio")){
			
			System.out.println("Função del ok!");
			
		}else System.out.println("ERROR: :(");
		
		realoc.Print();
		
		
	}

}
