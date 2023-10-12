package com.natanael.cursojava.aula56.exercicio;

enum Operacao {
	
	SOMAR("+"){
		@Override
		public double executarOperacao(double x, double y) {			
			return x + y;
		}		
	}, 
	DIVIDIR("/"){
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	}, 
	MULTIPLICAR("*"){
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	}
	, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {			
			return x - y;
		}
	};
	
	private String sinal;
	
	Operacao(String sinal){
		this.sinal = sinal;
	}
	
	public abstract double executarOperacao(double x, double y);
	
	public String toString() {
		return this.sinal;
	}
}

public class Teste {	
	
	public static void main(String[] args) {
		
		double x = 2;
		double y = 4;

		Operacao[] calc = Operacao.values();
		
		for(int i=0; i<Operacao.values().length; i++) {
			System.out.print(x + " " +  calc[i] + " " + y + " = " + calc[i].executarOperacao(x, y) + "\n");
		}
		
		System.out.println();
		for(Calculadora c : Calculadora.values()) {
			System.out.print(x + " " + c.toString() + " " + y + " = " + c.executarOperacao(x, y) + "\n");
		}
	}
	
}
