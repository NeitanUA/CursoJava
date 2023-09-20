package com.natanael.cursojava.aula34.labs;

public class Contador {
	private static int cont;
		
	public Contador(){
		incrementar();
	}

	public static void zerar() {
		cont = 0;
	}
	
	public static void incrementar() {
		cont ++;
	}
	
	public static int valorContador() {
		return cont;
	}
}
