package vuelos;

import java.util.List;

public interface Vuelo extends Comparable<Vuelo> {
	String getDestino();
	Double getPrecio();
	Integer getNumPlazas();
	Integer getNumPasajeros();
	List<Persona> getPasajeros();
	Integer getCodigo();
	Fecha getFecha();	
	void setPrecio(double p);
}
