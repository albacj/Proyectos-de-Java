package utils;

import java.util.Vector;

public class Integers {
	
	public static Boolean belongs(Integer a, Integer b, Integer x){
		if (a > b) 
			throw new IllegalArgumentException("Enteros.estaEn: El intervalo no es correcto: ("+a+","+b+")");
		Boolean esta = false;
		if ((x > a) && (x < b))
			esta = true;
		return esta;
	}
	
	public static Integer gcd(Integer m, Integer n){
		if (m <= 0 || m <= 0) 
			throw new IllegalArgumentException("Enteros.mcd: Algún parámetro de entrada no es positivo {"+m+";"+n+"}");
		
		Integer dividendo=m,divisor=n,resto;
		resto=dividendo%divisor;
		while (resto != 0) {
			dividendo=divisor;
			divisor  =resto;
			resto    =dividendo%divisor;
		}
		return divisor;
	}

	public static int lcm(Integer a, Integer b){
		return a*b/gcd(a,b);         
	}
	
	public static Boolean isPrime(Integer n){
		if (n <= 0) 
			throw new IllegalArgumentException("Enteros.esPrimo: El parámetro de entrada debería ser positivo");
		
		Integer i = 2;
		Boolean primo = true;
		while (i <= Math.sqrt(n) && primo){
			if (n%i == 0)
				primo = false;
			i = i+1;
		}
		return primo;
	}
	public static Vector<Integer> primeLessThan(Integer n) {
		if (n <= 0) 
			throw new IllegalArgumentException("Enteros.primosMenores: El parámetro de entrada debería ser positivo");
				
		Vector<Integer> res = new Vector<Integer>();		
		for (int p = 1; p < n; p++) {
			if (isPrime(p)){
				res.add(p);
			}
		}
		return res;
	}
	
	public static Integer product(Integer a, Integer b){
		if (a > b) 
			throw new IllegalArgumentException("Enteros.producto: El intervalo no es correcto: ("+a+","+b+")");
		
		Integer res = 1;
		for(int i = a; i <= b; i++)
			res *= i;
		return res;
	}
	
}
