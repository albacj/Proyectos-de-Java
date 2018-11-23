package librerias.tipos;

public class LectorElectronicoImpl<T> implements LectorElectronico<T> {
	
	private String id;
	private String nombre;
	private T documento;

	public LectorElectronicoImpl(String id, String nombre, T documento) {
		// Auto-generated constructor stub
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
	}

	@Override
	public String getId() {
		// Auto-generated method stub
		return id;
	}

	@Override
	public String getNombre() {
		// Auto-generated method stub
		return nombre;
	}

	@Override
	public T getDocumento() {
		// Auto-generated method stub
		return documento;
	}

	@Override
	public void setNombre(String nombre) {
		// Auto-generated method stub
		this.nombre = nombre;

	}

	@Override
	public void setDocumento(T documento) {
		// Auto-generated method stub
		this.documento = documento;

	}
	
	public String toString() {
		
		String s = getNombre() + " -> " + getDocumento();
		return s;
		
	}

}
