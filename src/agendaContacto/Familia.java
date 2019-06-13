package agendaContacto;

public class Familia extends Persona{

	private int afinidad;
	private int parentesco;
	private int apego;

	
	
	public Familia(String nom, String ap, String tel, String fe,int af,int par) {

		super(nom,ap,tel,fe);
		afinidad=af;
		parentesco=par;
		apego=afinidad*parentesco;
		
	}


	public int getAfinidad() {
		return afinidad;
	}


	public void setAfinidad(int afinidad) {
		this.afinidad = afinidad;
	}


	public int getParentesco() {
		return parentesco;
	}


	public void setParentesco(int parentesco) {
		this.parentesco = parentesco;
	}


	public int getApego() {
		return apego;
	}


	public void setApego(int apego) {
		this.apego = apego;
	}





	@Override
	public String toString() {
		return super.toString()+"Familia [afinidad=" + afinidad + ", parentesco=" + parentesco + ", apego=" + apego + "]";
	}
	
	
	
	
}
