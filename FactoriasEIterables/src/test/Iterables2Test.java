package test;

public class Iterables2Test extends Test {

	static final Integer FIRST = 1;
	static final Integer BOUND = 100;
	static final Integer INCREMENT = 10;
	static final String NAMES = "./res/nombres.txt";
	static final String RATIONALS = "./res/racionales.txt";
	static final String OUTPUT_DIR = "./res/";

	public static void main(String[] args) {

		// TODO: Ejercicio 10.a

		// // Ejecuta el toString de ArithmeticSeq
		// show("Secuencia aritmética desde " + FIRST + " hasta " + BOUND + ": "
		// + i1);
		// show("Secuencia aritmética desde " + FIRST + " hasta " + BOUND
		// + " con incremento de " + INCREMENT + ": " + i2);
		// // Ejecuta el toString de InputStreamSeq
		// show("Secuencia de nombres leídos de " + NAMES + ": " + i3);
		// // Ojo, ejecuta el toString de List, no del array. Ver salida
		// show("Array de vocales:" + vowels);
		// show("Secuencia de vocales:" + i4);
		//
		// // Creamos captchas con el copntenido de un archivo que tratamos como
		// un
		// // iterador más. La lectura del archivo es trasparente al usuario de
		// // Iterables2

		// TODO: Ejercicio 10.b

		Iterable<String> i5 = Iterables2.from(RATIONALS);

		show("Los racionales leídos desde el archivo " + RATIONALS + " son: "
				+ i5);
		Racional sumaRac = new RacionalImpl(0);
		for (String rac : i5) {
			// Crear reacional desde cadena
			// Acumular la suma en sumRac
		}
		show("La suma de todos los racionales que hay en " + RATIONALS
				+ " es: " + sumaRac);
	}

}
