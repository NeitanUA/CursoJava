package com.natanael.cursojava.aula24.labs;

public class Exercicio6 {

	public static void main(String[] args) {
		ContatoAgenda contatoAgenda = new ContatoAgenda();

		contatoAgenda.nome = "Natanael";
		contatoAgenda.numero = "(61) 98635-3316";
		contatoAgenda.email = "natanael1523@gmail.com";

		System.out.println("Nome: " + contatoAgenda.nome);
		System.out.println("Numero: " + contatoAgenda.numero);
		System.out.println("E-mail: " + contatoAgenda.email);
	}

}
