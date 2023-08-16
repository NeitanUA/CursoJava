package com.natanael.cursojava.aula24.labs;

public class Exercicio3 {
	public static void main(String[] args) {
		LivroDeLivraria livro = new LivroDeLivraria();
		
		livro.idLivro = 0;
		livro.nome = "Entendendo Algoritmos";
		livro.altor = "Aditya Y. Bhargava";
		livro.dataPublicacao = "20/04/2017";
		livro.preco = 64.98f;
		
		
		System.out.println("Id: " + livro.idLivro);
		System.out.println("Nome: " + livro.nome);
		System.out.println("Altor: " + livro.altor);
		System.out.println("Data de Publicação: " + livro.dataPublicacao);
		System.out.println("Preço: " + livro.preco);
	}
}
