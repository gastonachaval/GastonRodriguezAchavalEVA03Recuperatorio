package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}

	public Boolean agregarVehiculo(Vehiculo vehiculoAAgregar) {
		return convoy.add(vehiculoAAgregar);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		batallas.put(nombre, new Batalla(latitud, longitud, tipo));
	}

	public Batalla getBatalla(String nombre) {
		return batallas.get(nombre);
	}

	public Boolean enviarALaBatalla(String nombreDeLaBatalla, Integer codigoDeVehiculo)
			throws VehiculoInexistente, VehiculoIncompatible {
		Vehiculo vehiculoAEnviar = null;
		for (Iterator<Vehiculo> iterator = convoy.iterator(); iterator.hasNext();) {
			Vehiculo vehiculo = (Vehiculo) iterator.next();
			if (vehiculo.getCodigo().equals(codigoDeVehiculo)) {
				vehiculoAEnviar = vehiculo;
				break;
			}
		}
		if (vehiculoAEnviar == null) {
			throw new VehiculoInexistente();
		}

		if (batallas.get(nombreDeLaBatalla).getTipo().equals(TipoDeBatalla.TERRESTRE)) {
			if (vehiculoAEnviar instanceof Terrestre) {
				batallas.get(nombreDeLaBatalla).agregarVehiuculoALaBatalla(vehiculoAEnviar);
				return true;
			} else {
				throw new VehiculoIncompatible();
			}
		}
		if (batallas.get(nombreDeLaBatalla).getTipo().equals(TipoDeBatalla.NAVAL)) {
			if (vehiculoAEnviar instanceof Acuatico) {
				batallas.get(nombreDeLaBatalla).agregarVehiuculoALaBatalla(vehiculoAEnviar);
				return true;
			} else {
				throw new VehiculoIncompatible();
			}
		}
		if (batallas.get(nombreDeLaBatalla).getTipo().equals(TipoDeBatalla.AEREA)) {
			if (vehiculoAEnviar instanceof Volador) {
				batallas.get(nombreDeLaBatalla).agregarVehiuculoALaBatalla(vehiculoAEnviar);
				return true;
			} else {
				throw new VehiculoIncompatible();
			}
		}
		return false;
	}
}
