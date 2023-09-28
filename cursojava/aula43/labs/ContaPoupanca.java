package com.natanael.cursojava.aula43.labs;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo(int diaAtual) {
		if(diaAtual == this.diaRendimento) {
			double saldo = getSaldo();
			saldo += (saldo * 0.005);
			super.setSaldo(saldo);
		}
	}

	@Override
	public String toString() {
		
		return "====== Conta Poupança ======\n" +
				"Nome do cliente: " + getNomeCliente() + "\n" 
				+ "Numero da conta: " + getNumConta() + "\n" 
				+ "Saldo: " + getSaldo() + "\n"
				+ "Dia do rendimento: " + diaRendimento + "\n\n";
	}
}
