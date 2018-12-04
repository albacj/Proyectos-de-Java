package tipos;

import java.util.Vector;

public interface Vuelo extends Comparable<Vuelo> {
	String getDestino();
	Double getPrecio();
	Integer getNumPlazas();
	Integer getNumPasajeros();
	Vector<Persona> getPasajeros();
	Integer getCodigo();
	Fecha getFecha();	
	void setPrecio(double p);
}
