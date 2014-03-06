package br.unipe.mlpiii.tarciosilva.implementadas.questao_7;

public class ControleAgenda {
	
	protected Agenda[] agenda;
	
		
	public Agenda[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda[] agenda) {
		this.agenda = agenda;
	}
	
	
	
	public boolean adicionarContato(Agenda[] agenda, String nome, String numero){
		
		boolean ok = false;
		
		for(int i = 0; i < agenda.length; i++){
			
			if(agenda[i] == null){
				
				agenda[i] = new Agenda();
				agenda[i].setNome(nome);
				agenda[i].setNumero(numero);
				ok = true;
				break;
				
			}else if((agenda[i] != null)&&(i == agenda.length - 1)){
				
				Agenda[] agendaloc = this.realoca(agenda);
				this.adicionarContato(agendaloc, nome, numero);
				this.agenda = agendaloc;
				ok = true;
				break;
				
			}
			
		}
				
		return ok;
		
	}
	
	

//**********************************************************************************
	//ok
	public Agenda[] realoca(Agenda[] agenda){
		
		Agenda[] agendaloc = new Agenda[agenda.length + 2];
		int k = 0;
		
		for(int i = 0; i < agendaloc.length; i++){
			
			
			if((agenda[k].getNome() != null)&&(agenda[k].getNumero() != null)){
				
				agendaloc[i] = new Agenda();
				agendaloc[i] = agenda[k];
				k++;
				if(k == agenda.length) break;
				
			}
									
		}
		
		agenda = null;
				
		return agendaloc;
		
	}
//********************************************************************************	
		//ok			
	public void Print(Agenda[] agenda){
				
		int control = 0;
		
		for(int i = 0; i < agenda.length; i++){
			
			if(agenda[i] != null){
				
				if((agenda[i].getNumero() != null)&&(agenda[i].getNome() != null)){
					
					System.out.printf("\nNome: %s", agenda[i].getNome());
					System.out.println("\nTelefone: "+agenda[i].getNumero());
					control++;
					
				}
				
				
			}
			
		}
		
		if(control == 0) System.out.println("Agenda vazia!");
		
	}
//**********************************************************************************	
	//ok
	public Agenda[] findContact(String nome){
		
		Agenda[] contact;
		contact = new Agenda[agenda.length];
		int j = 0;
		
		for(int i = 0; i < agenda.length; i++){
			
			if(agenda[i] == null) continue;
			else if(agenda[i].getNome().matches(nome) | (nome.matches("[a-zA-Z]*\\s*[a-zA-Z]*"))){
				
				contact[j] = agenda[i]; j++;
				
			}
			
		}
		
		return contact;
		
	}
//**************************************************************************************************
	//ok
	public boolean deleteContact(String nome){
		
		boolean ok = false;
				
		for(int i = 0; i < this.agenda.length; i++){
			
			if((agenda[i] != null)&&(agenda[i].getNome() != null)){
				
				if(this.agenda[i].getNome().matches(nome)){
					
					this.agenda[i] = null; ok = true;
									
				}
				
			}
			
		}
		
		return ok;
		
	}
//*****************************************************************************************************	
	//ok
	public Agenda[] contactSort(Agenda[] agenda){
				
		boolean ok = false;
		
		for(int i = 0; i < agenda.length - 1; i++){
			
			ok = true;
			
			if((agenda[i] != null)&&(agenda[i].getNome() != null)){
				
				for(int j = 0; j < agenda.length - 1 - i; j++){
					
					if((agenda[j] != null)&&(agenda[j].getNome() != null)&&(agenda[j + 1] != null)&&(agenda[j + 1].getNome() != null)){
						
						if(agenda[j].getNome().compareToIgnoreCase(agenda[j + 1].getNome()) >= 0){
							
							Agenda aux = agenda[j];
							agenda[j] = agenda[j + 1];
							agenda[j + 1] = aux;
							ok = false;
							
						}
						
						
					}else continue;
					
				}
				
				
			}else continue;
			
			if(ok) break;
			
		}
		
			return agenda;	
		
	}
	
	public boolean validaContato(String numero){
						
		return numero.matches("[1-9]\\d{3,3}-\\d{4,4}");
					
	}
	
	public boolean testaNumero(String numero){
		
		boolean ok = false;
		
		for(int i = 0; i < agenda.length; i++){
			
			if(agenda[i] == null) continue;
			else if(agenda[i].getNumero().matches(numero)){
				
				ok = true;
				break;
				
			}
			
		}
		
		return ok;
		
	}
			
}
