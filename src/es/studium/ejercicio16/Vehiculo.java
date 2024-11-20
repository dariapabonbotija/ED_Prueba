package es.studium.ejercicio16;

public class Vehiculo {

		String matricula;
		int ruedas;
		
		public Vehiculo() {
			matricula="";
			ruedas=0;
		}

		public Vehiculo(String matricula, int ruedas) {
			this.matricula = matricula;
			this.ruedas = ruedas;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public int getRuedas() {
			return ruedas;
		}

		public void setRuedas(int ruedas) {
			this.ruedas = ruedas;
		}
		
		
}
