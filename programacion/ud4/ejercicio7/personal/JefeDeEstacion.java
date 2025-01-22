package programacion.ud4.ejercicio7.personal;

import java.time.LocalDateTime;

public class JefeDeEstacion {
	private String nombre;
	private String dni;
	private LocalDateTime fechaJefe;
	
	//Constructor:
	public JefeDeEstacion(String nombre, String dni, LocalDateTime fechaJefe) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaJefe = fechaJefe;
	}
	
}
