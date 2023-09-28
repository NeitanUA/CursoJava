package com.natanael.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
	private String curso;
	private double[] notas;

	public void verificarAcesso() {
//		super.nomeVisibilidade = "1";
//		this.nomeVisibilidade = "2";
//
//		this.setNomeVisibilidade("1");
	}

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void metodoQualquer() {
//		this.setCpf("00005000000");
//		super.setCpf("111111111111");
	}

	public String obterEtiquetaEndereco() {

		String s = "Endereço do Aluno: ";
//		s += super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());		
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(curso);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return false;
	}
		
		
//	public String toString() {
//		String s = this.curso + "\n";
//		
//		for(double nota : notas) {
//			s += nota + ", ";
//		}
//		
//		return s;
//		
//	}
}
