package tipos;

import interfaces.Copiable;

public interface Cancion extends Copiable<Cancion>, Comparable<Cancion> {
	String getNombre();
	String getInterprete();
	Hora getDuracion();
	Integer getAño();
	String getGenero();
	Integer getNumeroDeReproducciones();
	void setNumeroDeReproducciones (Integer n);
	Integer getCalificacion();
	void setCalificacion (Integer c);
	Boolean getReproducir();
	void setReproducir (Boolean r);
}
