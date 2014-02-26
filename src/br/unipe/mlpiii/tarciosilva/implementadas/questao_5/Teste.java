package br.unipe.mlpiii.tarciosilva.implementadas.questao_5;

import java.util.regex.*;

public class Teste {
	
	public String string = null;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	
	public boolean teste(String string){
		
		Pattern padrao = Pattern.compile("\\d*\\d");
		
		Matcher pesquisa = padrao.matcher(string);
			
		if(pesquisa.matches()){
			
			return true;
			
		}else return false;
		
	}
	
	
	

}
