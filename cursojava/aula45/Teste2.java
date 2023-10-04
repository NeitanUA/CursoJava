package com.natanael.cursojava.aula45;

public class Teste2 {
	public static void main(String[] args) {
		
		Object obj1 = obterString();
		String obj2 = (String) obj1;
		
		Object obj3 = "String";
		String obj4 = (String) obj3;
		
		Object obj5 = obterInteiro();
		Integer obj6 = (Integer) obj5;
		
		if(obj2 instanceof String) {
			System.out.println("É do tipo String");
		}
		if(obj4 instanceof Object) {
			System.out.println("É do tipo Object");
		}
		if(obj6 instanceof Integer) {
			System.out.println("É do tipo Integer");
		}
	}
	
	public static String obterString() {
		return "Minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}
}
