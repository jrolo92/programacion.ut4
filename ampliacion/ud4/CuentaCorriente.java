package ampliacion.ud4;

public class CuentaCorriente {
	//Atributos
	
	private String dni;
	public String nombre;
	private double saldo;
	private static String nombreBanco= "Unicoja";
	
	
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
	
	//MÉTODOS PARA OPERACIONES TÍPICAS:
	//Método sacar dinero:
	public void sacarDinero (double extracto) {
		if (this.saldo>=extracto) {
			System.out.println("Es posible retirar la cantidad deseada");
			this.saldo = this.saldo - extracto;
		}else
			System.out.println("No es posible retirar la cantidad deseada");
	}
	
	//Método ingresar dinero:
	public void ingresarDinero (double ingreso) {
		this.saldo = this.saldo + ingreso;
	}
	
	//Método para mostrar información:
	public void mostrarInfo () {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Saldo: " + this.saldo);
	}
	
	//Metodos getter y setter para el atributo nombre del banco:
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
}
