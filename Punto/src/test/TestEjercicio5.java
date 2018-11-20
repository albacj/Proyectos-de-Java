package test;

import java.util.ArrayList;
import java.util.List;

import ejercicios.Ejercicio5;

public class TestEjercicio5 extends Test {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(2);
		l1.add(1);
		l1.add(4);
		l1.add(5);
		l1.add(4);

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(1);

		mostrar("l1 antes: " + l1);
		mostrar("l2 antes: " + l2);

		Ejercicio5.intercambia(l1, l2);

		mostrar("l1 después: " + l1);
		mostrar("l2 después: " + l2);
	}
}
