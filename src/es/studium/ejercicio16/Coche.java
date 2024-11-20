package es.studium.ejercicio16;

public class Coche extends Vehiculo {
	
	private Conductor conductor;
	
	public Coche() {
		super();
		conductor= new Conductor();
	}
	
	public Coche(String matricula, int ruedas, Conductor conductor) {
		super(matricula, ruedas);
		this.conductor = conductor;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	
}