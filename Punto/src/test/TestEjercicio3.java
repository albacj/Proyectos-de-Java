package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ejercicios.Ejercicio3;

public class TestEjercicio3 extends Test {

	public static void main(String[] args) {
		// Curso actual:
		Set<String> g1 = new HashSet<String>();
		g1.add("1A");
		g1.add("2B");
		g1.add("3C");
		g1.add("4D");
		g1.add("5E");
		mostrar("Alumnos curso actual: " + g1);
		
		// Curso anterior:
		Set<String> g2 = new HashSet<String>();
		g2.add("7G");
		g2.add("3C");
		g2.add("2B");
		g2.add("8H");
		g2.add("5E");
		mostrar("Alumnos curso anterior: " + g2);
		
		// Apartado a (repetidores)
		Set<String> repetidores = Ejercicio3.apartadoA(g1, g2);
		mostrar("Repetidores: " + repetidores);

		// Apartado b (todos, ordenados alfabéticamente)
		// Todos:
		List<String> listaTodos = Ejercicio3.apartadoB(g1, g2);
		mostrar("Todos: " + listaTodos);
		
		// Apartado c (no repetidores)
		Set<String> nuevos = Ejercicio3.apartadoC(g1, g2);
		mostrar("No repetidores: " + nuevos);
	}
}
