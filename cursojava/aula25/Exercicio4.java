package com.natanael.cursojava.aula25;

public class Exercicio4 {
	public static void main(String[] args) {
		JogoDaVelha jogo = new JogoDaVelha();

		jogo.iniciarTabuleiro();
		while (!jogo.validarGanhador()) {
			jogo.exibirTabuleiro();
			jogo.exibirTurno();
			while (!jogo.validarLinha());
			while (!jogo.validarColuna());		
			jogo.validarPosicaoDisponivel();
		}
		jogo.exibirTabuleiro();
	}
}
