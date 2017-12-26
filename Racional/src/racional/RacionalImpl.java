package racional;

public class RacionalImpl implements Racional {
	
	private int n;
	private int d;
	
	// Constructor
	public RacionalImpl(int num, int den) {
		n = num;
		d = den;
	}

	@Override
	public int getNumerador() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public int getDenominador() {
		// TODO Auto-generated method stub
		return d;
	}

	@Override
	public void setNumerador(int num) {
		// TODO Auto-generated method stub
		n = num;

	}

	@Override
	public void setDenominador(int den) {
		// TODO Auto-generated method stub
		d = den;

	}

	@Override
	public double getValor(int n, int d) {
		// TODO Auto-generated method stub
		return n/d;
	}
	
	// Para mostrar por consola
	public String toString(){
		
		return getNumerador() + "/" + getDenominador();
		
	}

}
