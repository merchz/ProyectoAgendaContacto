package agendaContacto;

import java.io.Serializable;
/**
 * 
 * @author Enrique
 *Subclase (Amigo) que hereda de una clase padre(Persona) 
 *modela propiedades de los amigos
 */
public class Amigo extends Persona implements Serializable{

	
	private int afinidad;
	private int origen;
	private int apego;
	public Amigo(String nom, String ap, String tel, String fe, int afinidad,int o) {
		super(nom,ap,tel,fe);
		this.afinidad=afinidad;
		this.origen=o;
		this.apego=afinidad*origen;
	}

	public double getAfinidad() {
		return afinidad;
	}

	public void setAfinidad(int afinidad) {
		this.afinidad = afinidad;
	}
	
	
	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public int getApego() {
		return apego;
	}

	public void setApego(int apego) {
		this.apego = apego;
	}

	@Override
	public String toString() {
		return super.toString()+"Amigo [afinidad=" + afinidad + " origen="+origen+" apego="+apego+"]";
	}
	
	
}
