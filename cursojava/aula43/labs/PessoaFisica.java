package com.natanael.cursojava.aula43.labs;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double calcularImposto() {

		double renda = this.getRendaBruta();

		if (renda <= 1400) {
			return 0;
		}

		else if (renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}

		else if (renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}

		else if (renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}

		return (renda * 0.3) - 700;
	}

	@Override
	public String toString() {
		return super.toString() +
				"CPF: " + getCpf() + "\n" 
				+ "Imposto de renda: $" + format.format(calcularImposto())
				+ "\n";
	}

}
