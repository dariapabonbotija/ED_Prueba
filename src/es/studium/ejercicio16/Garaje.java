package es.studium.ejercicio16;

public class Garaje {

	public static void main(String[] args) {
		
		Conductor conductor1=new Conductor();
		conductor1.setNombre("Pepe");
		conductor1.setCarnet("B");
		
		Coche coche1=new Coche();
		coche1.setConductor(conductor1);
		coche1.setMatricula("3698JJW");
		coche1.setRuedas(4);
		
		Conductor conductor2=new Conductor();
		conductor2.setNombre("Teresa");
		conductor2.setCarnet("A2");
		
		Moto moto1=new Moto();
		moto1.setMatricula("4589PPQ");
		moto1.setCilindrada("125cc");
		moto1.setRuedas(2);
		
		System.out.println(coche1.getMatricula()
				+" "+coche1.getRuedas()
				+" "+coche1.getConductor().getNombre()
				+" "+coche1.getConductor().getCarnet());
		
		System.out.println(moto1.getCilindrada()
				+" "+coche1.getMatricula()
				+" "+coche1.getRuedas());

	}

}
