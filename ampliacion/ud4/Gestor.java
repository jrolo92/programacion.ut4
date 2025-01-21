package ampliacion.ud4;

public class Gestor {
	//Atributos
	public String nombre;
	private int telefono;
	int importeMaxAutorizado = 10000;
	
	//Constructor:
	public Gestor (String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	//Solo hacer el getter de teléfono (puesto que no se puede cambiar el número una vez asignado
	public int getTelefono() {
		return telefono;
	}
}
