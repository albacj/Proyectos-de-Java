package ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {
	public static <T> Set<T> diferenciaSimetrica(Set<T> a, Set<T> b) {
		// Calculamos la unión de a y b
		Set<T> union = new HashSet<T>();
		union.addAll(a);
		union.addAll(b);
		// Ahora la intersección:
		Set<T> interseccion = new HashSet<T>();
		
		for(T elemento : a) {
			if (b.contains(elemento)){
				interseccion.add(elemento);
			}
		}
		
		// La diferencia simétrica será la unión menos la intersección:
		Set<T> solucion = new HashSet<T>();
		solucion.addAll(union);
		solucion.removeAll(interseccion);
		return solucion;
	}
}
