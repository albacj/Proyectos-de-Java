package potenciaEntera;

public class PotenciaEnteraImpl implements PotenciaEntera {
	
	private int a;
	private int b;

	// Constructores
	
	public PotenciaEnteraImpl(int a, int b) {
		// TODO Auto-generated constructor stub
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

	@Override
	public int getBase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getExponente() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBase(int a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setExponente(int b) {
		// TODO Auto-generated method stub

	}

}
