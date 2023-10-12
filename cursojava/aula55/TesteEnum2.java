package com.natanael.cursojava.aula55;

import com.natanael.cursojava.aula53.DiaSemana;

public class TesteEnum2 {
	public static void main(String[] args) {
		DiaSemana dia;
		
		
		try {
			dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");
			
			if(dia == DiaSemana.QUARTA) {
				System.out.println("Hoje é Quarta");
			}else {
				System.out.println("Hoje não é Quarta");
			}
		} 
		catch (Exception e) {
			System.out.println("Enum não existe");
		}
	}
}
