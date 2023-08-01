package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {	
		try (Scanner scan = new Scanner(System.in)){
			boolean valido = false;
			String nome, estadoCivil, sexo;
			double salario;
			short idade;
			 
			do{
				System.out.print("Digite Seu Nome: ");
				nome = scan.next();
				
				if(nome.length() <= 3) 
				{
					System.out.println("Precisa ter mais de 3 caracteres");
				}
				else
				{
					System.out.println("Nome Valido");
					valido = true;
				}
			}while(!valido);
			
			valido = false;
			do{
				System.out.print("Digite Sua Idade: ");
				idade = scan.nextShort();
				
				if((idade < 0) || (idade > 150)) 
				{
					System.out.println("Precisa esta entre 0 a 150");
				}
				else {
					System.out.println("Idade Valida");
					valido = true;
				}					
			}while(!valido); 

			valido = false;
			do {
				System.out.print("Digite Seu Sexo: ");
				sexo = scan.next();
				
				if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) 
				{
					System.out.println("Sexo Valido");
					valido = true;
				}
				else 
				{
					System.out.println("Sexo invalido, digite \"f\" para Feminino ou \"m\" para Masculino");				
				}			
			}while(!valido);
			
			valido = false;
			do{
				System.out.print("Digite Seu Salário: ");
				salario  = scan.nextDouble();
				
				if(salario <= 0) 
				{
					System.out.println("Precisa ser maior que 0");
				}
				else 
				{
					System.out.println("Salario Valido");
					valido = true;
				}					
			}while(!valido);					

			valido = false;
			do{
				System.out.print("Digite Seu Estado Civil \'s\', \'c\', \'v\', \'d\': ");
				estadoCivil = scan.next();
				
				if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d"))
				{
					System.out.println("Estado Civil Valido");
					valido = true;
				}
				else 
				{
					System.out.println("Estado Civil Invalido");				
				}				
			}while(!valido);
			
			System.out.println("-----------------------------");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Salário: " + salario);
			System.out.println("Sexo: " + sexo);
			System.out.println("Estado Civil: " + estadoCivil);
			System.out.println("-----------------------------");
		}
	}	
}