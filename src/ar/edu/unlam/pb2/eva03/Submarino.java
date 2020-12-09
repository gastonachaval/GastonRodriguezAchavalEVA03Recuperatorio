package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {

	private double profundidad;

	public Submarino(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad=0.0d;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
