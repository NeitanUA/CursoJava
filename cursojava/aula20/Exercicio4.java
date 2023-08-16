package com.natanael.cursojava.aula20;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			String[][] agenda = new String[24][31];			
			boolean flag = true;
			String caso;
			short dia;
			short horas;
			
			while(flag == true) {
				System.out.println("------Menu Agenda------");
				System.out.println("0. Sair");
				System.out.println("1. Consultar");
				System.out.println("2. Inserir");
				caso = scan.next();
				
				switch (caso) {
				case "0": {
					flag = false; 
					break;
				}
				case "1": {					
					System.out.println();
					for(int i=0; i<agenda.length; i++) {
						System.out.println("=======" + "Dia " + (i + 1) + "=======");
						for(int j=0; j<agenda[i].length; j++) {							
							System.out.print((j+1) + "h[ " + agenda[i][j] + " ] ");
						}
						System.out.println();
						System.out.println();
					}
					break;
				}
				case "2": {
					System.out.println("Qual o Dia Você Deseja inserir um Compromisso: ");
					dia = scan.nextShort();
					
					System.out.println("Quantas Hora Começa o Compromisso: ");
					horas = scan.nextShort();
					
					System.out.println("Descreva o Compromisso: ");
					agenda[--dia][horas] = scan.next();
					break;
				}
				default:
					System.out.println("Valor Invalido");
				}
			}
			
			

		}
	}
}
