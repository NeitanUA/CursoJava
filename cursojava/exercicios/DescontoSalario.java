package com.natanael.cursojava.exercicios;

import java.util.Scanner;

public class DescontoSalario {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.print("Quanto você ganha por hora: ");
			double valorPorHora = scan.nextFloat();
			
			System.out.print("Quantas horas você trabalhou esse mês: ");
			double horasTrabalhadas = scan.nextFloat();
			
			double salarioBruto = valorPorHora * horasTrabalhadas;			
			double impostoRenda = ((salarioBruto * 11) / 100);
			double inss = ((salarioBruto * 8) / 100);
			double sindicato = ((salarioBruto * 5 ) / 100);
			double liquido = salarioBruto - impostoRenda - inss - sindicato;
			double descontoTotal = impostoRenda + inss + sindicato;
			
			System.out.println("+ Salário Bruto : R$" + salarioBruto);
			System.out.println("- IR (11%) : R$" + impostoRenda);
			System.out.println("- INSS (8%) : R$" + inss);
			System.out.println("- Sindicato ( 5%) : R$" + sindicato);
			System.out.println("= Desconto Total: R$" + descontoTotal);
			System.out.println("= Salário Liquido : R$" + liquido);
		}			
	}
}
