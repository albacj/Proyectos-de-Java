package triangulo;

import interfaces.Copiable;

public interface Triangulo extends Copiable<Triangulo>{
	
	double getCoordenadaXposicion();
	double getCoordenadaYposicion();

	double getBase();
	void setBase(double base);
	
	double getAltura();
	void setAltura(double altura);
	
	double getSuperficie();
	
}
