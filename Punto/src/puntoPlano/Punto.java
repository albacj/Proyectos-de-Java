package puntoPlano;

public interface Punto extends Comparable<Punto>{
	
	// Consultores
	double getX();
	double getY();
	
	// Modificadores
	void setX(double x);
	void setY(double y);

}
