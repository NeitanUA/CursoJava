package com.natanael.cursojava.exemploaulas;

import java.util.Scanner;

public class TempoDownload {
	public static void main (String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.print("Qual o tamanho do arquivo em (MB): ");
			double tamanhoArquivo = scan.nextDouble();
			
			System.out.print("Qual a velocidade do link de Internet em (Mbps): ");
			double velocidadeLink = scan.nextDouble();
			
			double resultado = ((tamanhoArquivo / velocidadeLink) / 60);
			
			System.out.print("O tempó aproximado de Download do arquivo é: " + resultado + " Minutos");
		}
	}
}
