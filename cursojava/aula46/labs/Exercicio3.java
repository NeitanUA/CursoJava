package com.natanael.cursojava.aula46.labs;

public class Exercicio3 {
	public static void main(String[] args) {

		// 2D
		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setCor("Vermelho");
		quadrado.setLados(2);

		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triangulo");
		triangulo.setCor("Amarelo");
		triangulo.setAltura(2);
		triangulo.setBase(3);

		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setCor("Azul");
		circulo.setRaio(2);

		// 3D
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setCor("Verde");
		cubo.setLados(3);

		Piramide piramide = new Piramide();
		piramide.setNome("Piramide");
		piramide.setCor("Preto");
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);

		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setCor("Laranja");
		cilindro.setAltura(3);
		cilindro.setRaio(2);

		FiguraGeometrica[] array = { quadrado, triangulo, circulo, cubo, piramide, cilindro };
		System.out.println("------------ Figuras Geometricas ------------");
		for (FiguraGeometrica f : array) {

			System.out.println(f.toString());
			System.out.println("------------------------");
		}
	}
}
