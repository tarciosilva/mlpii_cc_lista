package br.unipe.mlpii.tarciosilva.implementadas.questao_10;

public class Principal {
	
	public static void main(String[] args) {
        		
		FiguraGeometrica circulo = new Circulo();
		FiguraGeometrica quadrado = new Quadrado();
		FiguraGeometrica triamgulo = new Triangulo();
		
		
		Lapis lapis = new Lapis(circulo);
		lapis.desenha();
		lapis.setFiguraGeometrica(circulo);
		lapis.desenha();
		lapis.setFiguraGeometrica(quadrado);;
		lapis.desenha();;
	}

	
}
