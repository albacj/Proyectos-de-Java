package ejercicios;

import java.util.HashSet;
import java.util.Set;

import puntoPlano.Punto;
import puntoPlano.PuntoImpl;
import test.Test;

public class Ejercicio1 extends Test {
	// Los siguientes atributos son visibles por todos los métodos de la clase
	private static Set<Punto> s;
	private static Set<Punto> s1;

	public static void apartadoA() {
		mostrar("Apartado a:");
		// TODO
		s = new HashSet<Punto>();
		Punto p1 = new PuntoImpl(1.5, 3.5);
		s.add(p1);
		Punto p2 = new PuntoImpl(1.5, 3.6);
		s.add(p2);
		Punto p3 = new PuntoImpl(1.5, 3.7);
		s.add(p3);
		mostrar("s: " + s);
	}

	public static void apartadoB() {
		mostrar("\nApartado b");
		// TODO
		Set<Punto> s1 = s;
		mostrar("s1: " + s1);
	}

	public static void apartadoC() {
		mostrar("\nApartado c");
		// TODO
		Set<Punto> s1 = s;
		
		for(Punto punto : s1) {
			punto.setY(5.5);
		}
		
		mostrar("s después de modificar s1: " + s);
	}

	public static void apartadoD() {
		mostrar("\nApartado d");
		// TODO
		Set<Punto> s1 = new HashSet<Punto>();
		s1.addAll(s);
		
		for(Punto punto : s1) {
			punto.setY(6.5);
		}
		
		mostrar("s después de modificar s1: " + s);
	}

	public static void apartadoE() {
		mostrar("\nApartado e");
		mostrar("s antes de modificar s1: " + s);
		// TODO
		Set<Punto> s1 = new HashSet<Punto>();
		s1.addAll(s);
		
		for(Punto punto : s1) {
			punto.setY(7.5);
		}
		
		mostrar("s1: " + s1);
		mostrar("s después de modificar s1: " + s);
	}
}
