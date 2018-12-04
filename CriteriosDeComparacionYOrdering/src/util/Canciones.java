package util;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import tipos.Cancion;


import com.google.common.collect.Ordering;

import comparators.ComparadorCancionPorAño;


public class Canciones {

	// Pr14. Ejercicio 6a
	public List<Cancion> creaCopiaListaA(List<Cancion> canciones, Comparator<Cancion> c){
		
		/** cree un objeto de tipo Ordering a partir del comparador */
		Ordering<Cancion> o = Ordering.from(c);
		
		/** cree una copia ordenada de la lista */
		List<Cancion> lcopia = o.sortedCopy(canciones);
		return lcopia;
	}
	
	
	
	// Pr14. Ejercicio 6b
	public List<Cancion> creaCopiaListaB (List<Cancion> canciones){
		
		/** cree un objeto de tipo Ordering cuyo criterio de orden será la representación en cadena de los objetos del iterable */
		Ordering<Object> o = Ordering.usingToString();
		
		/** Cree una copia ordenada de la lista */
		List<Cancion> lcopia = o.sortedCopy(canciones);
		return lcopia;
	}
	
	
	
	// Pr14. Ejercicio 6c
	public List<Cancion> creaCopiaC(List<Cancion> canciones){
		Ordering<Cancion> o = Ordering.natural();
		List<Cancion> lcopia = o.sortedCopy(canciones);
		return lcopia;
	}
	
	

	// Pr14. Ejercicio 6d
	public int posicionCancion(List<Cancion> canciones, Cancion c) {
		Ordering<Cancion> o = Ordering.natural();
		Collections.sort(canciones, o);
		return canciones.indexOf(c);
	}


	
	// TODO Pr14. Ejercicio 6e
	public void creaCopiaListaE(List<Cancion> canciones) {
		Ordering<Cancion> o = Ordering.natural();
		Collections.sort(canciones, o);
	}

	
	
	// Pr14. Ejercicio 6f
	public void creaCopiaListaF(List<Cancion> canciones) {
		Ordering<Cancion> o = Ordering.natural();
		Collections.reverse(o.sortedCopy(canciones));
	}


	
	
	// TODO Pr14. Ejercicio 6g
	
	
}
