package tipos;

import interfaces.Copiable;

import java.util.List;


public interface ListaDeReproduccion extends Copiable<ListaDeReproduccion> {
	String getNombre();
	void setNombre (String n);
	Integer getNumeroDeCanciones();
	List<Cancion> getCanciones();
	void setCanciones (List<Cancion> v);
	
	
	Hora duracionLista();
	Double calificacionLista();
}
