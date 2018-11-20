package ejercicios;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import test.Test;

public class Ejercicio5 extends Test {

	public static <T> void intercambia(List<T> l1, List<T> l2) {
		// TODO
		for(T elemento : l1) {
			if(Collections.frequency(l1, elemento) > 1) {
				if(!l2.contains(elemento)) {
					l2.add(elemento);
				}
			}
			/**
			 * Pendiente eliminar el elemento repetido de l1 
			 * Cuando hago remove, no le gusta a eclipse
			*/
		}
	}
}
