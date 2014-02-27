package br.unipe.mlpiii.tarciosilva.implementadas.questao_8;

public class Fita {
	
	private String identification;
	private double value;
	
	public Fita(String iden, double val){
		
		this.identification = iden;
		this.value = val;	
		
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	

}
