package ar.edu.unlam.pb2.eva03;

public abstract class Vehiculo {
	
	private String nombre;
	private Integer codigo;
	
	public Vehiculo(Integer codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
}
