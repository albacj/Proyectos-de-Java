package librerias.tipos;

public interface LectorElectronico<T> {
	
	String getId();
	String getNombre();
	T getDocumento();
	
	void setNombre(String nombre);
	void setDocumento(T documento);

}
