package programacion.ud4;
import java.util.Scanner;

public class Ejercicio4_Horas {

	public static void main(String[] args) {
		//Varibles:
		int hh;
		int mm;
		int ss;
		int n;
		
		//Leer Hora
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca hora: HH");
		hh=sc.nextInt();
		System.out.println("Introduzca minutos: MM");
		mm=sc.nextInt();
		System.out.println("Introduzca segundos: SS");
		ss=sc.nextInt();
		
		//Crear objeto:
		Hora hora = new Hora(hh, mm, ss);
		
		//Leer n:
		System.out.println("Introduzca los segundos que quiere avanzar");
		n=sc.nextInt();
		
		System.out.println("Hora actual: "+ hh + ":" + mm + ":" + ss);
		for(int i=0;i<n;i++) {
			hora.incrementarSegundos();
			System.out.println(hora.Imprimir());
		}
		
	}	

	
}
