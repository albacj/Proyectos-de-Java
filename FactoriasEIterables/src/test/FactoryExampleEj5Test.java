package test;

import java.util.List;
import java.util.Random;
import java.util.Set;

import types.ListType;
import types.SetType;
import utils.Lists;
import utils.Sets;


public class FactoryExampleEj5Test extends Test {

	// Ejercicio 5.
	// En este ejercicio se proporciona todo el código, simplemente se pide que
	// lo ejecute cambiando el valor de las constantes y observe el resultado.

	private static final ListType MY_LIST = ListType.LINKED_LIST;
	private static final SetType MY_SET = SetType.LINKED_HASHSET;

	private static final int MAX = 100000;
	private static long tBefore, tAfter;
	private static Random rand = new Random();

	public static void main(String[] args) {

		List<Integer> l = Lists.create(MY_LIST);
		Set<Integer> s = Sets.create(MY_SET);

		tBefore = System.currentTimeMillis();
		doAnyThing(l, s);
		tAfter = System.currentTimeMillis();
		show("Tiempo de ejecución:" + (tAfter - tBefore) + " milisegundos");

	}

	private static void doAnyThing(List<Integer> l, Set<Integer> s) {
		List<Integer> l2 = Lists.create(MY_LIST);
		Set<Integer> s2 = Sets.create(MY_SET);
		for (int i = 0; i < MAX; i++) {
			l.add(rand.nextInt(MAX));
			s.add(rand.nextInt(MAX));
		}
		for (int i = 0; i < MAX / 2; i++) {
			Integer item = l.get(i);
			l2.add(item);
			l.remove(item);
			s2.add(i);
			s.remove(i);
		}
		for (Integer i : l2) {
			if (s2.contains(i))
				s2.remove(i);
		}
	}

}