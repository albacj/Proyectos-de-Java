package test;

import java.util.HashSet;
import java.util.Set;

import ejercicios.Ejercicio4;

public class TestEjercicio4 extends Test {

	public static void main(String[] args) {
		// Ingl�s:
		Set<String> ingles = new HashSet<String>();
		ingles.add("1A");
		ingles.add("2B");
		ingles.add("3C");
		ingles.add("4D");
		ingles.add("5E");
		mostrar("Superaron ingl�s: " + ingles);

		// Franc�s:
		Set<String> frances = new HashSet<String>();
		frances.add("7G");
		frances.add("3C");
		frances.add("2B");
		frances.add("8H");
		frances.add("5E");
		mostrar("Superaron franc�s: " + frances);

		// Alem�n:
		Set<String> aleman = new HashSet<String>();
		aleman.add("7G");
		aleman.add("1A");
		aleman.add("3C");
		aleman.add("2B");
		mostrar("Superaron alem�n: " + aleman);

		// Apartado a: superaron ingl�s y otro
		Set<String> inglesYOtro = Ejercicio4.apartadoA(ingles, frances, aleman);
		mostrar("\nIngl�s y otro m�s: " + inglesYOtro);

		// Apartado b: superaron al menos dos idiomas
		Set<String> alMenosDos = Ejercicio4.apartadoB(ingles, frances, aleman);
		mostrar("Al menos dos idiomas: " + alMenosDos);

		// Apartado c: s�lo dominan un idioma
		Set<String> soloUno = Ejercicio4.apartadoC(ingles, frances, aleman);
		mostrar("S�lo un idioma: " + soloUno);
	}
}
