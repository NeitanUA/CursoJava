package com.natanael.cursojava.aula45;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private double salario;

	public void verificarAcesso() {
		super.nomeVisibilidade = "1";
		this.nomeVisibilidade = "2";
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}

	public void obterEtiquetaEndereco() {

		String s = "Endereço do Aluno: ";
		s += super.getEndereco();		
		System.out.println(s);
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo Endereço do professor");
		this.obterEtiquetaEndereco();		
	}
}
