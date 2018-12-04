package tipos;

import interfaces.Copiable;


public interface Persona extends Comparable<Persona>, Copiable<Persona>{
	String getDni();
	String getNombre();
	String getApellidos();
	Fecha getFechaNacimiento(); 
}
