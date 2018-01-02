package persona;

public interface Persona {
	
	String getDNI();
	void setDNI(String dni);
	
	String getNombre();
	void setNombre(String nombre);
	
	String getApellidos();
	void setApellidos(String apellidos);
	
	Integer getEdad();
	void setEdad(Integer edad);
	
	Double getAltura();
	void setAltura(Double altura);
	
	Character getSexo();
	void setSexo(Character sexo);

}