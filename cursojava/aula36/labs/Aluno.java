package com.natanael.cursojava.aula36.labs;

public class Aluno {
	public String nome;
	private String matricula;
	private double[] notas;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}			
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String infoAlunos() {
		return "Nome: " + nome + "\n" +
				"Número da matricula: " + matricula + "\n" +
				"Notas: " + notasAluno() + "\n"+
				"Média: " + media() + "\n" +
				"Aprovado: " + aprovado() +
				"\n\n";
	}
	
	public String notasAluno() {
		String info = "";
		for(int i=0; i<notas.length; i++) {
			info += notas[i];
			info += ", ";
		}
		return info;
	}
	
	public double media() {
		double media = 0;
		for(int i=0; i<notas.length; i++) {
			media += notas[i];
		}
		return media / notas.length;
	}
	
	public boolean aprovado() {
		double media = media();
		if(media >=7) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
