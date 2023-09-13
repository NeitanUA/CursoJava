package com.natanael.cursojava.aula33.labs;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		JogoDaVelha jogo = new JogoDaVelha();

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {
			if (jogo.vezJogador1()) {
				System.out.println("Vez do jogador 1. Escolha a linha e coluna(1-3).");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha a linha e coluna(1-3).");
				sinal = 'O';
			}
			
			jogo.imprimirTabuleiro();
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if(!jogo.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já usada, tente novamente");
			}
			
			
			if(jogo.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns jogador 1 ganhou!");
			}else if(jogo.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns jogador 2 ganhou!");
			}else if(jogo.getJogada() > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou.");
			}
		}
		jogo.imprimirTabuleiro();
	}

	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + " 1, 2 ou 3");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada invalida, tente novamente");
			}			
		}
		valor--;
		return valor;
	}
}
