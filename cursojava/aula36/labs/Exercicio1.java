package com.natanael.cursojava.aula36.labs;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			Agenda agenda = new Agenda();			
			
			boolean sai = false;			
			String escolha;
			
			System.out.println("Entre com o nome da Agenda: ");
			agenda.setNome(scan.next());
				
			while(!sai) {				
				System.out.println("Precione 0 para sair");
				System.out.println("Precione 1 para cadastrar os três contatos");
				System.out.println("Precione 2 para exibir os contatos");
				escolha = scan.next();
				
				switch(escolha) {
				
				case "0":
					sai = true;
				break;
				
				case "1":					
					Contato[] arrayContatos = new Contato[3];
					for(int i=0; i<3; i++) {
						Contato contato = new Contato();
						
						System.out.println("Nome do " + (i+1) + "º contato: ");
						contato.setNome(scan.next());
						
						System.out.println("Email do "+ (i+1) +"º contato: ");
						contato.setEmail(scan.next());
						
						System.out.println("Telefone do "+ (i+1) +"º contato: ");
						contato.setTelefone(scan.next());
						
						arrayContatos[i] = contato;
					}
					
					agenda.setContatos(arrayContatos);					
				break;
				
				case "2":
					if(agenda != null) {
						System.out.println(agenda.exibirInfos());
					}
				break;				
				
				default:
					System.out.println("Valor invalido");
				break;				
				}
			}
		}
	}	
}
