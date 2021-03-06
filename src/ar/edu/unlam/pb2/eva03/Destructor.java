package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Destructor extends Vehiculo implements Acuatico {

	private Double profundidad;

	public Destructor(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad=0.0d;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
