package viajes;

import interfaces.Copiable;

import java.util.List;

public interface Viaje extends Copiable<Viaje>, Comparable<Viaje>{
	
	String getIdentificador();
	String getCompa�iaOperadora();
	Integer getM�nimoDePersonas();
	List<String> getCiudadesVisitadas();
	void setCiudadesVisitadas(List<String> ciudades);
	Double getPrecio();
	void setPrecio(Double precio);
	Integer getCalificacion();
	void setCalificacion(Integer calif);
	void a�adeCiudad(String ciudad);
	void eliminaCiudad(String ciudad);
}
