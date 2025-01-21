package ampliacion.ud4;

public class Ejercicio1_CuentasCorrientes {

	public static void main(String[] args) {
		
		//Creo un objeto de la clase CuentaCorriente y lo inicializo:
		CuentaCorriente A = new CuentaCorriente ("12345678B", "Juan López", 50.00);
		
		//Probamos los 3 métodos creados en la clase CuentaCorriente.
		A.sacarDinero(20);
		System.out.println(A.ingresarDinero(50));
		A.mostrarInfo();
		
		
	}

}
