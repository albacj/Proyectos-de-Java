package test;

import java.util.List;
import java.util.Random;

import edu.use.lsi.fp.types.ListType;
import edu.use.lsi.fp.utils.Lists;

public class PerformanceListsTest extends Test {

	// TODO: Ejercicio 2.a
	// a) En la clase ListsPerformanceTest cree las siguiente constantes.

	private static Random rand = new Random();
	private static long tBefore, tAfter;

	public static void main(String[] args) {

		// TODO: Ejercicio 2.b
		// b) Usando la factoría cree tres listas llamadas arrayList, vector y
		// linkedList.

		show("TEST DE INSERCIÓN=============================");
		show("Vamos a insertar " + NUM_INSERTS + " elementos...");
		insertTest(arrayList);
		insertTest(vector);
		insertTest(linkedList);
		show("TEST DE BÚSQUEDA==============================");
		show("Vamos a buscar " + NUM_SEARCHES + " elementos...");
		searchTest(arrayList);
		searchTest(vector);
		searchTest(linkedList);
		show("TEST DE ACCESO================================");
		show("Vamos a acceder a " + NUM_ACCESSES + " elementos...");
		accessTest(arrayList);
		accessTest(vector);
		accessTest(linkedList);
		show("TEST DE BORRADO===============================");
		show("Vamos a borrar " + NUM_DELETES + " elementos...");
		deleteTest(arrayList);
		deleteTest(vector);
		deleteTest(linkedList);

	}

	// TODO: Ejercicio 2.c
	// c) Termine de implementar el método insertTest(l) para que ejecute un
	// bucle que inserte en la lista l tantos números enteros aleatorios entre 0
	// y MAX_VALUE como indique la constante NUM_INSERTS. Para generar un número
	// entero aleatorio entre 0 y MAX_VALUE utilice el siguiente código.
	private static void insertTest(List<Integer> l) {
		tBefore = System.currentTimeMillis();
		for () {
			
		}
		tAfter = System.currentTimeMillis();
		show(l.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");
	}

	// TODO: Ejercicio 2.d
	// d) Implemente el método searchTest(l) para que muestre el tiempo que
	// tarda en ejecutarse un bucle en el que se buscan (con el método
	// contains()) tantos elementos como indique la constante NUM_SEARCHES.
	private static void searchTest(List<Integer> l) {
		tBefore = System.currentTimeMillis();
		for () {
			
		}
		tAfter = System.currentTimeMillis();
		show(l.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");

	}

	// TODO: Ejercicio 2.e
	// e) Implemente el método accessTest(l) para que muestre el tiempo que
	// tarda en ejecutarse un bucle en el que se acceden (con el método get()) a
	// tantos elementos aleatorios entre 0 y NUM_INSERTS como indique la
	// constante NUM_ACCESSES.
	private static void accessTest(List<Integer> l) {
		tBefore = System.currentTimeMillis();
		Integer n = 0;
		for () {
			
		}
		tAfter = System.currentTimeMillis();
		show(l.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");

	}

	// TODO: Ejercicio 2.f
	// f) Implemente el método deleteTest(l) para que muestre el tiempo que
	// tarda en ejecutarse un bucle en el que se eliminan (con el método
	// remove()) los NUM_DELETES primeros elementos de la lista.
	private static void deleteTest(List<Integer> l) {
		tBefore = System.currentTimeMillis();
		for () {
		}
		tAfter = System.currentTimeMillis();
		show(l.getClass().getName() + ":\t" + (tAfter - tBefore)
				+ " milisegundos");
	}
}
