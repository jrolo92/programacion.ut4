package ampliacion.ud4;

public class CuentaCorriente {
	//Atributos
	private String nombreBanco;
	private String dni;
	public String nombre;
	double saldo;
	
	//Constructor con 3 atributos:
	public CuentaCorriente (String dni, String nombre, double saldo) {
		this.dni=dni;
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	//Constructor con 2 atributos (dni titular y saldo inicial):
	public CuentaCorriente (String dni, double saldo) {
		this.dni=dni;
		this.saldo=saldo;
	}
	
	//Constructor por defecto:
	public CuentaCorriente () {
		dni="desconocido";
		nombre="desconocido";
		saldo= 0.00;
	}
	
	//Método sacar dinero:
	public void sacarDinero (double extracto) {
		if (this.saldo>extracto)
			System.out.println("Es posible retirar la cantidad deseada");
		else
			System.out.println("No es posible retirar la cantidad deseada");
	}
	
	//Método ingresar dinero:
	public double ingresarDinero (double ingreso) {
		this.saldo = this.saldo + ingreso;
		return this.saldo;
	}
	
	//Método para mostrar información:
	public void mostrarInfo () {
		System.out.println(this.nombre);
		System.out.println(this.dni);
		System.out.println(this.saldo);
	}
	
}
