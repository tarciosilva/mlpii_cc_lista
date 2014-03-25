package br.unipe.mlpiii.tarciosilva.implementadas.questao_9;

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double kmRodado;
	private double kmInicial;
	private double kmFinal;
	private double valorLoc;
	
	//***************************************************************************
	
	
	//***************************************************************************
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	public double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValorLoc() {
		return valorLoc;
	}
	public void setValorLoc(double valorLoc) {
		this.valorLoc = valorLoc;
	}
	
	
	public double valorLocacao(double kmIniciak, double kmFinal, double kmRodado){
				
		return (kmFinal - kmInicial) * kmRodado;
				
	}
	
}
