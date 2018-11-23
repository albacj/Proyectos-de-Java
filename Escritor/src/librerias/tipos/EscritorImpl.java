package librerias.tipos;

public class EscritorImpl implements Escritor{
	
	// Atributos privados
	private String nombre;
	private String apellidos;
	private String nacionalidad;

	// Constructor
	public EscritorImpl(String nom, String ape, String nac) {
		// Auto-generated constructor stub
		nombre = nom;
		apellidos = ape;
		nacionalidad = nac;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nac) {
		nacionalidad = nac;
	}
	
	public String toString() {
		
		String s = getApellidos() + ", " + getNombre() + " (" + getNacionalidad() + ")";
		return s;
	}

}
