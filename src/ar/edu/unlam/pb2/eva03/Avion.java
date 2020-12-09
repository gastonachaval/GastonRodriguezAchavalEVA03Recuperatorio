package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Avion extends Vehiculo implements Volador {

	private double altura;

	public Avion(Integer codigo, String nombre) {
		super(codigo,nombre);
		this.altura=0.0d;
	}

	@Override
	public Double getAltura() {
		return altura;
	}


}
