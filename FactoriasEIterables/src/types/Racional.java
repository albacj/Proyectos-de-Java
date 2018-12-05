package types;

import utils.Copiable;

public interface Racional extends Comparable<Racional>, Copiable<Racional>{
	Integer getNumerador();
	Integer getDenominador();
	void setNumerador(Integer a);
	void setDenominador(Integer a);
	Racional suma(Racional a);
	Racional multiplica(Racional a);
	void simplifica();
}

