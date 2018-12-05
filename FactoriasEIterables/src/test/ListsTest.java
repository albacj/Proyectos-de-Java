package test;

import java.util.List;

import types.ListType;
import utils.Lists;

public class ListsTest extends Test {

	public static void main(String[] args) {

		// Ejercicio 1.d
		// Descomente el test y ejecútelo
		
//		// Crear una lista implementada con ArrayList
		List<Integer> l1 = Lists.create(ListType.ARRAY_LIST);
		l1.add(1);
		l1.add(2);
		show("l1(array): " + l1);
//
//		// Crear una lista implementada con LinkedList
		List<Integer> l2 = Lists.create(ListType.LINKED_LIST);
		l2.add(1);
		l2.add(2);
		show("l2(linked): " + l2);
//
//		// Crear una lista implementada con Vector a partir de un Array
		Integer[] cincoSeis = { 5, 6 };
		List<Integer> l3 = Lists.create(ListType.VECTOR_LIST, cincoSeis);
		show("l3(vector): " + l3);
//
//		// Se pueden comparar listas aunque se hayan construido con distintas
//		// implementaciones. Fíjese que l1 y l2 son iguales aunque el primero se
//		// haya construido con ArrayList y el segundo con LinkedList.
		show("l1 == l2: " + l1.equals(l2));
		show("l2 == l3: " + l2.equals(l3));
//
//		// Se pueden "mezclar"
		l2.addAll(l3);
		l1.addAll(l2);
		show("l1+l2+l3: " + l1);
	}

}
