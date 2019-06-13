package agendaContacto;

import java.util.Scanner;


public class Datos {

	public static Amigo anadirAmigo (Scanner teclado) {

		teclado.nextLine();
		System.out.println("Introduce nombre");
		String nombre=teclado.nextLine();
		System.out.println("Introduce Apellido");
		String apellido=teclado.nextLine();
		System.out.println("Introduce telefono");
		String telefono=teclado.nextLine();
		System.out.println("Introduce fecha de nacimiento");
		String fechaNacimiento=teclado.nextLine();
		System.out.println("Introduce afinidad");
		int afinidad=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce origen:\n 1 para trabajo\n 5 para infancia\n 10 para hobby ");
		int origen=teclado.nextInt();
		Amigo p=new Amigo(nombre,apellido,telefono,fechaNacimiento, afinidad, origen);
		return p;
	}
	public static Familia anadirFamilia (Scanner teclado) {

		teclado.nextLine();
		System.out.println("Introduce nombre");
		String nombre=teclado.nextLine();
		System.out.println("Introduce Apellido");
		String apellido=teclado.nextLine();
		System.out.println("Introduce telefono");
		String telefono=teclado.nextLine();
		System.out.println("Introduce fecha de nacimiento");
		String fechaNacimiento=teclado.nextLine();
		System.out.println("Introduce afinidad");
		int afinidad=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce parentesco:\n 10 para 1er grado\n 5 para 2do grado\n 1 para 3er grado ");
		int parentesco=teclado.nextInt();
		Familia p=new Familia(nombre,apellido,telefono,fechaNacimiento, afinidad, parentesco);
		return p;
	}
}
