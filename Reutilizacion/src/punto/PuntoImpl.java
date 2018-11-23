package punto;

public class PuntoImpl implements Punto {

	
	private static final long serialVersionUID = -2068924487509291576L;
	private Double x;
	private Double y;

	public PuntoImpl(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public PuntoImpl(){
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public boolean equals(Object o) {
		boolean rdo = false;

		if (o instanceof Punto) {
			Punto p = (Punto) o;
			rdo = getX().equals(p.getX()) && getY().equals(p.getY());
		}

		return rdo;
	}

	public Punto clone() {
		Punto clon = null;

		try {
			clon = (Punto) super.clone();
		} catch (CloneNotSupportedException cnse) {

		}
		return clon;
	}

	public int hashCode() {
		return getX().hashCode() + 31 * getY().hashCode();
	}

	public String toString() {
		String s = "(" + getX() + ", " + getY() + ")";

		return s;
	}
}
