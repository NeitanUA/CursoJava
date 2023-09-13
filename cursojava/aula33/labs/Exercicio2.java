package com.natanael.cursojava.aula33.labs;

public class Exercicio2 {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setNumero("123456");
		contaCorrente.setAgencia("1234");
		contaCorrente.setEspecial(true);
		contaCorrente.setLimiteEspecial(500);
		contaCorrente.setSaldo(-10);
		
		System.out.println("Saldo da conta " + contaCorrente.getNumero() + " = " + contaCorrente.getSaldo());
		boolean saqueEfetuado = contaCorrente.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultaSaldo();
		}else{
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}
		
		saqueEfetuado = contaCorrente.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultaSaldo();
		}else {
			System.out.println("Não foi possível realizar saque. saldo insuficiente");
		}
				
		System.out.println("Depósito de 500 reais");
		contaCorrente.depositar(500);
		contaCorrente.consultaSaldo();
		
		if(contaCorrente.verificarSaldoEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
		
		contaCorrente.realizarSaque(600);
		contaCorrente.consultaSaldo();
		
		if(contaCorrente.verificarSaldoEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
	}
}
