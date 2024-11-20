package es.studium.ejercicio16;

public class Conductor {
	
	private String nombre;
	private String carnet;
	
	public Conductor() {
		nombre="";
		carnet="";
	
	}

	public Conductor(String nombre, String carnet) {
		this.nombre = nombre;
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	

}
