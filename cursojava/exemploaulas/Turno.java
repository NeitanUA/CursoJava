package com.natanael.cursojava.exemploaulas;

import java.util.Scanner;

public class Turno {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Qual turno você estuda Matutino, Vespertino ou Noturno: ");
			String turno = scan.next();
			
			switch(turno) {
			case "m":
			case "M": System.out.println("Bom Dia!"); break;
			case "v":
			case "V": System.out.println("Boa Tarde!"); break;
			case "n":
			case "N": System.out.println("Boa Noite!"); break;
			default: System.out.println("Valor Invalido!");
			}				
		}
	}
}
