package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Acuatico,Terrestre {

	private Double profundidad;
	private Double velocidad;
	
	public Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad=0.0d;
		this.velocidad=0.0d;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}
	@Override
	public Double getVelocidad() {
		return velocidad;
	}

	

}
