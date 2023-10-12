package com.natanael.cursojava.aula54;

public class Formulario {
	
	enum Genero{
		FEMININO('F'), MARCULINO('M');
		
		private char valor;
		
		private Genero(char valor){
			
			this.valor = valor;
		}
		
		private String nome;
		private Genero genero;
	}
}
