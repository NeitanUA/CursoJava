package com.natanael.cursojava.aula25;

public class Lampada {
	String tipo;
	String consumo;
	byte durabilidadeAnos;
	
	boolean ligarDesligar(boolean lampada) {
		if(lampada == false) {			
			lampada = true;
			System.out.println("Lampada Ligada");
			return lampada;
		}else {
			lampada = false;
			System.out.println("Lampada Desigada");
			return lampada;
		}			
		
	}
}

