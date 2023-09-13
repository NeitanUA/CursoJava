package com.natanael.cursojava.aula33.labs;

public class JogoDaVelha {
	
	private char[][] tabuleiro;	
	private byte jogada;		

	
	public JogoDaVelha() {		
		this.tabuleiro = new char[3][3];
		this.jogada = 1;
	}
	
	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public byte getJogada() {
		return jogada;
	}

	public void setJogada(byte jogada) {
		this.jogada = jogada;
	}

	public boolean validarJogada(int linha, int coluna, char sinal) {
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			return false;
			
		} else {
			tabuleiro[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}

	public void imprimirTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public boolean verificarGanhador(char sinal) {
		if ((tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal)
				|| (tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal)
				|| (tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal)//valida as três linhas na horizontal 
				|| (tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal)
				|| (tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal)
				|| (tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal)//valida as três linhas na vertical
				|| (tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal)
				|| (tabuleiro[2][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[0][2] == sinal)) {//valida as duas linhas na diagonal
			return true;
		}
		return false;
	}

	public boolean vezJogador1() {
		if (jogada % 2 == 1) {
			return true;
		}
		return false;
	}

}
