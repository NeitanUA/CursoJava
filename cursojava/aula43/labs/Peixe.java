package com.natanael.cursojava.aula43.labs;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe() {

		setNumeroPatas(0);
		setAmbiente("Mar");
		setCor("Cinzento");
		setCaracteristicas("Barbatanas e cauda.");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Caracteristica: " + caracteristicas;
	}

}
