package com.natanael.cursojava.aula24.labs;

public class Exercicio5 {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
				
		contaCorrente.numeroConda = "9999-9999-9999-9999";
		contaCorrente.status = false;
		contaCorrente.limite = 1000;
		contaCorrente.saldo = 500;
		
		System.out.println("Numero da conta: " + contaCorrente.numeroConda);
		System.out.println("Conta especial: " + contaCorrente.status);
		System.out.println("Limite: " + contaCorrente.limite);
		System.out.println("Saldo: " + contaCorrente.saldo);
	}

}
