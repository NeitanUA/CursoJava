package com.natanael.cursojava.aula36.labs;

public class Contato {
	
	private String nome;
	private String email;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String obterInfo() {
		return "Nome: " + nome + "\n" 
				+ "Telefone: " + telefone + "\n" 
				+ "Email: " + email + "\n \n";
	}
}
