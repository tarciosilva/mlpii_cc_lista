package br.unipe.mlpiii.tarciosilva.implementadas.questao_6;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int itemQtd;
	private double itempreco;
	
	public Fatura(String numero, String descricao, int itemQtd, double itempreco){
		
		this.descricao = descricao;
		this.itempreco = itempreco;
		this.itemQtd = itemQtd;
		this.numero = numero;
		
	}

	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getItemQtd() {
		return itemQtd;
	}

	public void setItemQtd(int itemQtd) {
		this.itemQtd = itemQtd;
	}

	public double getItempreco() {
		return itempreco;
	}

	public void setItempreco(double itempreco) {
		this.itempreco = itempreco;
	}
	
	
	public double getValorFatura(int itemQtd, double itempreco){
		
		double faturaQtd = 0.0, faturapreco = 0.0, faturamento = 0.0;
		
		if(itemQtd < 0){
			
			this.itemQtd = 0;
			faturaQtd = this.itemQtd;
			
		}
				
		if(itempreco < 0){
			
			this.itempreco = 0.0;
			faturapreco = this.itempreco;
			
		}
		
		return (faturamento = faturaQtd*faturapreco);	
		
	}
	
	

}
