package com.natanael.cursojava.aula25;

import java.util.Scanner;

public class JogoDaVelha {
	char[][] tabuleiro = new char[3][3];
	Scanner scan = new Scanner(System.in);
	char sinal;
	byte jogada = 1;
	boolean linhaValida = false, colunaValida = false;
	byte linha = 0, coluna = 0;

	void iniciarTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = '.';
			}
		}
	}

	void exibirTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println();
		}
	}

	void exibirTurno() {
		if (jogada % 2 != 0) {
			System.out.println("Vez do jogador 1. Escolha a linha e coluna(1-3)");
			sinal = 'X';
		} else {
			System.out.println("Vez do jogador 2. Escolha a linha e coluna(1-3)");
			sinal = 'O';
		}
	}

	boolean validarLinha() {
		System.out.println("Entre com a linha 1, 2 ou 3");
		linha = scan.nextByte();

		if (linha >= 1 && linha <= 3) {
			return true;
		} else {
			System.out.println("Linha invalida, tente novamente");
			return false;
		}
	}

	boolean validarColuna() {
		System.out.println("Entre com a coluna 1, 2 ou 3");
		coluna = scan.nextByte();

		if (coluna >= 1 && coluna <= 3) {
			return true;
		} else {
			System.out.println("Coluna invalida, tente novamente");
			return false;
		}
	}

	void validarPosicaoDisponivel() {
		linha--;
		coluna--;
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			System.out.println("Posição já ocupada, tente novamente");
		} else {
			tabuleiro[linha][coluna] = sinal;
			jogada++;
		}
	}

	boolean validarGanhador() {
		if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')
				|| (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')
				|| (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')
				|| (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[1][2] == 'X')
				|| (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X')
				|| (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')
				|| (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')
				|| (tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X')) {
			System.out.println("Parabéns, jogador 1 ganhou!");
			return true;
		} else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O')
				|| (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')
				|| (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')
				|| (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[1][2] == 'O')
				|| (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O')
				|| (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')
				|| (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')
				|| (tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O')) {
			System.out.println("Parabéns, jogador 2 ganhou!");
			return true;
		} else if (jogada > 9) {
			System.out.println("Empate, ninguém ganhou!");
			return true;
		} else {
			return false;
		}
	}
}
