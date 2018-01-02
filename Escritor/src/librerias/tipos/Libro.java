package librerias.tipos;

public interface Libro {
	
	String getTitulo();
	Escritor getAutor();
	String getEditorial();
	int getPublicacion();
	double getPrecio();
	int getCopiasVendidas();
	double getRecaudacion();
	
	void setPrecio(double precio);
	void setCopiasVendidas(int copias);

}
