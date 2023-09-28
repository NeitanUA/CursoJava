package com.natanael.cursojava.aula43.labs;

public class Animal {
	private String nome;
	private int comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private double velocidadeMs;	

	public Animal() {
		
		setNumeroPatas(4);	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidadeMs() {
		return velocidadeMs;
	}

	public void setVelocidadeMs(double velocidadeMs) {
		this.velocidadeMs = velocidadeMs;
	}

	@Override
	public String toString() {
		return "Animal: " + nome + "\n" 
				+"Comprimento: " + comprimento + " cm\n"
				+"Patas: " + numeroPatas + "\n"
				+"Cor: " + cor + "\n"
				+"Ambiente: " + ambiente + "\n"
				+"Velocidade: " + velocidadeMs + " m/s";				
	}	
	
}
