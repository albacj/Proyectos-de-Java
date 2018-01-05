package utiles;

import java.util.Vector;

public class Enteros {

	// Devuelve un vector de n elementos donde cada elemento es igual a su posición natural + 1
	public static Vector<Integer> iniVector(Integer n){
		
		Vector<Integer> res = new Vector<Integer>();
		
		for(int i = 0; i < n; i++) {
			res.add(i + 1);
		}
		
		return res;
		
	}
	
	// Devuelve la suma de los elementos
	public static Integer sumaElementos(Integer[] v) {
		
		Integer res = 0;
		
		for(int i = 0; i < v.length; i++) {
			res = res + v[i];
		}
		
		return res;
		
	}
	
	// Devuelve la media de los elementos
	public static Double media(Integer[] v) {
		return (double) (Enteros.sumaElementos(v) / v.length);
	}
	
	// La función matemática potencia
	public static Integer potencia(Integer a, Integer b) {
		return (int) Math.pow(a, b);
	}
	
	// Devuelve el array invertido
	public static Integer[] invertirArray(Integer[] v) {
		
		Integer[] res = new Integer[v.length];
		
		for(int i = 0; i < v.length; i++) {
			res[v.length - i - 1] = v[i];
		}
		
		return res;
		
	}
	
	// Devuelve el producto entre dos números comprendidos
	public static Integer producto(Integer a, Integer b) {
		
		Integer res = 1;
		
		for(int i = a; i <= b; i++) {
			res = res * i;
		}
		
		return res;
		
	}
	
	// Función factorial
	public static Integer factorial(Integer n) {
		return Enteros.producto(1, n);
	}
	
	// Devuelve un vector con los factoriales de los elementos del vector de entrada
	public static Vector<Integer> factoriales(Integer[] v){
		
		Vector<Integer> res = new Vector<Integer>();
		
		for(int i = 0; i < v.length; i++) {
			res.add(Enteros.factorial(v[i]));
		}
		
		return res;
		
	}
	
	// Devuelve el mcd de a y b basado en el algoritmo de Euclides
	public static Integer mcd(Integer a, Integer b) {
		
		Integer[] r = new Integer[a*b];
		r[0] = a;
		r[1] = b;
		
		int i = 1;
		
		while(r[i] != 0) {
			r[i+1] = r[i-1] % r[i];
			i++;
		}
		
		return r[i-1];
		
	}
	
	// Devuelve el mcm de a y b
	public static Integer mcm(Integer a, Integer b) {
		return (a*b) / Enteros.mcd(a, b);
	}
	
}
