package persona;

public class PersonaImpl implements Persona {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private Integer edad;
	private Double altura;
	private Character sexo;
	
	public PersonaImpl(String dni, 
					   String nombre, 
					   String apellidos, 
					   Integer edad, 
					   Double altura,
					   Character sexo) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.sexo = sexo;
	}

	@Override
	public String getDNI() {
		// TODO Auto-generated method stub
		return dni;
	}

	@Override
	public void setDNI(String dni) {
		// TODO Auto-generated method stub
		this.dni = dni;

	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;

	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return apellidos;
	}

	@Override
	public void setApellidos(String apellidos) {
		// TODO Auto-generated method stub
		this.apellidos = apellidos;

	}

	@Override
	public Integer getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

	@Override
	public void setEdad(Integer edad) {
		// TODO Auto-generated method stub
		this.edad = edad;

	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public void setAltura(Double altura) {
		// TODO Auto-generated method stub
		this.altura = altura;

	}

	@Override
	public Character getSexo() {
		// TODO Auto-generated method stub
		return sexo;
	}

	@Override
	public void setSexo(Character sexo) {
		// TODO Auto-generated method stub
		this.sexo = sexo;

	}
	
	//Persona p1 = new PersonaImpl("12345678A", "Alba", "Carmona Jamardo", 26, 1.60, 'F');
	//Persona p2 = new PersonaImpl("12345678B", "Manuel Jesus", "Gonzalez Rodriguez", 26, 1.75, 'M');
	
	public String toString() {
		String s = getDNI() + ", " + getNombre() + getApellidos() + ": " + getEdad() + " años "
					+ getAltura() + " cms "+ getSexo();
		return s;
	}
	
	// Si el primer objeto es igual al segundo, entonces el segundo es igual al primero.
	public boolean equals(Object o) {
		
		boolean res = false;
		
		if(o instanceof Persona) {
			Persona p = (Persona) o;
			res = getDNI().equals(p.getDNI());
		}
		
		return res;
	}
	
	// Si dos objetos son iguales, el número hash tiene que coincidir.
	public int hashCode() {
		return getDNI().hashCode()*31;
	}
	
	// Comparar
	public int compareTo(Persona p) {
		int compara = getApellidos().compareTo(p.getApellidos());
		
		if(compara == 0) {
			compara = getDNI().compareTo(p.getDNI());
		}
		
		return compara;
	}

}
