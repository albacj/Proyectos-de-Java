package potenciaEntera;

public class PotenciaEnteraImpl implements PotenciaEntera {
	
	private int a;
	private int b;

	// Constructores
	
	public PotenciaEnteraImpl(int a, int b) {
		// TODO Auto-generated constructor stub
		
		if(a == 0 || b == 0) {
			throw new baseExponenteCeroException("La base y el exponente no pueden ser cero simultáneamente");
		}
		
		this.a = a;
		this.b = b;
	}
	
	public PotenciaEnteraImpl(int a) {
		// TODO Auto-generated constructor stub
		this.a = a;
		b = 1;
	}
	
	public PotenciaEnteraImpl() {
		// TODO Auto-generated constructor stub
		a = 1;
		b = 1;
	}
	
	// Métodos

	@Override
	public int getBase() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getExponente() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	public int getValor() {
		// TODO Auto-generated method stub
		return (int) Math.pow(a, b);
	}

	@Override
	public void setBase(int a) {
		// TODO Auto-generated method stub
		this.a = a;

	}

	@Override
	public void setExponente(int b) {
		// TODO Auto-generated method stub
		this.b = b;

	}
	
	public PotenciaEntera clone(){
		PotenciaEntera copia = null;
	    try {
	    	copia = (PotenciaEntera) super.clone();
	    }catch(CloneNotSupportedException e){
	        e.printStackTrace();
	    }
		    return copia;	
	}
	
	public String toString(){
		
		String s =  getBase() + "";

		if(getExponente() != 1){
			s = s + "^" + getExponente();
		}
		
		return s;
	}
	
	// Dos potencias son iguales si tienen la misma base y el mismo exponente
	public boolean equals (Object p){	
		
		boolean res = false;
		if(p instanceof PotenciaEntera){
			res = getBase() == ((PotenciaEntera) p).getBase() && getExponente() == ((PotenciaEntera) p).getExponente();
		}
		return res;
	}
	
	public int HashCode() {
		return Integer.valueOf(getBase()).hashCode() * 31 
				+ Integer.valueOf(getExponente()).hashCode();
	}
	
	public int compareTo(PotenciaEntera p){
		int cmp= Double.compare(getBase(), p.getBase());
		
		if(cmp== 0){
			cmp= Double.compare(getExponente(), p.getExponente());
		}
		
		return cmp;
	}

}
