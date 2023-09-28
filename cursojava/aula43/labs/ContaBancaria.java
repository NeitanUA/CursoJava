package com.natanael.cursojava.aula43.labs;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (saldo - valor < 0) {
			System.out.println("Saque invalido");
		} else {
			setSaldo(saldo -= valor);
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		
		return  "====== Conta Basica ======\n" +
				"Nome do cliente: " + nomeCliente + "\n" 
				+ "Numero da conta: " + numConta + "\n" 
				+ "Saldo: " + saldo + "\n\n";
	}

}
