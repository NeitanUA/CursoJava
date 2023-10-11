package com.natanael.cursojava.aula52.labs;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			boolean sair = false;
			String caso = " ";
			Agenda agenda = new Agenda();			
			Contato[] contatos = new Contato[3];
			String addContato = " ";			
			
			while (!sair) {
				System.out.println(opcoes());
				caso = scan.next();

				switch (caso) {
				case "0":
					sair = true;
					break;

				case "1":
					System.out.println("Entre com o identificador do contato: ");
					System.out.println(agenda.consultarContatoById(contatos, scan.nextInt()));
					break;
					
				case "2":					
					System.out.print(agenda.consultarContatos(contatos));					
					break;

				case "3":
					for (int i = 0; i < contatos.length; i++) {

						System.out.println("Tem certeza que deseja adicionar um contato? s/n");
						addContato = scan.next();

						if (addContato.equalsIgnoreCase("s")) {
							try {
								Contato contato = new Contato();								
								
								System.out.println("Nome: ");
								contato.setNome(scan.next());

								System.out.println("Telefone: ");
								contato.setTelefone(scan.next());
								
								contatos[agenda.adicionarContato(contato)] = contato;
								
							} 
							catch (ArrayIndexOutOfBoundsException e) {
								System.out.println("Agenda Cheia");
							}
						}

						else if (addContato.equalsIgnoreCase("n")) {
							break;
						} else {
							System.out.println("Entrada inválida!");
							i--;
						}
					}
					break;

				default:
					System.out.println("Número inválido");
					break;
				}
			}
		}
	}
	public static String opcoes(){
		return "Precione 0 para finalizar o progama." + 
		"\nPrecione 1 para consultar os contatos pelo identificador." +
		"\nPrecione 2 para consultar todos os contatos." +
		"\nPrecione 3 para adicionar um contato.";
	}
}
