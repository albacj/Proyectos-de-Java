package test;

import java.util.HashSet;
import java.util.Set;

import ejercicios.Ejercicio2;

public class TestEjercicio2 extends Test {
	public static void main(String[] args) {
		// Las cinco primeras letras
		Set<Character> s1 = new HashSet<Character>();
		s1.add('A');
		s1.add('B');
		s1.add('C');
		s1.add('D');
		s1.add('E');

		// Las vocales
		Set<Character> s2 = new HashSet<Character>();
		s2.add('A');
		s2.add('E');
		s2.add('I');
		s2.add('O');
		s2.add('U');

		// La diferencia simétrica será las cinco primeras letras que no son
		// vocales y las cinco vocales que
		// no están entre las cinco primeras letras
		Set<Character> difSim = Ejercicio2.diferenciaSimetrica(s1, s2);
		mostrar("s1: " + s1);
		mostrar("s2: " + s2);
		mostrar("Diferencia simétrica: " + difSim);

	}
}
