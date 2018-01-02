package librerias.tipos;

public interface Libro {
	
	String getTitulo();
	Escritor getAutor();
	String getEditorial();
	int getPublicacion();
	float getPrecio();
	int getCopiasVendidas();
	double getRecaudacion();
	
	void setPrecio(float precio);
	void setCopiasVendidas(int copias);

}
