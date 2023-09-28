package com.natanael.cursojava.aula43.labs;

public class Mamifero extends Animal {

	private String alimento;
	
	public Mamifero() {
		setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString() + "\n"
				+"Alimento: " + alimento;				
	}
	
	
}
