package com.natanael.cursojava.aula54;

public class Teste {
	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - "  + dia.getValor());
		
		Data data = new Data(11, 10, 2023, DiaSemana.QUARTA);
		
		System.out.println(data.toString());			
		
		Formulario.Genero genero = Formulario.Genero.MARCULINO;
		
		System.out.println(genero);
				
	}
}
