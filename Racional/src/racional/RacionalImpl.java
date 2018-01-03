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
		
		String s = " ";
		
		if(getDenominador() == 1) {
			s = getNumerador() + "";
		}else if(getDenominador() < 0){
			s = "-" + getNumerador() + "/" + getDenominador();
		}else{
			s = getNumerador() + "/" + getDenominador();
		}
		
		return s;
		
	}
	
	// Igualdad
	public boolean equals(Racional r1, Racional r2) {
		
		boolean res = false;
		
		if(r1 instanceof Racional && r2 instanceof Racional) {
			int res1 = r1.getNumerador() * r2.getDenominador();
			int res2 = r1.getDenominador() * r2.getNumerador();
			res = res1 == res2;
		}
		
		return res;
		
	}

	// Orden
	@Override
	public int compareTo(Racional r) {
		// TODO Auto-generated method stub
		
		int cmp = Double.compare(getNumerador(), r.getNumerador());
		
		if(cmp == 0) {
			cmp = Double.compare(getDenominador(), r.getDenominador());
		}
		
		return cmp;
	}
	
	// Hash code
	public int hashCode(){
		return (Integer.valueOf(getNumerador()).hashCode() * 31) 
				+ (Integer.valueOf(getDenominador()).hashCode());
	}

}
