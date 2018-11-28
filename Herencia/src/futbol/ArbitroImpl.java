package futbol;

public class ArbitroImpl extends PersonaImpl implements Arbitro{
	
	private String pos;
	private String apellidos;
	private String nombre;
	
	public ArbitroImpl(String apellidos, String nombre, String pos) {
		super(apellidos, nombre);
		this.pos = pos;
	}

	@Override
	public String getPosicion() {
		// Auto-generated method stub
		return pos;
	}

	@Override
	public void setPosicion(String pos) {
		// Auto-generated method stub
		this.pos = pos;
	}

	public String toString() {
		return apellidos + ", " + nombre + " Posición: " + pos;
	}

}
