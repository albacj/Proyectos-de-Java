package tipos;


public class PersonaImpl2 implements Persona {

	private String nombre; 
	private String apellidos ;
	private String dni ;
	private Integer edad;
	private Double estatura;
	private Character sexo;

	public Integer getEdad() {
		return edad;
	}

	public PersonaImpl2(String nombre, String apellidos, String dni,Integer edad, Double estatura, Character sexo) {
		if(nombre==null || apellidos == null || dni == null || edad == null || estatura == null || sexo == null || estatura <= 0.0 || edad < 0){
			throw new IllegalArgumentException("Algún parámetro es inapropiado");
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.estatura = estatura;
		this.sexo = sexo;
	}

	public void setEdad(Integer edad) {
		if( edad == null  || edad < 0){
			throw new IllegalArgumentException("Algún parámetro es inapropiado");
		}
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDNI() {
		return dni;
	}

	public Character getSexo() {
		return sexo;
	}


	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		if(estatura == null || estatura <= 0.0){
			throw new IllegalArgumentException("Algún parámetro es inapropiado");
		}
		this.estatura = estatura;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Persona clone() {
		Persona copia = null;
		try {
			copia = (Persona) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return copia;
	}
	public int compareTo(Persona e) {
		int cmp = this.getApellidos().compareTo(e.getApellidos());
		if (cmp == 0) {
			cmp = this.getNombre().compareTo(e.getNombre());
		}
		if (cmp == 0) {
			cmp = this.getDNI().compareTo(e.getDNI());
		}
		return cmp;
	}

	public String toString() {
		return "" + apellidos + ", " + nombre + " (" + dni + ")";
	}

	public int hashCode() {
		return this.getApellidos().hashCode()+this.getNombre().hashCode()*31+this.getDNI().hashCode()*31*31;
	}

	public boolean equals(Object o) {
		Boolean res = false;
		if(o instanceof Persona){
			boolean aux1 = this.getApellidos().equals(((Persona) o).getApellidos());
			boolean aux2 = this.getNombre().equals(((Persona) o).getNombre());
			boolean aux3 = this.getDNI().equals(((Persona) o).getDNI());
			res = aux1 && aux2 && aux3;	
		}
		return res;
	}

}
