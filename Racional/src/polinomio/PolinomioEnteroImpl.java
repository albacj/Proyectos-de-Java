package polinomio;

import java.util.Vector;

public class PolinomioEnteroImpl implements PolinomioEntero{

	private Vector<Integer> coeficientes;
	
	public PolinomioEnteroImpl() {
		
	}
	
	public PolinomioEnteroImpl(Vector<Integer> coeficientes) {
		this.coeficientes = coeficientes;
	}
	
	public Integer getGrado(Vector<Integer> polinomio) {
		return polinomio.size();
	}
	
	public Integer getCoeficiente(Vector<Integer> polinomio) {
		
		Integer solucion = 0;
		
		for(int i = 0; i <= polinomio.size(); i++) {
			if(i >= 0 && i <= polinomio.size()) {
				solucion = polinomio.get(i);
			}else {
				throw new IllegalArgumentException("El grado del coeficiente no se cumple "
						+ "que sea mayor o igual que cero "
						+ "y menor o igual que el grado del polinomio");
			}
		}
		
		return solucion;
		
	}
	
	public void setCoeficiente(Vector<Integer> polinomio) {
		
		for(int i = 0; i <= polinomio.size(); i++) {
			if(i >= 0 && i <= polinomio.size()) {
				polinomio.set(i, null);
			}else {
				throw new IllegalArgumentException("El grado del coeficiente no se cumple "
						+ "que sea mayor o igual que cero "
						+ "y menor o igual que el grado del polinomio");
			}
		}
		
	}

	@Override
	public int compareTo(PolinomioEntero o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PolinomioEntero clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Integer> getCoeficientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCoeficientes(Vector<Integer> coeficientes) {
		// TODO Auto-generated method stub
		
	}
	
}
