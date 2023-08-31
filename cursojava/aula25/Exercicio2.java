package com.natanael.cursojava.aula25;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] arg) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.numeroConta = "0000-0000-0000-0001";
		contaCorrente.saldo = 0;
		contaCorrente.statusEspecial = true;
		contaCorrente.limite = 2.000;
		
		double valorTrasacao;
		boolean sair = false;
		String opcoes;
		try(Scanner scan = new Scanner(System.in)){
			while(!sair) {
				System.out.println("========= Conta Correte =========");
				System.out.println("Digite 0 para Sair");
				System.out.println("Digite 1 para Depositar");
				System.out.println("Digite 2 para Ver o seu Saldo");
				System.out.println("Digite 3 para Sacar");
				System.out.println("Digite 4 para Informações de Cheque Especial");
				opcoes = scan.next();
				switch(opcoes){
					case "0": 
						sair = true;
						System.out.println("========= Programa Finalizado =========");
					break;
					
					case "1": 
						System.out.println("Digite o Valor de Deposito");
						valorTrasacao = scan.nextDouble();
						contaCorrente.depositar(valorTrasacao); 
					break;
					
					case "2": 
						System.out.println("Seu Saldo é: " + contaCorrente.consultarSaldo());												
					break;
					
					case "3": 
						System.out.println("Digite o Valor de Saque");
						valorTrasacao = scan.nextDouble();
						contaCorrente.sacar(valorTrasacao); 
					break;
					
					case "4": 
						contaCorrente.verificaChequeEspecial();
					break;
					
					default: System.out.println("Numero Invalido"); break; 
				}
			}
		}
		
	}
}
