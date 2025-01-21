package programacion.ud4;

public class Fiesta {

	public static void main(String[] args) {
		// Inicializamos la instancia de persona "pedro" mediante el constructor
		Persona pedro = new Persona("Peri", 33, 1.72);

		/*
		 * Poniendo el nombre de la instancia de persona se imprime la referencia Esta
		 * persona va a tener los valores por defecto que le dimos en la clase persona.
		 */
		System.out.println(pedro);

		// pedro.edad = 33;
		// pedro.nombre = "Peri";
		// pedro.estatura = 1.72;

		Persona pepe = new Persona();
		Persona paco = new Persona();

		Persona manuel = new Persona("Manuel", 30, 1.80);
		Persona victor = new Persona("Victor", 29, 1.75);

		Persona lola = new Persona("Lola");

		Persona marcos = new Persona("Marcos", "López", 25, 1.80);
		
		/*
		 * Al estar público el atributo nombre nos permite modificarlo Lo cual no ocurre
		 * con el atributo edad, ya que está en privado.
		 */
		//marcos.nombre = "Jesús";
		//marcos.edad = "33";

		//System.out.println(marcos.nombre);
		System.out.println(marcos.getNombre());
		marcos.setNombre("Jesús");
		System.out.println(marcos.getNombre());
		marcos.setEdad(0);
		marcos.setEstatura(0);

	}

}
