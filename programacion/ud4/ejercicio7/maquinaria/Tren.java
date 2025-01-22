package programacion.ud4.ejercicio7.maquinaria;

import programacion.ud4.ejercicio7.personal.Maquinista;

public class Tren {
	Locomotora locomotora;
	Vagon nuevoVagon [];
	Maquinista maquinista;
	private int numVagones;
	
	//Constructor:
	public Tren(Locomotora locomotora, Maquinista maquinista, int numVagones) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		numVagones = 0; //Empezamos con el tren sin vagones.
		nuevoVagon = new Vagon [5]; //No se crea ningún objeto de tipo vagón sino un array de tamaño 5.
	}
	
	/*
	 * Los vagones se van a construir desde esta clase (Tren) ya que la clase Vagon
	 * no es publica
	 */
	public void engancharVagon (int cargaMax, int cargaActual, String tipoMercancia) {
		if (numVagones >= 5)
			System.out.println("No se permiten mas de 5 vagones");
		else {
			Vagon vagon = new Vagon (numVagones, cargaMax, cargaActual, tipoMercancia);
			nuevoVagon [numVagones] = vagon;
			numVagones++;
		}
	}
	
	public void desengancharVagon (int cargaMax, int cargaActual, String tipoMercancia) {
		if (numVagones==0)
			System.out.println("No tienes ningún vagón, no puedes desenganchar");
		else {
			Vagon vagon = new Vagon (numVagones, cargaMax, cargaActual, tipoMercancia);
			nuevoVagon [numVagones] = vagon;
			numVagones--;
		}
	}
}
	
	

