package test;

import java.util.ArrayList;
import java.util.List;

import resolucionPractica.Reales;

public class TestReales extends Test{
	
	public static void main (String[] args) {
		
		List<Double> l = new ArrayList<Double>();
		l.add(1.9);
		l.add(2.4);
		l.add(2.1);
		l.add(1.1);
		l.add(2.0);
		l.add(1.8);
		
		mostrar("La media aritmética es " + Reales.mediaAritmetica(l));
		mostrar("La desviación estándar es " + Reales.desviacionEstandar(l));
		mostrar("El mayor número de la lista es " + Reales.maximo(l));
		mostrar("El menor número de la lista es " + Reales.minimo(l));
		mostrar("¿Hay ruido? " + Reales.hayRuido(l, 1.5));
		mostrar("¿Todos los valores son distintos de null? " + Reales.todosValoresVálidos(l));
	}

}
