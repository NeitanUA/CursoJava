package com.natanael.cursojava.aula20;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			char[][] tabuleiro = new char[3][3];
			boolean ganhou = false;
			char sinal;
			byte jogada = 1, linha = 0, coluna = 0;
			
			
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					tabuleiro[i][j] = '.';
				}
			}
			
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println();
			}
						
			while (ganhou == false) {
				if(jogada % 2 != 0) {					
					System.out.println("Vez do jogador 1. Escolha a linha e coluna(1-3)");
					sinal = 'X';										
					
				}else {					
					System.out.println("Vez do jogador 2. Escolha a linha e coluna(1-3)");
					sinal = 'O';
				}
				
				boolean linhaValida = false;
				while(linhaValida == false) {
					System.out.println("Entre com a linha 1, 2 ou 3");
					linha = scan.nextByte();
					if(linha >=1 && linha <=3) {
						linhaValida = true;
					}else {
						System.out.println("Linha invalida, tente novamente");
					}
				}
				
				boolean colunaValida = false;
				while(colunaValida == false) {
					System.out.println("Entre com a coluna 1, 2 ou 3");
					coluna = scan.nextByte();
					if(coluna >=1 && coluna <=3) {
						colunaValida = true;
					}else {
						System.out.println("Coluna invalida, tente novamente");
					}
				}
				
				linha--;
				coluna--;
				if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
					System.out.println("Posição já ocupada, tente novamente");
				}else{
					tabuleiro[linha][coluna] = sinal;
					jogada++;
				}
				
				for (int i = 0; i < tabuleiro.length; i++) {
					for (int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print(tabuleiro[i][j] + " | ");
					}
					System.out.println();
				}
				
				if((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||
						(tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')||
						(tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')||
						(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[1][2] == 'X')||
						(tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X')||
						(tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')||
						(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')||
						(tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X')) {
					System.out.println("Parabéns, jogador 1 ganhou!");
					ganhou = true;
				}else if((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') ||
						(tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')||
						(tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')||
						(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[1][2] == 'O')||
						(tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O')||
						(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')||
						(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')||
						(tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O')) {
					System.out.println("Parabéns, jogador 2 ganhou!");
					ganhou = true;
				}else if(jogada > 9){
					System.out.println("Empate, ninguém ganhou!");
					ganhou = true;
				}
			}
		}
	}
}
