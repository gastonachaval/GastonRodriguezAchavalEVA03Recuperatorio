package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy=new HashSet<Vehiculo>();
		this.batallas=new HashMap<String, Batalla>();
	}

	public Boolean agregarVehiculo(Vehiculo vehiculoAAgregar) {
		return convoy.add(vehiculoAAgregar);	
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}
	

}
