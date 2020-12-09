package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {

	private Double profundidad;
	private Double altura;

	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad=0.0d;
		this.altura=0.0d;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public Double getAltura() {
		return altura;
	}

}
