package punto;

import interfaces.Copiable;

public interface Punto extends Copiable<Punto>{
		Double getX();
		Double getY();
		void setX(Double x);
		void setY(Double y);
}
