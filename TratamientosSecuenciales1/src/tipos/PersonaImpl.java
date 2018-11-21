package tipos;


public class PersonaImpl implements Persona {
	private String nombre; 
	private String apellidos ;
	private String dni ;
	private Integer edad;
	private Double estatura;
	private Character sexo;
	/**
	 * @return the edad
	 */

	public Integer getEdad() {
		return edad;
	}
	public PersonaImpl(String nombre, String apellidos, String dni,
			Integer edad, Double estatura, Character sexo) {
		super();
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
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		if( edad == null  || edad < 0){
			throw new IllegalArgumentException("Algún parámetro es inapropiado");
		}
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @return the dni
	 */
	public String getDNI() {
		return dni;
	}
	/**
	 * @return the sexo
	 */
	public Character getSexo() {
		return sexo;
	}

	/**
	 * @return the estatura
	 */
	public Double getEstatura() {
		return estatura;
	}
	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(Double estatura) {
		if(estatura == null || estatura <= 0.0){
			throw new IllegalArgumentException("Algún parámetro es inapropiado");
		}
		this.estatura = estatura;
	}
	/**
	 * @param sexo the sexo to set
	 */
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + apellidos + ", " + nombre + 
		" (" + dni + ")";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PersonaImpl))
			return false;
		PersonaImpl other = (PersonaImpl) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


}
