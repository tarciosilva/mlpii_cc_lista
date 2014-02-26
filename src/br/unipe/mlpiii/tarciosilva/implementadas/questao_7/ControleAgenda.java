package br.unipe.mlpiii.tarciosilva.implementadas.questao_7;


public class ControleAgenda {
	
	protected Agenda[] agenda;
	
		
	public Agenda[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda[] agenda) {
		this.agenda = agenda;
	}

//**********************************************************************************
	//ok
	public Agenda[] realoca(Agenda[] agenda){
		
		Agenda[] agendaloc = new Agenda[agenda.length + 2];
		int k = 0;
		
		for(int i = 0; i < agendaloc.length; i++){
			
			agendaloc[i] = new Agenda();
			if((agenda[k] != null)&&(agendaloc[i].getNome() == null)){
				
				agendaloc[i] = agenda[k];
				k++;
				if(k >= agenda.length) break;
				
			}
									
		}
		
		agenda = null;
				
		return agendaloc;
		
	}
//********************************************************************************	
		//ok			
	public void Print(){
		
		for(int i = 0; i < agenda.length; i++){
			
			if((agenda[i].getNumero() != 0)&&(agenda[i].getNome() != null)){
				
				System.out.println("Nome: "+agenda[i].getNome());
				System.out.println("Telefone: "+agenda[i].getNumero());
				
			}
			
		}
		
	}
//**********************************************************************************	
	//ok
	public Agenda[] findContact(String nome){
		
		Agenda[] contact;
		int i = 0;
		//int j = 0;
		
		/*while(i < agenda.length){
			
			if(agenda[i].getNome().equals(nome)){
									
					j++;
											
			}
			
			i++;
						
		}i = 0; j = 0;*/
		
		contact = new Agenda[agenda.length];
		
		while(i < agenda.length){
			
			if(agenda[i].getNome().equals(nome)){
				
				contact[i] = agenda[i]; //j++;
										
		    }
		
		    i++;
			
		}
		
		return contact;
		
	}
//**************************************************************************************************
	//ok
	public boolean deleteContact(String nome){
		
		boolean ret = false;
		//int k = 0;		
		//Agenda aux = new Agenda();
		
		for(int i = 0; i < agenda.length; i++){
			
			if(agenda[i].getNome().equalsIgnoreCase(nome)){
				
				agenda[i].setNome(null); agenda[i].setNumero(0); ret = true;
								
			}
			
		}
		
		return ret;
		
	}
//*****************************************************************************************************	
	//ok
	public Agenda[] contactSort(Agenda[] agenda){
		
		Agenda aux = new Agenda();
		
		for(int i = 0; i < agenda.length - 1; i++){
			
			boolean ok = true;
			
			for(int j = 0; j < agenda.length - 1 - i; j++){
				
				if(agenda[i].getNome().compareToIgnoreCase(agenda[j + 1].getNome()) >= 0){
					
					aux = agenda[j];
					agenda[j] = agenda[j + 1];
					agenda[j + 1] = aux;
					ok = false;
					
				}
				
			}
			
			if(ok) break;
			
		}
		
		return agenda;
		
	}
	
		
}
