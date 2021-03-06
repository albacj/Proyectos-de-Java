package puntoPlano;

import java.lang.IllegalArgumentException;

public class PuntoImpl implements Punto {
	
	private double x;
	private double y;
	
	public PuntoImpl(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getX() {
		// Auto-generated method stub
		return x;
	}

	@Override
	public double getY() {
		// Auto-generated method stub
		return y;
	}

	@Override
	public void setX(double x) {
		// Auto-generated method stub
		this.x = x;

	}

	@Override
	public void setY(double y) {
		// Auto-generated method stub
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
		// Auto-generated method stub
		
		int cmp = Double.compare(getX(), p.getX());
		
		if(cmp == 0) {
			cmp = Double.compare(getY(), p.getY());
		}
		
		return cmp;
	}
	
	// Excepción
	public void coordenadasNoNull(Punto p) {
		
		if((Double) p.getX() == null || (Double) p.getY() == null) {
			throw new IllegalArgumentException("Las coordenadas no deben ser nulas");
		}
		
	}
	
	// Copiable
	public Punto clone() {
		
		Punto copia = null;
		
		try {
			copia = (Punto) super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return copia;
		
	}

}
