package musica;

import java.util.ArrayList;
import java.util.Collections;
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
	
	/** ¿Cuál es la primera canción (en orden de aparición en la lista) interpretada por alguien? */
	
	public Cancion getCancion(String interprete) {
		Cancion res = null;
		
		for(Cancion c: getCanciones()) {
			if(c.getInterprete().equals(interprete)) {
				res = c;
				break;
			}

		}
		
		return res;
	}
	
	/** ¿Cuántas canciones de género “latino” hay en la lista? */
	
	public int cancionesDeGenero(String genero) {
		int cuantas = 0;
		
		for(Cancion c: getCanciones()) {
			if(c.getGenero() == genero) {
				cuantas = cuantas + 1;
			}
		}
		
		return cuantas;
	}
	
	/** ¿Cuál es la canción de género “pop” más escuchada de la lista? */
	
	public Cancion masEscuchada(String genero) {
		Cancion res = null;
		List<Cancion> laux = new ArrayList<Cancion>();
		
		for(Cancion c: getCanciones()) {
			if(c.getGenero() == genero) {
				laux.add(c);
			}
		}
		
		Collections.sort(laux, (c1, c2) -> c1.getNumeroDeReproducciones().compareTo(c2.getNumeroDeReproducciones()));
		
		res = laux.get(laux.size()-1);
		return res;
	}
	
	/** ¿Hay alguna canción en la lista cuyo nombre contenga la palabra “love”? */
	
	public boolean contienePalabra(String palabra) {
		boolean res = false;
		
		for(Cancion c: getCanciones()) {
			if(c.getNombre().contains(palabra)) {
				res = true;
			}
		}
		
		return res;
	}
	
	/** ¿Cuál es la canción más antigua de la lista? */
	
	public Cancion masAntugua() {
		Cancion res = null;
		
		Collections.sort(getCanciones(), (c1, c2) -> c1.getAño().compareTo(c2.getAño()));
		
		res = getCanciones().get(0);
		return res;
	}
	
	/** Incrementar en 1 el número de reproducciones de todas las canciones de la lista que estén marcadas para reproducir */
	
	public List<Cancion> cancionesParaReproducir(){
		List<Cancion> pendientes = new ArrayList<Cancion>();
		
		for(Cancion c: getCanciones()) {
			if(c.getNumeroDeReproducciones() == 0) {
				c.setCalificacion(1);
				pendientes.add(c);
			}
		}
		
		return pendientes;
	}
	
	/** Crear una nueva lista de nombre “Favoritas” con todas las canciones de la lista que tengan una calificación igual o superior a 4 puntos */
	
	public List<Cancion> favoritas(int calif){ // FIXME
		List<Cancion> favoritas = new ArrayList<Cancion>();
		
		for(Cancion c: getCanciones()) {
			if(c.getCalificacion() >= calif) {
				favoritas.add(c);
			}
		}
		
		return favoritas;
	}

}
