package com.natanael.cursojava.aula36.labs;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String exibirInfos() {
		return "Nome do curso: " + nome + "\n" + 
				"Horario do curso: " + horario + "\n" +
				"Professor do curso: " + professor.infoProfessor() + "\n" +
				"===== Alunos do curso ===== \n" + alunosCuso() + "\n" +
				"Media da Turma: " + mediaAlunos();
	}
	
	public String alunosCuso() {
		String info = "";
		for(Aluno a : alunos) {
			info += a.infoAlunos();			
		}
		return info;
	}
	
	public double mediaAlunos() {
		double media = 0;
		
		for(Aluno a : alunos) {
			media += a.media();
		}
		return media /alunos.length;
	}
	
}
