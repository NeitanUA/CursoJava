package com.natanael.cursojava.aula25;

public class ContaCorrente {
	String numeroConta;
	double saldo;
	boolean statusEspecial;
	double limite;
	
	void sacar(double valorSaque) {
		if(valorSaque <= saldo) {
			saldo = saldo - valorSaque;
			System.out.println("Saque Concluido com Sucesso");
		}
		else if((valorSaque > saldo) && (statusEspecial == true)) {
			saldo = saldo - valorSaque;
			System.out.println("Saque Cheque Especial Concluido com Sucesso");
		}
		else {
			System.out.println("Valor de Saquer Invalido");
		}
	}
	
	void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
		System.out.println("Deposito Concluido com Sucesso");
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	void verificaChequeEspecial() {
		if((statusEspecial == true) && (saldo >= 0)) {
			System.out.println("Sua conta Possui Cheque Especial mas não Foi Usado");
		}else if((statusEspecial == true) && (saldo < 0)) {
			System.out.println("Sua conta Possui Cheque Especial Está Usando $" + (saldo * -1) + " em cheque Especial");
		}
		else {
			System.out.println("Sua conta Não Possui Cheque Especial");
		}
	}
}
