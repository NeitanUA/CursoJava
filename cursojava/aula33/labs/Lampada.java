package com.natanael.cursojava.aula33.labs;

public class Lampada {
	private String tipo;
	private String consumo;
	private int durabilidadeAnos;
	
	Lampada(){}
	
	Lampada(String tipo, String consumo, int durabilidadeAnos){
		this.tipo = tipo;
		this.consumo = consumo;
		this.durabilidadeAnos = durabilidadeAnos;
	}
	
	public boolean ligarLampada() {
		return true;
	}
	
	public boolean desligarLampada() {
		return false;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	public int getDurabilidadeAnos() {
		return durabilidadeAnos;
	}
	public void setDurabilidadeAnos(int durabilidadeAnos) {
		this.durabilidadeAnos = durabilidadeAnos;
	}	
}
