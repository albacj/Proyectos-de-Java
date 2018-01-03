package racional;

public interface Racional extends Comparable<Racional>{
	
	// M�todos consultores
	int getNumerador();
	int getDenominador();
	
	// M�todos modificadores
	void setNumerador(int num);
	void setDenominador(int den);
	
	//Devuelve el valor real obtenido al dividir el numerador entre el denominador
	double getValor(int n, int d);

}
