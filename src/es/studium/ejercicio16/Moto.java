package es.studium.ejercicio16;

public class Moto extends Vehiculo {
	
	private String cilindrada;
	
	public Moto() {
		super();
		cilindrada="";
	}
	
	
	public Moto(String matricula, int ruedas, String cilindrada) {
		super(matricula, ruedas);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

}
