package br.unipe.mlpii.tarciosilva.implementadas.questao_10;


public class Lapis {

private	FiguraGeometrica figuraGeometrica;


public Lapis( FiguraGeometrica novaFiguraGeometrica){
	this.figuraGeometrica = novaFiguraGeometrica;
	
}

public void desenha(){
	
	this.figuraGeometrica.Desenha();;
	
}

public FiguraGeometrica getFiguraGeometrica() {
	return figuraGeometrica;
}

public void setFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
	this.figuraGeometrica = figuraGeometrica;
}
	
}

