package tipos;

import interfaces.Copiable;

public interface Persona extends Comparable<Persona>, Copiable<Persona> {
	
	 String getNombre(); 
	 String getApellidos() ;
	 String getDNI();
	 Integer getEdad();
	 void setEdad(Integer e);
	 Double getEstatura();
	 void setEstatura(Double e);
	 Character getSexo();
	 void setSexo(Character s);
	 
}
