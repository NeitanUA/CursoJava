package com.natanael.cursojava.aula43.labs;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valor) {
		
		double limite = getLimite() * -1;
		double saldo = getSaldo();
		if(saldo - valor < limite) {
			System.out.println("Limite de saque excedido");			
		}else {
			saldo -= valor;
			setSaldo(saldo);
		}
	}
	
	@Override
	public String toString() {
		
		return  "====== Conta Especial ======\n" +
				"Nome do cliente: " + getNomeCliente() + "\n" 
				+ "Numero da conta: " + getNumConta() + "\n" 
				+ "Saldo: " + getSaldo() + "\n"
				+ "Cheque especial: " + getLimite() + "\n\n";
	}
}
