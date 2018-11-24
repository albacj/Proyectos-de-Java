package futbol;

public class JugadorFutbolImpl extends PersonaImpl implements JugadorFutbol{
	
	private String apodo;
	private String posicion;
	private Integer dorsal;
	
	public JugadorFutbolImpl(String nombre, String apellidos, String apodo, String posicion, Integer dorsal) {
		super(nombre, apellidos);
		this.apodo = apodo;
		this.posicion = posicion;
		this.dorsal = dorsal;
	}
	
	public JugadorFutbolImpl(String apodo, String posicion, Integer dorsal) {
		this.apodo = apodo;
		this.posicion = posicion;
		this.dorsal = dorsal;
	}
	
	public JugadorFutbolImpl(String apodo) {
		this.apodo = apodo;
	}

	@Override
	public String getApodo() {
		// Auto-generated method stub
		return apodo;
	}

	@Override
	public void setApodo(String apodo) {
		// Auto-generated method stub
		this.apodo = apodo;
	}

	@Override
	public Integer getDorsal() {
		// Auto-generated method stub
		return dorsal;
	}

	@Override
	public void setDorsal(Integer dorsal) {
		// Auto-generated method stub
		this.dorsal = dorsal;
	}

	@Override
	public String posicionJuego() {
		// Auto-generated method stub
		return posicion;
	}

	@Override
	public void setPosicionJuego(String posicion) {
		// Auto-generated method stub
		this.posicion = posicion;
	}
	
	public String toString() {
		return dorsal + " " + apodo;
	}
	
}
