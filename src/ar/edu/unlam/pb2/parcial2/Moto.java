package ar.edu.unlam.pb2.parcial2;

public class Moto extends Vehiculo {

	private String patente;
	private final Integer CANTIDAD_MAXIMA_DE_PASAJEROS;
	private Integer velocidadMaxima;
	
	public Moto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud,longitud);
		this.velocidadMaxima=velocidadMaxima;
		this.CANTIDAD_MAXIMA_DE_PASAJEROS=cantidadMaximaDePasajeros;
		this.patente=patente;
		
	}

	public String getPatente() {
		return patente;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	
}
