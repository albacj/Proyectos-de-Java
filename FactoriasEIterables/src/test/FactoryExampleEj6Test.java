package test;

import java.util.List;
import java.util.Random;
import java.util.Set;

import types.ListType;
import types.SetType;
import utils.Lists;
import utils.Sets;


public class FactoryExampleEj6Test extends Test {

	// TODO: Ejercicio 6.
	// Modifique el código anterior para que mida el tiempo que tarda en
	// ejecutarse un programa para todas las combinaciones posibles de
	// implementación de los tipos List y Set. Para ello utilice un par de for
	// extendidos sobre los tipos enumerados

	private static final int MAX = 100000;
	private static long tBefore, tAfter;
	private static Random rand = new Random();

	public static void main(String[] args) {

		for (ListType lt : ListType.values()) {
			for (SetType st : SetType.values()) {
				List<Integer> l = Lists.create(lt);
				Set<Integer> s = Sets.create(st);
				tBefore = System.currentTimeMillis();
				doAnyThing(l, s, lt, st);
				tAfter = System.currentTimeMillis();
				show("Tiempo de ejecución con " + lt.toString() + " y "
						+ st.toString() + ":" + (tAfter - tBefore)
						+ " milisegundos");
			}
		}

	}

	private static void doAnyThing(List<Integer> l, Set<Integer> s,
			ListType lt, SetType st) {
		List<Integer> l2 = Lists.create(lt);
		Set<Integer> s2 = Sets.create(st);
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