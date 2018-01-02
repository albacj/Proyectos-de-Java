package librerias.tipos;

public class LibroImpl implements Libro {
	
	private String titulo;
	private Escritor autor;
	private String editorial;
	private int publicacion;
	private double precio;
	private int copias;

	public LibroImpl(String titulo, Escritor autor, int publicacion, String editorial){
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.publicacion = publicacion;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return titulo;
	}

	@Override
	public Escritor getAutor() {
		// TODO Auto-generated method stub
		return autor;
	}

	@Override
	public String getEditorial() {
		// TODO Auto-generated method stub
		return editorial;
	}

	@Override
	public int getPublicacion() {
		// TODO Auto-generated method stub
		return publicacion;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public int getCopiasVendidas() {
		// TODO Auto-generated method stub
		return copias;
	}

	@Override
	public double getRecaudacion() {
		// TODO Auto-generated method stub
		return getPrecio() * getCopiasVendidas();
	}

	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		this.precio = precio;

	}

	@Override
	public void setCopiasVendidas(int copias) {
		// TODO Auto-generated method stub
		this.copias = copias;

	}
	
	public String toString() {
		
		String s = getTitulo() + ", (" + getAutor() + "), " + getPublicacion() + " - " 
		+ getEditorial();
		
		return s;
	}

}
