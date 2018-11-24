package futbol;

public class PersonaImpl implements Persona{
	
	private String nombre;
	private String apellidos;
	
	public PersonaImpl() {
		this.nombre = "";
		this.apellidos = "";
	}
	
	public PersonaImpl(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public String getNombre() {
		// Auto-generated method stub
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		// Auto-generated method stub
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		// Auto-generated method stub
		return apellidos;
	}

	@Override
	public void setApellidos(String apellidos) {
		// Auto-generated method stub
		this.apellidos = apellidos;
	}
	
	public String toString() {
		return apellidos + ", " + nombre;
	}

	
	
}
