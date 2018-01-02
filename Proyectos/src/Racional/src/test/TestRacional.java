package test;

import racional.*;

public class TestRacional extends Test{
	
	public static void main(String[] args) {
		
		// AQUÍ EL CÓDIGO A EJECUTAR
		
		Racional r1 = new RacionalImpl(57, 35);
		Racional r2 = new RacionalImpl(948, 67);
		
		mostrar("Pareja 1 de racionales: ", r1);
		mostrar("Pareja 2 de racionales: ", r2);
		
		mostrar("Resultado de la pareja 1: ", r1.getValor(r1.getNumerador(), r1.getDenominador()));
		mostrar("Resultado de la pareja 2: ", r2.getValor(r2.getNumerador(), r2.getDenominador()));
		
		int sumaNumeradores = r1.getNumerador() + r2.getNumerador();
		int sumaDenominadores = r1.getDenominador() + r2.getDenominador();
		
		mostrar("La suma de los numeradores es: ", sumaNumeradores);
		mostrar("La suma de los denominadores es: ", sumaDenominadores);
		
		// Intercambio de los numeradores
		
		int aux = r1.getNumerador();
		r1.setNumerador(r2.getNumerador());
		r2.setNumerador(aux);
		
		mostrar("Numeradores intercambiados: ", r1.getNumerador() + "y" + r2.getNumerador());
		
		// Creando el nuevo racional r3 a partir de r1 y r2
		
		int nuevoNum = r1.getNumerador() * r2.getNumerador();
		int nuevoDen = r1.getDenominador() * r2.getDenominador();
		
		Racional r3 = new RacionalImpl(nuevoNum, nuevoDen);
		
		mostrar("Racional resultante: ", r3);
		
	}
	
	public boolean sumaEsIgual(int sumaNumeradores, int sumaDenominadores) {
		
		boolean res = false;
		
		if(sumaNumeradores == sumaDenominadores) {
			
			res = true;
			
			mostrar("El resultado de la igualdad es: ", sumaNumeradores + "=" + sumaDenominadores);
		}else {
			
			res = false;
			mostrar("La desigualdad es: ", sumaNumeradores + "!=" + sumaDenominadores);
			
		}
		
		return res;
		
	}
	


}
