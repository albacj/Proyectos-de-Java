package puntoPlano;

public class PuntoImpl implements Punto {
	
	private double x;
	private double y;
	
	public PuntoImpl(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		this.x = x;

	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		this.y = y;

	}
	
	// Representación
	public String toString(){ 
		
		String s="("+getX()+","+ getY()+")"; return s; 
		
	}
	
	// Igualdad
	public boolean equals(Object o) {
		
		boolean res = false;
		
		if(o instanceof Punto) {
			Punto p = (Punto) o; // Casteo el objeto para que sea de tipo Punto
			res = getX() == p.getX() && getY() == p.getY();
		}
		
		return res;
		
	}

	// Orden
	@Override
	public int compareTo(Punto p) {
		// TODO Auto-generated method stub
		
		int cmp = Double.compare(getX(), p.getX());
		
		if(cmp == 0) {
			cmp = Double.compare(getY(), p.getY());
		}
		
		return cmp;
	}

}
