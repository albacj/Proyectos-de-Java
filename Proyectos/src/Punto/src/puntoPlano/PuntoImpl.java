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
	
	public String toString(){ 
		
		String s="("+getX()+","+ getY()+")"; return s; 
		
	}

}
