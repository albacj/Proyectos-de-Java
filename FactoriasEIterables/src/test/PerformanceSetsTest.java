package test;

import java.util.Random;
import java.util.Set;

import edu.use.lsi.fp.types.SetType;
import edu.use.lsi.fp.utils.Sets;

public class PerformanceSetsTest extends Test {

	//TODO: Ejercicio 4. Declare las constantes necesarias
	
	private static Random rand = new Random();
	private static long tBefore, tAfter;

	public static void main(String[] args) {
		//TODO: Ejercicio 4. Descomente el test 
		
//		Set<Integer> hashSet, treeSet, linkedSet;
//
//		hashSet = Sets.create(SetType.HASH_SET);
//		linkedSet = Sets.create(SetType.LINKED_HASHSET);
//		treeSet = Sets.create(SetType.TREE_SET);
//
//		show("TEST DE INSERCIÓN=============================");
//		show("Vamos a insertar " + NUM_INSERTS + " elementos...");
//		insertTest(hashSet);
//		insertTest(linkedSet);
//		insertTest(treeSet);
//		show("TEST DE BÚSQUEDA==============================");
//		show("Vamos a buscar " + NUM_SEARCHES + " elementos...");
//		searchTest(hashSet);
//		searchTest(linkedSet);
//		searchTest(treeSet);
//		show("TEST DE BORRADO===============================");
//		show("Vamos a borrar " + NUM_DELETES + " elementos...");
//		deleteTest(hashSet);
//		deleteTest(linkedSet);
//		deleteTest(treeSet);
//		show("TEST DE RETAINS==============================");
//		show("Vamos a hacer " + NUM_RETAINS + " retains de dos conjuntos de "
//				+ NUM_INSERTS + " elementos ...");
//		retainsTest(SetType.HASH_SET);
//		retainsTest(SetType.LINKED_HASHSET);
//		retainsTest(SetType.TREE_SET);
//		show("TEST DE CONTAINS==============================");
//		show("Vamos a hacer " + NUM_CONTAINS + " contains de dos conjuntos de "
//				+ NUM_INSERTS + " elementos ...");
//		containsTest(SetType.HASH_SET);
//		containsTest(SetType.LINKED_HASHSET);
//		containsTest(SetType.TREE_SET);

	}


	//TODO: Ejercicio 4. Complete los siguientes métodos
	private static void insertTest(Set<Integer> s) {
		tBefore = System.currentTimeMillis();
		for () {
		}
		tAfter = System.currentTimeMillis();
		show(s.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");

	}

	private static void deleteTest(Set<Integer> s) {
		tBefore = System.currentTimeMillis();
		for () {
		}
		tAfter = System.currentTimeMillis();
		show(s.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");
	}

	private static void searchTest(Set<Integer> s) {
		tBefore = System.currentTimeMillis();
		for () {
		}
		tAfter = System.currentTimeMillis();
		show(s.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");

	}

	private static void containsTest(SetType t) {
		Set<Integer> s1, s2;
		s1 = Sets.create(t);
		s2 = Sets.create(t);
		for (int i = 0; i < NUM_INSERTS; i++) {
			s1.add(rand.nextInt(MAX_VALUE));
			s2.add(rand.nextInt(MAX_VALUE));
		}

		tBefore = System.currentTimeMillis();
		for () {
			//Haga NUM_RETAINS entre s1 y s2
		}
		tAfter = System.currentTimeMillis();
		show(s1.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");

	}

	private static void retainsTest(SetType t) {
		Set<Integer> s1, s2;
		s1 = Sets.create(t);
		s2 = Sets.create(t);
		for (int i = 0; i < NUM_INSERTS; i++) {
			s1.add(rand.nextInt(MAX_VALUE));
			s2.add(rand.nextInt(MAX_VALUE));
		}

		tBefore = System.currentTimeMillis();
		for () {
			//Haga NUM_CONTAINS entre s1 y s2
		}
		tAfter = System.currentTimeMillis();
		show(s1.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");

	}

}
