package com.natanael.cursojava.aula42;

public class Professor {

	private String departamento;
	private String nomeCurso;
	private double salario;

	public void verificarAcesso() {
		//super.nomeVisibilidade = "1";
		//this.nomeVisibilidade = "2";
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

	public String obterEtiquetaEndereco() {

		String s = "Endereço do Professor: ";
		//s += super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo Endereço do professor");
		System.out.println(this.obterEtiquetaEndereco());		
	}
}
