package com.natanael.cursojava.aula52.correcao;

public class AgendaCheiaException extends Exception{

	@Override
	public String getMessage() {
		
		return "Agenda já está cheia.";
	}
}
