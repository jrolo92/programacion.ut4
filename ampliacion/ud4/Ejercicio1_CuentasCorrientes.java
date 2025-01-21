package ampliacion.ud4;

public class Ejercicio1_CuentasCorrientes {

	public static void main(String[] args) {
		
		//Creo un objeto de la clase CuentaCorriente y lo inicializo:
		CuentaCorriente Cuenta1 = new CuentaCorriente ("12345678B", "Juan López", 50.00);
		
		//Probamos los 3 métodos creados en la clase CuentaCorriente.
		Cuenta1.sacarDinero(20);
		Cuenta1.ingresarDinero(50.00);
		Cuenta1.mostrarInfo();
		
		
	}

}
