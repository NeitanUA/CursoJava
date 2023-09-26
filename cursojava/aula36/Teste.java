package com.natanael.cursojava.aula36;

public class Teste {
	public static void main(String[] args) {
		//criação do objeto contato
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Lending");
		//contato.setTelefone("11 99999-9999");
		
		//criação objeto endereço
		Endereco endereco = new Endereco();		
		endereco.setNomeRua("Game of Thrones");
		endereco.setNumero("n/a");
		endereco.setComplemento("-");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("Westeros");
		endereco.setCep("99999999");
		
		contato.setEndereco(endereco);
		
		//criando objeto telefone
		Telefone telefone = new Telefone();		
		telefone.setTipo("Celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();		
		telefone2.setTipo("Casa");
		telefone2.setDdd("11");
		telefone2.setNumero("88888-8888");
		
		//criação do Arrey de telefones
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefones(telefone);
		contato.setTelefones(telefones);
		
		//Teste saida no console
		System.out.println(contato.getNome());			
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
//		if(contato != null && contato.getTelefones() != null) {
//			System.out.println(contato.getTelefones().getClass() + " " + contato.getTelefones().getNumero());
//		}
		
		if(contato != null && contato.getTelefones() != null) {
			
			for(Telefone t : telefones) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}
}
