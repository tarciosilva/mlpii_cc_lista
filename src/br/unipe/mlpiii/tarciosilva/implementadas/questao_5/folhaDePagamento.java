package br.unipe.mlpiii.tarciosilva.implementadas.questao_5;


public class folhaDePagamento {

	private int salario;
	
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

		
public void getSalario(String entrada) {
		
		String n[] = entrada.split("\\D");

		for (int i = 0; i < n.length; i++) {
			if (!n[i].isEmpty()) {

				this.setSalario(this.salario += Integer.valueOf(n[i]));
				Funcionario func = new Funcionario(this.getSalario());
								
			}
			
		}
				
	}
	
	
	
}


