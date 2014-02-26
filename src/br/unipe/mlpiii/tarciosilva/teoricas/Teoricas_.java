package br.unipe.mlpiii.tarciosilva.teoricas;

public class Teoricas_ {

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
	 **************************************************************************************************
	 ***********************************Java, write once, run anywhere*********************************
	 **************************************************************************************************
	 *
	 * Questão 2: Defina e exemplifique cada uma das partes de um objeto:
	 * •Um estado (atributos)
	 * •Um comportamento (métodos)
	 * •Interface (assinaturas)
	 * •Uma identidade
	 * 
	 * 
	 * 
	 * @resposta:
	 * 
	 * >atributos: são especificações, qualidades de uma classe em Java, é
	 * aquilo que a mesma é;
	 * 
	 * >comportamento: é aquilo atrelado ao que a classe faz, as ações que
	 * lhes são inerentes; 
	 * 
	 * >interface: é a identificação dos métodos de uma classe;
	 * 
	 * >identidade: é um nome que se usa pra identificar uma classe; 
	 * 
	 * **********************************Warning*******************************************
	 * 
	 * obs.: classe é diferente de objeto, a saber:
	 * 
	 * objeto: é uma referência a uma classe, ou seja, uma instância de uma classe;
	 * classe: é conjunto de comportamentos e atributos que identificam um objeto;
	 * 
	 * *************************************************************************************
	 * 
	 * 
	 * 
	 * Questão 3: Defina e exemplifique os benefícios da Orientação a Objetos.
	 * 
	 * 
	 * @resposta:
	 * 
	 *  O primeiro, e notável, grande benefício da orientação a objetos (O.O), é sem dúvida a 
	 * portabilidade, i.e, o fato de ser uma linguagem multi-plataforma. Você não precisa 
	 * escrever um códido pra windows, depois reescrever o mesmo código pra linux ou MAC OS,
	 * com a máquina virtual instalada um mesmo código servirá pra qualquer um desses S.O's.
	 * Depois temos o reaproveitamento de código. A O.O lhe permite escrever de forma suscinta
	 * um código que em uma linguagem estruturada, como C por exemplo, levaria muito tempo pra
	 * ser escrito e a "reusabilidade" do código é muito difícil. Com o conceito de classes, 
	 * heranças, polimorfismo, etc, podemos usar um mesmo código em diferentes projetos fazendo 
	 * apenas algumas modificações que sejam necessárias. Outra vantagem é a agilidade na manutenção
	 * do código. Pelo mesmo fato do código ser reusável, essa conecção que a orientação a objetos
	 * nos proporciona permiti-nos identificar bugs mais facilmente e corrigi-los de forma simples
	 * e prática, não tendo que fazer alterações ao longo de todo fonte. Uma outra característica 
	 * que ajuda muito também é a abstração da O.O. Você não precisa reiventar a roda, já tem ronta! 
	 * Cabe apenas ao programador moldar seu problema e fazer uso da enorme biblioteca Java - 
	 * diferente de liguagens como assemly, c...
	 * 
	 **********************************************************************************************   
	 *   
	 * 
	 * Questão 4: Defina e exemplifique Polimorfismo.
	 * 
	 * 
	 * @resposta:
	 * 
	 *  Polimorfismo, como a palavra sugere (poli = muitos, morpho = forma), é a capacidade de um OBJETO
	 * ser referenciado por mais de uma classe. Exemplo: temos uma funcionário e uma atendente. Um
	 * atendente é um funcionário por definição. Se um método que calcula as férias de um funcionário
	 * for implementado e configurado pra receber um funcioário como referência, um atendente, just in time,
	 * pode ser referenciado como funcioário, porém os métodos pertinentes à classe atendente continuam sendo
	 * da mesma.
	 * 
	 * **********************************************************************************************	
	*/

}
