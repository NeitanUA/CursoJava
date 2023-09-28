package com.natanael.cursojava.aula43.labs;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Animal camelo = new Animal();			
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidadeMs(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);		
		tubarao.setVelocidadeMs(1.5);
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelho");		
		urso.setVelocidadeMs(0.5);
		urso.setAlimento("Mel");
		
		Animal[] animais = {camelo, tubarao, urso};
		
		System.out.println("Zoo:\n------------------------------");
		for(Animal a : animais) {
			System.out.println(a);
			System.out.println("------------------------------");
		}
	}
}
