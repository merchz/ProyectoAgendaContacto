package agendaContacto;

public class Persona {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String fechaNacimiento;
	


	
	static int IdSiguiente=1;

	
	public Persona(String nom, String ap, String tel, String fe) {
		nombre=nom;
		apellidos=ap;
		telefono=tel;
		fechaNacimiento=fe;
		this.id=IdSiguiente;
		IdSiguiente++;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public static int getIdSiguiente() {
		return IdSiguiente;
	}


	public static void setIdSiguiente(int idSiguiente) {
		IdSiguiente = idSiguiente;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	


		
		
	} 

