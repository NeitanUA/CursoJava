package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {		
		try (Scanner scan = new Scanner(System.in)) {
			boolean valido = false;
			String usuario, senha;
			
			do {
				System.out.print("Digite seu nome de usuario: ");
				usuario = scan.next();
				
				System.out.print("Digite sua senha: ");
				senha = scan.next();				
				
				if(usuario.equalsIgnoreCase(senha)) {
					System.out.println("Usuario e senha não podem ser iguais ");
				}
				
				else {
					System.out.println("Usuario e senha validos! ");
					valido = true;
				}
			}while(!valido);
		}
	}
}
