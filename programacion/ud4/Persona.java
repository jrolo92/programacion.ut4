package programacion.ud4;

//Plantilla general de la clase Persona.
public class Persona {
	// Atributos
	/*
	 * Los atributo podrán ser: privados: No podran ser accedidos por otras clases
	 * hermanas (dentro del paquete) ni de otras clases externas. publicos: Todas
	 * las clases pueden acceder. package: Es el que se pone por defecto. Sólo lo
	 * pueden ver las clases hermanas (dentro del paquete). #protected:
	 */
	private String nombre;
	private int edad;
	private double estatura;
	
	//ENUM SEXO.
	public enum Sexo {
		HOMBRE, MUJER
	}
	
	// Métodos

	// Constructor de la plantilla de persona con parámetros.
	public Persona(String nombre, int edad, double estatura) {
		// Primero el atributo y luego el parámetro del método.
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	// Constructor de la plantilla de persona por defecto.
	public Persona() {
		nombre = "anonimo";
		edad = 18;
		estatura = 1.70;
	}

	// Constructor con un solo parámetro
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	// Constructor con los parámetros + apellido
	public Persona(String nombre, String apellido, int edad, double estatura) {
		this(nombre + " " + apellido);
		this.edad = edad;
		this.estatura = estatura;
	}

	void saludar() {
		System.out.println("Hola " + nombre);
	}

	void cumplirAnyos() {
		// edad +1;
		edad++;
	}

	void crecer(double incremento) {
		estatura = estatura + incremento;
		// estatura += incremento;
	}

	// Ejemplo de ámbito de los atributos.
	void metodo() {
		int edad = 8;
		System.out.println(edad);
		/*
		 * Se va a referir a la edad dentro de método y no a la que esta en atributos.
		 * para referirnos a la edad de atributos hay que usar la palabra reservada
		 * this.
		 */
		System.out.println(this.edad);
	}
		
	/*
	 * Getters y setters de los atributos:
	 * Los getters solo nos van a coger los valores del atributo por tanto no tendrán parametros de entrada.
	 * Los setter nos van a permitir cambiar los valores de un atributo por tanto no tendran valores de salida (serán void).
	 * Se pueden generar los getter y setter y los constructores dandole a Source/Generate
	 */
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		if (nombre.length()<20)
			this.nombre = nombre;
		else
			System.out.println("El nombre es demasiado largo");
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setEdad (int edad) {
		if (edad>0)
			this.edad = edad;
		else
			System.out.println("La edad debe ser mayor que 0");
	}
	
	public double getEstatura () {
		return estatura;
	}
	
	public void setEstatura (double estatura) {
		if (estatura>0.00)
			this.estatura = estatura;
		else
			System.out.println("La estatura debe ser mayor de 0");
	}
	

}