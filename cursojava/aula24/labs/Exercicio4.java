package com.natanael.cursojava.aula24.labs;

public class Exercicio4 {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();

		livro.idLivro = 0;
		livro.nome = "Cracking the Coding Interview";
		livro.altor = "Gayle Laakmann McDowell";
		livro.dataPublicacao = "01/07/2008";
		livro.quemAlugol = "Natanael";

		System.out.println("Id: " + livro.idLivro);
		System.out.println("Nome: " + livro.nome);
		System.out.println("Altora: " + livro.altor);
		System.out.println("Data de Publicação: " + livro.dataPublicacao);
		System.out.println("Quem alugol: " + livro.quemAlugol);

	}

}
