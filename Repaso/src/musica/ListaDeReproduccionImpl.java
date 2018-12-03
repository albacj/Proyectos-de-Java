package musica;

import java.util.LinkedList;
import java.util.List;

import hora.Hora;
import hora.HoraImpl;

public class ListaDeReproduccionImpl implements ListaDeReproduccion {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private List<Cancion> canciones;
	
	public ListaDeReproduccionImpl (String nom){
		nombre = nom;
		canciones = new LinkedList<Cancion>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public Integer getNumeroDeCanciones() {
		return canciones.size();
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setNombre (String n){
		nombre = n;
	}

	public void setCanciones(List<Cancion> v) {
		canciones = v;
	}

	public ListaDeReproduccion clone(){
		ListaDeReproduccion copia=null;
		try{
			copia=(ListaDeReproduccion)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return copia;
	}

	public boolean equals(Object o){
		boolean res = false;
		if (o instanceof ListaDeReproduccion){
			ListaDeReproduccion l = (ListaDeReproduccion)o;
			res = getNombre().equals(l.getNombre()) &&
			   getCanciones().equals(l.getCanciones());
		}
		return res;
	}
	
	public int hashCode(){
		return getNombre().hashCode()*31;
	}

	public String toString(){
		String res = getNombre() + ": ";
		for (Cancion c: getCanciones()){
			res += c + " ";
		}
		return res;
	}

	// Ejercicio 3a) - duracionLista
	
	public Hora duracionLista() {
		Hora res = new HoraImpl(0,0);
		
		for(Cancion c: getCanciones()) {
			res.suma(c.getDuracion());
		}
		
		return res;
	}

	// Ejercicio 3b) - calificacionLista
	
	public double calificacionLista() {
		double media = 0.0;
		double aux = 0.0;
		
		for(Cancion c: getCanciones()) {
			aux = aux + c.getCalificacion();
		}
		
		media = aux / getCanciones().size();
		
		return media;
	}

}
