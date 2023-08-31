package com.natanael.cursojava.aula25;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Lampada lampada = new Lampada();
			lampada.tipo = "Led";
			lampada.consumo = "Baixo";
			lampada.durabilidadeAnos = 18;
			boolean status = true;
			boolean parada = false;
			byte escolhaUsuario;

			while (!parada) {
				System.out.println("Tipo da Lampada: " + lampada.tipo);
				System.out.println("Consumo da Lampada: " + lampada.consumo);
				System.out.println("Durabilidade da Lampada: " + lampada.durabilidadeAnos + " Anos");
				System.out.println();

				System.out.println("Digite 0 para Sair do programa");
				System.out.println("Digite 1 para Desligar ou Ligar a Lampada");
				escolhaUsuario = scan.nextByte();
				if (escolhaUsuario == 1) {
					status = lampada.ligarDesligar(status);
				} else if (escolhaUsuario == 0) {
					parada = true;
				} else {
					System.out.println("Valor Invalido");
				}
			}
		}
	}
}
