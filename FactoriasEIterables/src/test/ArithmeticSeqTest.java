package test;

import sequences.ArithmeticSeq;

public class ArithmeticSeqTest extends Test {

	static final Integer FIRST = -3;
	static final Integer BOUND = 3;
	static final Integer INCREMENT = 2;

	public static void main(String[] args) {

		//Ejercicio 7. Descomente el test
		ArithmeticSeq secCreciente = new ArithmeticSeq(FIRST, BOUND, INCREMENT);
		show("Secuencia creciente: ");
		for (Integer i : secCreciente)
			show(i);

		// hace saltar una excepción:
		// ArithmeticSeq secDecreciente = new ArithmeticSeq(FIRST, BOUND,
		// -INCREMENT);
		ArithmeticSeq secDecreciente = new ArithmeticSeq(BOUND, FIRST,
				-INCREMENT);
		show("Secuencia decreciente: ");
		for (Integer i : secDecreciente)
			show(i);

		//Ejercicio 7. Implemente el toString
		show("Secuencia creciente: " + secCreciente);
		show("Secuencia decreciente: " + secDecreciente);
	}

}
