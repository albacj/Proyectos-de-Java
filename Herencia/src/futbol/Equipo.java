package futbol;

import java.util.Vector;

public interface Equipo<T> {

	String getNombre();
	void setNombre(String nombreEquipo);
	
	Vector<T> getComponentesDelEquipo();
	void setComponentesDelEquipo(Vector<T> componentesDelEquipo);
	
	void anadeComponente(T comp);
	T getComponente(Integer pos);
	
}
