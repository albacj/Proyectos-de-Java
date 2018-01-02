package librerias.tipos;

public class LectorElectronicoImpl implements LectorElectronico {
	
	private String id;
	private String nombre;
	private T documento;

	public LectorElectronicoImpl(String nombre, String docuemnto) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.documento = documento;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public T getDocumento() {
		// TODO Auto-generated method stub
		return documento;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;

	}

	@Override
	public void setDocumento(T documento) {
		// TODO Auto-generated method stub
		this.documento = documento;

	}
	
	public String toString() {
		
		String s = getNombre() + " -> " + getDocumento();
		return s;
		
	}

}
