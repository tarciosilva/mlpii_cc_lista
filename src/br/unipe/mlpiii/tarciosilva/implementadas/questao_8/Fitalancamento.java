package br.unipe.mlpiii.tarciosilva.implementadas.questao_8;

public class Fitalancamento extends Fita {
	
	private int codigo;
	
	public Fitalancamento(int codigo, String iden, double val){
		
		super(iden, val);
		this.codigo = codigo;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double precoCalc(){
		
		this.setValue(this.getValue()*0.20);
		return this.getValue();
		
	}
	
	

}
