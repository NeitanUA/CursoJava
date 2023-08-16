package com.natanael.cursojava.aula20;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			String[][][] agenda = new String[12][31][9];			
			boolean flag = true;
			String caso;			
			short mes = 0;
			short dia = 0;
			short horas = 0;
			
			while(flag == true) {
				System.out.println("------Menu Agenda------");
				System.out.println("0. Sair");
				System.out.println("1. Consultar");
				System.out.println("2. Inserir");
				caso = scan.next();
				
				switch (caso) {
				case "0":
					flag = false; 					
				break;
				
				case "1":					
					System.out.println();
					for(int i=0; i<agenda.length; i++) {
						System.out.println("=======" + "Mês " + (i + 1) + "=======");
						for(int j=0; j<agenda[i].length; j++) {							
							System.out.print((j+1) + "º Dia ");
							for(int k=0; k<agenda[i][j].length; k++) {							
								System.out.print("Às " + k + "h Horas[ " + agenda[i][j][k] + " ] ");
							}
							System.out.println();
							System.out.println();
						}
						System.out.println();
						System.out.println();
					}
					
				break;
				
				case "2":
					System.out.print("Qual o Mês Você Deseja Inserir um Compromisso: ");
					mes = scan.nextShort();
					
					System.out.print("Qual o Dia do Mês Você Deseja Inserir um Compromisso: ");
					dia = scan.nextShort();
					
					System.out.print("Quantas Hora Começa o Compromisso: ");
					horas = scan.nextShort();
					
					System.out.print("Descreva o Compromisso: ");
					agenda[--mes][--dia][horas] = scan.next();
				break;
				default:
					System.out.println("Valor Invalido");
				}
			}					
		}
	}
}
