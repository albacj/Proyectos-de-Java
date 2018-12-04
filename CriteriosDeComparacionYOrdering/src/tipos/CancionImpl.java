package tipos;

import excepciones.CancionNoValidaException;


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
	
	
	public CancionImpl(String nom, String in, Integer min, Integer seg, Integer a, String gen){
	
		if (min.equals(0) && seg.equals(0))
			throw new CancionNoValidaException("La duración no es válida");
		if (!existeGenero(gen))
			throw new CancionNoValidaException("El género no es válido");

		nombre = nom;
		interprete = in;
		duracion = new HoraImpl(min, seg);
		año = a;
		genero = gen;
		numeroDeReproducciones = 0;
		calificacion = 0;
		reproducir = true;
	}

	
	private Boolean existeGenero(String g){
		Boolean existe=false;
		for (String s: generosMusicales){
			existe = existe || (s.equals(g));
			if (s.equals(g)) {
				break;
			}
		}
		return existe;
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
		
		if (c<0 || c>5)
			throw new CancionNoValidaException("La calificación debe estar comprendida entre 0 y 5");
		calificacion = c;
	}

	public void setReproducir(Boolean r) {
		reproducir = r;
	}

	
	public int compareTo(Cancion c) {
		int r = 0;
		r = getNombre().compareTo(c.getNombre());
		if (r == 0){
			r = getInterprete().compareTo(c.getInterprete());
		}
		return r;
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
		return getNombre().hashCode() + getInterprete().hashCode()*31;
	}

	public String toString(){
		return "[" + getNombre() + ", " + getInterprete() + ", " + getAño() + "]";
	}

}
