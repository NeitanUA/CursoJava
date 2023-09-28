package com.natanael.cursojava.aula43.labs;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double calcularImposto() {

		return getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "CNPJ: " + getCnpj() + "\n" 
				+ "Imposto de renda: $" + format.format(calcularImposto())
				+ "\n";
	}
}
