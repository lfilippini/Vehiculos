package ar.edu.unlam.pb2.parcial2;

public class Auto extends Vehiculo {

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;
	
	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud,longitud);
		this.velocidadMaxima=velocidadMaxima;
		this.cantidadMaximaDePasajeros=cantidadMaximaDePasajeros;
		this.patente=patente;
		
	}

	public String getPatente() {
		return patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	
}
