package viajes;

import interfaces.Copiable;

import java.util.List;

public interface Viaje extends Copiable<Viaje>, Comparable<Viaje>{
	
	String getIdentificador();
	String getCompañiaOperadora();
	Integer getMínimoDePersonas();
	List<String> getCiudadesVisitadas();
	void setCiudadesVisitadas(List<String> ciudades);
	Double getPrecio();
	void setPrecio(Double precio);
	Integer getCalificacion();
	void setCalificacion(Integer calif);
	void añadeCiudad(String ciudad);
	void eliminaCiudad(String ciudad);
}
