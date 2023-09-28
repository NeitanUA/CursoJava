package com.natanael.cursojava.aula43.labs;

public class Exercicio2 {
	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica();
		PessoaFisica pf2 = new PessoaFisica();
		PessoaFisica pf3 = new PessoaFisica();
		
		PessoaJuridica pj1 = new PessoaJuridica();
		PessoaJuridica pj2 = new PessoaJuridica();
		PessoaJuridica pj3 = new PessoaJuridica();
		
		pf1.setNome("Natanael");
		pf1.setCpf("12345678911");
		pf1.setRendaBruta(1400.00);
		
		pf2.setNome("João");
		pf2.setCpf("98765431211");
		pf2.setRendaBruta(2400.00);
		
		pf3.setNome("Maria");
		pf3.setCpf("65498732122");
		pf3.setRendaBruta(3400.00);
		
		pj1.setNome("Natanael");
		pj1.setCnpj("12345678911");
		pj1.setRendaBruta(1400.00);
		
		pj2.setNome("João");
		pj2.setCnpj("98765431211");
		pj2.setRendaBruta(2400.00);
		
		pj3.setNome("Maria");
		pj3.setCnpj("65498732122");
		pj3.setRendaBruta(3400.00);
		
		Contribuinte[] contribuentes = {pf1, pf2, pf3, pj1, pj2, pj3};
		
		for(Contribuinte c : contribuentes) {
			System.out.println(c.toString());
		}
		
	}
}
