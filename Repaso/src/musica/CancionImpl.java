package musica;

import excepciones.CancionNoValidaException;
import hora.*;

public class CancionImpl implements Cancion {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String interprete;
	private Hora duracion;
	private Integer año;
	private String genero;
	private Integer numeroDeReproducciones;
	private Integer calificacion;
	private Boolean reproducir;
	
	private static String[] generosMusicales = {"pop", "rock", "latino", "country"};
	
	// Ejercicio 1 - Constructor
	public CancionImpl(String nombre, String interprete, Integer min, Integer seg, Integer año, String genero) {
		
		// Ejercicio 2 - Excepción
		if(min.equals(0) && seg.equals(0)) {
			throw new CancionNoValidaException("La duración de una canción debe ser mayor de 0:00");
		}
		
		// Ejercicio 2 - existeGenero
		if(!existeGenero(genero)) {
			throw new CancionNoValidaException("El género de una canción debe ser un elemento de un conjunto dado de géneros");
		}
		
		this.nombre = nombre;
		this.interprete = interprete;
		this.duracion = new HoraImpl(min, seg);
		this.año = año;
		this.genero = genero;
		numeroDeReproducciones = 0;
		calificacion = 0;
		reproducir = true;
	}
	
	private Boolean existeGenero(String g) {
		Boolean res = false;
		
		for(String genero: generosMusicales) {
			if(g.equals(genero)) {
				res = true;
			}
		}
		
		return res;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getInterprete() {
		return interprete;
	}

	public Hora getDuracion() {
		return duracion;
	}

	public Integer getAño() {
		return año;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getNumeroDeReproducciones() {
		return numeroDeReproducciones;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public Boolean getReproducir() {
		return reproducir;
	}

	public void setNumeroDeReproducciones(Integer n) {
		numeroDeReproducciones = n;
	}

	public void setCalificacion(Integer c) {
		// Ejercicio 2 - Excepción
		if(c < 0 || c > 5) {
			throw new CancionNoValidaException("La calificación de una canción debe estar comprendida entre 0 y 5");
		}else {
			calificacion = c;
		}
	}

	public void setReproducir(Boolean r) {
		reproducir = r;
	}

	// Ejercicio 1 - compareTo
	public int compareTo(Cancion c) {
		int res = 0;
		res = getNombre().compareTo(c.getNombre());
		if (res == 0){
			res = getInterprete().compareTo(c.getInterprete());
		}
		return res;
	}
	
	public Cancion clone(){
		Cancion copia=null;
		try{
			copia=(Cancion)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return copia;
	}
	
	public boolean equals(Object o){
		boolean res = false;
		if (o instanceof Cancion){
			Cancion c = (Cancion)o;
			res = getNombre().equals(c.getNombre()) && getInterprete().equals(c.getInterprete());
		}
		return res;
	}
	
	public int hashCode(){
		return getNombre().hashCode() + getInterprete().hashCode()*31 + 
		   getDuracion().hashCode()*31*31;
	}

	public String toString(){
		return "[" + getNombre() + ", " + getInterprete() + "]";
	}

}
