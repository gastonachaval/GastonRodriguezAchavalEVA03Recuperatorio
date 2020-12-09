package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre {

	private Double velocidad;

	public Tanque(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

}
