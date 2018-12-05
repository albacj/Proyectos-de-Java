package test;

import java.util.Set;

import types.SetType;
import utils.Sets;

public class SetsTest extends Test {

	public static void main(String[] args) {

		//Ejercicio 3
		// Descomente el test y ejecútelo

				// Crear un HashSet
		Set<Integer> s1 = Sets.create(SetType.HASH_SET);
		s1.add(10);
		s1.add(9);
		s1.add(8);
		s1.add(7);
		s1.add(6);
		s1.add(5);
		s1.add(4);
		s1.add(3);
		s1.add(2);
		s1.add(1);
		
		show("s1(hash): " + s1);

		// Crear un LinkedHAshSet
		Set<Integer> s2 = Sets.create(SetType.LINKED_HASHSET);
		s2.add(10);
		s2.add(9);
		s2.add(8);
		s2.add(7);
		s2.add(6);
		s2.add(5);
		s2.add(4);
		s2.add(3);
		s2.add(2);
		s2.add(1);
		show("s2(linked): " + s2);

		// Crear un treeSet
		Integer[] someNumbers = { 10,9,8, 5, 6, 5, 6, 10, 9, 8 };
		Set<Integer> s3 = Sets.create(SetType.TREE_SET, someNumbers);
		show("s3(tree): " + s3);

		// Se pueden comparar 
		show("s1 == s2: " + s1.equals(s2));
		show("s2 == s3: " + s2.equals(s3));

		s2.add(3);
		s2.add(4);
		// Se pueden mezclar
		s2.addAll(s3);
		s1.addAll(s2);
		show("s1+s2+s3: "+s1);
	}

}
