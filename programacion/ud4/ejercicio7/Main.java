package programacion.ud4.ejercicio7;

import programacion.ud4.ejercicio7.maquinaria.Locomotora;
import programacion.ud4.ejercicio7.maquinaria.Tren;
import programacion.ud4.ejercicio7.personal.Maquinista;
import programacion.ud4.ejercicio7.personal.Mecanico;

public class Main {

	public static void main(String[] args) {
		
		Mecanico mecanico = new Mecanico ("Juan", 612345678, "motor");
		Locomotora locomotora = new Locomotora ("11AB", 200, 2023, mecanico);
		Maquinista  maquinista = new Maquinista ("Pedro", "12345678B", 1800.00, "oficial");
		Tren tren1 = new Tren (locomotora, maquinista, 2 );
		
		
	}

}
