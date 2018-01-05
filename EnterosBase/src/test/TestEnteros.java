package test;

import java.util.Vector;
import utiles.Enteros;

public class TestEnteros extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = Enteros.iniVector(7);
		mostrar("El contenido de v es " +v);
		
		mostrar("\n");
		
		Integer[] vSuma = {1,2,3,4};
		Integer suma = Enteros.sumaElementos(vSuma);
		mostrar("La suma de los elementos de vSuma es " + suma);
		
		mostrar("\n");
		
		Double media = Enteros.media(vSuma);
		mostrar("La media de los elementos de vSuma es " + media);
		
		mostrar("\n");
		
		Integer res = Enteros.potencia(4, 6);
		mostrar("4 ^ 6 es igual a " +res);
		
		mostrar("\n");
		
		Integer[] invertido = Enteros.invertirArray(vSuma);
		mostrar("Los elementos de vSuma al revés son " +invertido);
		
		mostrar("\n");
		
		Integer producto = Enteros.producto(3, 7);
		mostrar("El resultado de 3*4*5*6*7 es igual a " +producto);

	}

}
