package br.unipe.mlpiii.tarciosilva.teoricas;

public class Teoricas_ {

	/*
	 * @date:20/02/2014 
	 * 
	 * Quest�o 1:Sabemos que uma grande vantagem do Java � a portabilidade,
	 * mas para isso os compiladores da linguagem funcionam de uma forma diferente.
	 * Explique todo processo da compila��o at� a execu��o de um programa em Java.
	 * 
	 * 
	 * @resposta: 
	 * 
	 * A linguagem java apresenta duas fases em seu processo de compila��o:
	 * 
	 * >pr�-compila��o ou gera��o do bytecode (ou portable code - p-code);
	 * >interpreta��o do bytecode pela Java Virtual Machine (JVM);
	 * 
	 * Pr�-compila��o: Nessa fase, o c�digo fonte do programador � convertido pra uma
	 * linguagem intermedi�ria, chamada de bytecode ou p-code reconhecida pela JVM. 
	 * Aqui o programa ainda n�o pode ser reconhecido pelo computador, apenas pela JVM
	 * instalada na m�quina f�sica.
	 * 
	 * Interpreta��o: A JVM "interpreta" bytecode e executa instru��o a instru��o just in time, i.e, 
	 * em tempo de compila��o. Nessa fase, cada instru��o interpretada ser� executada pelo 
	 * processador do computador.
	 * 
	 * Um programa em Java n�o � compilado e pronto pra execu��o, como um arquivo .exe do windows,
	 * por exemplo. O p-code gerado n�o tem associa��o alguma com qualquer plataforma de S.O, mas 
	 * pra rodar precisa de "algu�m" que o interprete. A� � que entra a JVM e a portabilidade das
	 * aplica��es Java, pois basta ter uma m�quina virtual instalada em seu dispositivo que o apli-
	 * cativo ir� ser executado independentemente de estar-se rodando windows, linux, MAC-OS ou qualquer
	 * outro S.O. E o mais interessante, n�o � necess�rio mudar o c�digo fonte para adapt�-lo � plataforma,
	 * j� que A JVM nativa do S.O � que se encarrega, just in time, de faz�-las.
	 *
	 * Mas a gera��o dos bytecodes ocasionam um d�fict de seguran�a, tendo em vista que, diferente dos 
	 * programas feitos em C ou assemby, por exemplo, aqueles podem ser decompilados, ou seja, uma vez
	 * com o tal p-code em m�os, uma pessoa mal-intensionada, pode roubar seu c�digo e alter�-lo a seu
	 * bel prazer. Existem hoje formas de proteger o p-code usando criptografia.
	 *  
	 * Contudo, o Java � hoje uma das principais linguagens de programa��o do mundo, presente em mais
	 * de 4 bilh�es de dispositivos. Para muitos profissonais da �rea � a primeira linguagem em suas
	 * especializa��es.
	 * 
	 **************************************************************************************************
	 ***********************************Java, write once, run anywhere*********************************
	 **************************************************************************************************
	 *
	 * Quest�o 2: Defina e exemplifique cada uma das partes de um objeto:
	 * �Um estado (atributos)
	 * �Um comportamento (m�todos)
	 * �Interface (assinaturas)
	 * �Uma identidade
	 * 
	 * 
	 * 
	 * @resposta:
	 * 
	 * >atributos: s�o especifica��es, qualidades de uma classe em Java, �
	 * aquilo que a mesma �;
	 * 
	 * >comportamento: � aquilo atrelado ao que a classe faz, as a��es que
	 * lhes s�o inerentes; 
	 * 
	 * >interface: � a identifica��o dos m�todos de uma classe;
	 * 
	 * >identidade: � um nome que se usa pra identificar uma classe; 
	 * 
	 * **********************************Warning*******************************************
	 * 
	 * obs.: classe � diferente de objeto, a saber:
	 * 
	 * objeto: � uma refer�ncia a uma classe, ou seja, uma inst�ncia de uma classe;
	 * classe: � conjunto de comportamentos e atributos que identificam um objeto;
	 * 
	 * *************************************************************************************
	 * 
	 * 
	 * 
	 * Quest�o 3: Defina e exemplifique os benef�cios da Orienta��o a Objetos.
	 * 
	 * 
	 * @resposta:
	 * 
	 *  O primeiro, e not�vel, grande benef�cio da orienta��o a objetos (O.O), � sem d�vida a 
	 * portabilidade, i.e, o fato de ser uma linguagem multi-plataforma. Voc� n�o precisa 
	 * escrever um c�dido pra windows, depois reescrever o mesmo c�digo pra linux ou MAC OS,
	 * com a m�quina virtual instalada um mesmo c�digo servir� pra qualquer um desses S.O's.
	 * Depois temos o reaproveitamento de c�digo. A O.O lhe permite escrever de forma suscinta
	 * um c�digo que em uma linguagem estruturada, como C por exemplo, levaria muito tempo pra
	 * ser escrito e a "reusabilidade" do c�digo � muito dif�cil. Com o conceito de classes, 
	 * heran�as, polimorfismo, etc, podemos usar um mesmo c�digo em diferentes projetos fazendo 
	 * apenas algumas modifica��es que sejam necess�rias. Outra vantagem � a agilidade na manuten��o
	 * do c�digo. Pelo mesmo fato do c�digo ser reus�vel, essa conec��o que a orienta��o a objetos
	 * nos proporciona permiti-nos identificar bugs mais facilmente e corrigi-los de forma simples
	 * e pr�tica, n�o tendo que fazer altera��es ao longo de todo fonte. Uma outra caracter�stica 
	 * que ajuda muito tamb�m � a abstra��o da O.O. Voc� n�o precisa reiventar a roda, j� tem ronta! 
	 * Cabe apenas ao programador moldar seu problema e fazer uso da enorme biblioteca Java - 
	 * diferente de liguagens como assemly, c...
	 * 
	 **********************************************************************************************   
	 *   
	 * 
	 * Quest�o 4: Defina e exemplifique Polimorfismo.
	 * 
	 * 
	 * @resposta:
	 * 
	 *  Polimorfismo, como a palavra sugere (poli = muitos, morpho = forma), � a capacidade de um OBJETO
	 * ser referenciado por mais de uma classe. Exemplo: temos uma funcion�rio e uma atendente. Um
	 * atendente � um funcion�rio por defini��o. Se um m�todo que calcula as f�rias de um funcion�rio
	 * for implementado e configurado pra receber um funcio�rio como refer�ncia, um atendente, just in time,
	 * pode ser referenciado como funcio�rio, por�m os m�todos pertinentes � classe atendente continuam sendo
	 * da mesma.
	 * 
	 * **********************************************************************************************	
	*/

}
