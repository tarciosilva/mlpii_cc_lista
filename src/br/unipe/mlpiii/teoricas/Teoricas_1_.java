package br.unipe.mlpiii.teoricas;

public class Teoricas_1_ {

	/*
	 * @date:20/02/2014 
	 * 
	 * Questão 1:Sabemos que uma grande vantagem do Java é a portabilidade,
	 * mas para isso os compiladores da linguagem funcionam de uma forma diferente.
	 * Explique todo processo da compilação até a execução de um programa em Java.
	 * 
	 * 
	 * @resposta: 
	 * 
	 * A linguagem java apresenta duas fases em seu processo de compilação:
	 * 
	 * >pré-compilação ou geração do bytecode (ou portable code - p-code);
	 * >interpretação do bytecode pela Java Virtual Machine (JVM);
	 * 
	 * Pré-compilação: Nessa fase, o código fonte do programador é convertido pra uma
	 * linguagem intermediária, chamada de bytecode ou p-code reconhecida pela JVM. 
	 * Aqui o programa ainda não pode ser reconhecido pelo computador, apenas pela JVM
	 * instalada na máquina física.
	 * 
	 * Interpretação: A JVM "interpreta" bytecode e executa instrução a instrução just in time, i.e, 
	 * em tempo de compilação. Nessa fase, cada instrução interpretada será executada pelo 
	 * processador do computador.
	 * 
	 * Um programa em Java não é compilado e pronto pra execução, como um arquivo .exe do windows,
	 * por exemplo. O p-code gerado não tem associação alguma com qualquer plataforma de S.O, mas 
	 * pra rodar precisa de "alguém" que o interprete. Aí é que entra a JVM e a portabilidade das
	 * aplicações Java, pois basta ter uma máquina virtual instalada em seu dispositivo que o apli-
	 * cativo irá ser executado independentemente de estar-se rodando windows, linux, MAC-OS ou qualquer
	 * outro S.O. E o mais interessante, não é necessário mudar o código fonte para adaptá-lo à plataforma,
	 * já que A JVM nativa do S.O é que se encarrega, just in time, de fazê-las.
	 *
	 * Mas a geração dos bytecodes ocasionam um défict de segurança, tendo em vista que, diferente dos 
	 * programas feitos em C ou assemby, por exemplo, aqueles podem ser decompilados, ou seja, uma vez
	 * com o tal p-code em mãos, uma pessoa mal-intensionada, pode roubar seu código e alterá-lo a seu
	 * bel prazer. Existem hoje formas de proteger o p-code usando criptografia.
	 *  
	 * Contudo, o Java é hoje uma das principais linguagens de programação do mundo, presente em mais
	 * de 4 bilhões de dispositivos. Para muitos profissonais da área é a primeira linguagem em suas
	 * especializações.
	 * 
	 * ********************************Java, write once, run anywhere**********************************
	 *
		
	
	
	
	
	
	
	*/

}
