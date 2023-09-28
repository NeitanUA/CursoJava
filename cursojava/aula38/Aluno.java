package com.natanael.cursojava.aula38;

public class Aluno extends Pessoa{
	private String curso;
	private String[][] notas;

	public Aluno() {
		super();	
	}	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[][] getNotas() {
		return notas;
	}
	public void setNotas(String[][] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		this.setCpf("00005000000");
		super.setCpf("111111111111");
	}
}
