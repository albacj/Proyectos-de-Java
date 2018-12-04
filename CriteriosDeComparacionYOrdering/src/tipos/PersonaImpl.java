package tipos;

public class PersonaImpl implements Persona {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre, apellidos;	
	protected String dni;
	private Fecha fechaNacimiento;

	public PersonaImpl(String nombre, String apellidos, String dni,
			Fecha fechaNac) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNac;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof Persona) {
			Persona p = (Persona) o;
			res = p.getDni().equals(getDni());
		}
		return res;
	}

	public int hashCode() {
		return getDni().hashCode();
	}

	public Persona clone() {
		Persona p = null;
		try {
			p = (Persona) super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return p;
	}

	public String toString() {
		return getApellidos() + ", " + getNombre() + " --- "+getDni()+" --- "+getFechaNacimiento();
	}

	public int compareTo(Persona p){
		int res= this.getApellidos().compareTo(p.getApellidos());
		if (res==0)
			res=this.getNombre().compareTo(p.getNombre());
		return res;
	}

}
