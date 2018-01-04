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
		mostrar("La suma de los elementos de v es " + suma);

	}

}
