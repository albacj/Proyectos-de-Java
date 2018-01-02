package librerias.tipos;

public interface LectorElectronico {
	
	String getId();
	String getNombre();
	T getDocumento();
	
	void setNombre(String nombre);
	void setDocumento(T documento);

}
