package ar.edu.unlam.pb2.parcial2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mapa {

	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	private String localidad;

	public Mapa(String localidad) {
		this.localidad = localidad;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

	public Integer getCantidadDeVehiculos() {
		return this.vehiculos.size();
	}

	public Boolean hayCoalicion() throws ColitionException {

		Set <Vehiculo> vehiculosSinColision = new HashSet <Vehiculo>();
		vehiculosSinColision.addAll(vehiculos);
		
		if(this.vehiculos.size()>vehiculosSinColision.size()) 
			throw new ColitionException("Colision");
		
		return false;
	}

}
