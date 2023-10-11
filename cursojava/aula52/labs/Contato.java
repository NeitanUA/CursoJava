package com.natanael.cursojava.aula52.labs;

public class Contato {

	private static int contadorId;
	private int id;
	private String nome;
	private String telefone;
		


	public Contato() {		
		this.id = contadorId;
		contadorId ++;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Identificador: " + id + "\n"
				+ "Nome: " + nome + "\n" 
				+ "Telefone: " + telefone;
	}
	
	
	
}
