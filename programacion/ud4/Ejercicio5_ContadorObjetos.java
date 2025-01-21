package programacion.ud4;

public class Ejercicio5_ContadorObjetos {

	public static void main(String[] args) {
		
		//Creamos varios objetos de la clase ContadorObjetos.
		ContadorObjetos Obj1 = new ContadorObjetos();
		ContadorObjetos Obj2 = new ContadorObjetos();
		ContadorObjetos Obj3 = new ContadorObjetos();
		
		//Llamamos al método de imprimir que hemos creado en la clase
		ContadorObjetos.mostrarTotalObjetos();
	}

}
