package agendaContacto;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;



public class main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Apéndice de método generado automáticamente
		ArrayList<Amigo> arrayAmigos=new ArrayList<Amigo>();
		try {
			ObjectInputStream d=new ObjectInputStream(new FileInputStream("c:\\archivos\\agenda.dat"));
			Amigo c;
			while (true) {
				c = (Amigo) d.readObject();
				arrayAmigos.add(c);
			
			}
			}catch (EOFException e) {
			System.out.println("fin del fichero");
			
			}catch (IOException e) {
			System.out.println(e.getMessage()); 
			}
	
		for (Amigo e1: arrayAmigos ) {
			System.out.println(e1);
		}
		
		Familia f1=new Familia("Manuel","Ruiz","601456789","22/07/1978",10,10);
		Familia f2=new Familia("luis","asun","601456789","22/07/1978",6,5);
		Familia f3=new Familia("fernando","dero","601456789","22/07/1978",2,1);
		
		ArrayList<Familia> arrayFamilia=new ArrayList<Familia>();
		arrayFamilia.add(f1);
		arrayFamilia.add(f2);
		arrayFamilia.add(f3);

		Scanner teclado = new Scanner (System.in);
		int opcion;
		do {
		System.out.println("Menu");
		System.out.println("1. Añadir un nuevo amigo");
		System.out.println("2. Añadir un nuevo familiar ");
		System.out.println("3.Salir");
		System.out.println("Introduzca la opción elegida");
		opcion=teclado.nextInt();
		switch (opcion) {
		
		case 1:{
						
					Amigo a1=Datos.anadirAmigo(teclado);
					arrayAmigos.add(a1);
					
					for (Amigo am: arrayAmigos ) {
						System.out.println(am);
				}
				break;
		}
		
		
		
		case 2:{
			Familia f11=Datos.anadirFamilia(teclado);
			arrayFamilia.add(f11);
			
			for (Familia fam: arrayFamilia) {
				System.out.println(fam);
			}
			break; 
		}
		case 3:{
			try {
			ObjectOutputStream d = new ObjectOutputStream (new FileOutputStream("c:\\archivos\\agenda.dat"));
					for(Amigo e1: arrayAmigos) {
						d.writeObject(e1);
					}
				d.close();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
			break;
		}
		default:{
			System.out.println("opción no válida vuelva a leer");
		}
		}
		}while(opcion!=3);
		
	}

}
