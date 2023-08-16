package com.natanael.cursojava.aula24.labs;

public class Exercicio1 {
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.modelo = "Incandescente";
		lampada.preco = "Baixo";
		lampada.durabilidade = "Baixa";
		lampada.gastoEnergetico = "Alto";
		
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Preço: " + lampada.preco);
		System.out.println("Consumo de energia: " + lampada.gastoEnergetico);
		System.out.println("Durabilidade: " + lampada.durabilidade);
		
		lampada.modelo = "Led";
		lampada.preco = "Relativamente Alto";
		lampada.durabilidade = "Alta";
		lampada.gastoEnergetico = "Baixo";
		
		System.out.println();
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Preço: " + lampada.preco);
		System.out.println("Consumo de energia: " + lampada.gastoEnergetico);
		System.out.println("Durabilidade: " + lampada.durabilidade);		
	}
}
