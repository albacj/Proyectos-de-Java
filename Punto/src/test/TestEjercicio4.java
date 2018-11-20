package test;

import java.util.HashSet;
import java.util.Set;

import ejercicios.Ejercicio4;

public class TestEjercicio4 extends Test {

	public static void main(String[] args) {
		// Inglés:
		Set<String> ingles = new HashSet<String>();
		ingles.add("1A");
		ingles.add("2B");
		ingles.add("3C");
		ingles.add("4D");
		ingles.add("5E");
		mostrar("Superaron inglés: " + ingles);

		// Francés:
		Set<String> frances = new HashSet<String>();
		frances.add("7G");
		frances.add("3C");
		frances.add("2B");
		frances.add("8H");
		frances.add("5E");
		mostrar("Superaron francés: " + frances);

		// Alemán:
		Set<String> aleman = new HashSet<String>();
		aleman.add("7G");
		aleman.add("1A");
		aleman.add("3C");
		aleman.add("2B");
		mostrar("Superaron alemán: " + aleman);

		// Apartado a: superaron inglés y otro
		Set<String> inglesYOtro = Ejercicio4.apartadoA(ingles, frances, aleman);
		mostrar("\nInglés y otro más: " + inglesYOtro);

		// Apartado b: superaron al menos dos idiomas
		Set<String> alMenosDos = Ejercicio4.apartadoB(ingles, frances, aleman);
		mostrar("Al menos dos idiomas: " + alMenosDos);

		// Apartado c: sólo dominan un idioma
		Set<String> soloUno = Ejercicio4.apartadoC(ingles, frances, aleman);
		mostrar("Sólo un idioma: " + soloUno);
	}
}
