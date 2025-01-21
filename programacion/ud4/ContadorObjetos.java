package programacion.ud4;

public class ContadorObjetos {
	//Atributos:
	private static int totalObjetos = 0;
	
	//Constructor:
	public ContadorObjetos() {
		totalObjetos++;
	}
	
	public static void mostrarTotalObjetos() {
		System.out.println("Objetos totales creados: " + totalObjetos);
	}
}
