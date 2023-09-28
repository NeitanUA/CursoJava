package com.natanael.cursojava.aula43.labs;

public class Exercicio1 {
	public static void main(String[] args) {
		
		ContaBancaria contaBancaria = new ContaBancaria();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaEspecial contaEspecial = new ContaEspecial();		
		
		contaBancaria.setNomeCliente("Maria");
		contaBancaria.setNumConta("789456123");
		contaBancaria.setSaldo(2000);
		contaBancaria.depositar(500);
		contaBancaria.sacar(2400);
		
		System.out.println(contaBancaria);
		
		contaPoupanca.setNomeCliente("Natanael");
		contaPoupanca.setNumConta("123456789");
		contaPoupanca.setSaldo(1000);
		contaPoupanca.depositar(500);
		contaPoupanca.sacar(400);
		contaPoupanca.setDiaRendimento(1);		
		contaPoupanca.calcularNovoSaldo(1);
		
		System.out.println(contaPoupanca);
		
		contaEspecial.setNomeCliente("João");
		contaEspecial.setNumConta("789654123");
		contaEspecial.setSaldo(1000);
		contaEspecial.setLimite(200);;
		contaEspecial.depositar(1000);
		contaEspecial.sacar(2200);
		
		System.out.println(contaEspecial);

	}
}
