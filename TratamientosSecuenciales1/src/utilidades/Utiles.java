package utilidades;

import java.util.Comparator;

public class Utiles {
	
	////////////////////////////////////////////////////////////////////////////
	// Tema 4
	////////////////////////////////////////////////////////////////////////////
	
	public static <E extends Comparable<? super E>> boolean esMenor(E e1, E e2){
		
		return e1.compareTo(e2)< 0;
	}

	public static <E extends Comparable<? super E>> boolean esMenorOIgual(E e1, E e2){
		
		return e1.compareTo(e2)<= 0;
	}

	public static <E> boolean esMenor(E e1, E e2, Comparator<? super E> cmp){
		
		return cmp.compare(e1,e2)< 0;
	}

	public static <E> boolean esMenorOIgual(E e1, E e2, Comparator<? super E> cmp){
		
		return cmp.compare(e1,e2)<= 0;
	}

	public static <E extends Comparable<? super E>> boolean esMayorOIgual(E e1, E e2){
		
		return e1.compareTo(e2)>= 0;
	}

	public static <E extends Comparable<? super E>> boolean esMayor(E e1, E e2){
		
		return e1.compareTo(e2)> 0;
	}

	public static <E> boolean esMayorOIgual(E e1, E e2, Comparator<? super E> cmp){
		
		return cmp.compare(e1,e2)>= 0;
	}

	public static <E> boolean esMayor(E e1, E e2, Comparator<? super E> cmp){
		
		return cmp.compare(e1,e2) > 0;
	}

	public static <E> E min(E e1, E e2, Comparator<? super E> cmp){
		
		return cmp.compare(e1, e2)<= 0 ? e1 : e2;
	}

	public static <E> E max(E e1, E e2, Comparator<? super E> cmp){
		
		return cmp.compare(e1, e2)>= 0 ? e1 : e2;
	}

	public static <E extends Comparable<? super E>> E min(E e1, E e2){
		
		return e1.compareTo(e2)<= 0 ? e1 : e2;
	}

	public static <E extends Comparable<? super E>>	E max(E e1, E e2){
		
		return e1.compareTo(e2)>= 0 ? e1 : e2;
	}


}
