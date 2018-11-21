package resolucionPractica;

import java.util.List;

import utilidades.Utiles;

public class Reales {
	
	public static double mediaAritmetica(List<Double> datos) {
		
		Integer n = datos.size();
		double aux = 0.0;
		
		for(int i = 0; i < n; i++) {
			aux = aux + datos.get(i);
		}
		
		return aux / n;
	}
	
	public static double desviacionEstandar(List<Double> datos) {
		
		Integer n = datos.size();
		double suma = 0.0;
		double aux = 0.0;
		
		for(int i = 0; i < n; i++) {
			suma = suma + Math.pow(datos.get(i) - mediaAritmetica(datos), 2);
		}
		
		aux = suma / (n - 1);
		
		return Math.sqrt(aux);
		
	}
	
	public static double maximo(List<Double> datos) {
		
		double maximo = datos.get(0);
		
		for(Double dato : datos) {
			
			if(maximo < dato) {
				maximo = dato;
			}
			
		}
		
		return maximo;
		
	}
	
	public static double minimo(List<Double> datos) {
		
		double minimo = datos.get(0);
		
		for(Double dato : datos) {
			
			if(Utiles.min(minimo, dato) != minimo) {
				minimo = dato;
			}
			
		}
		
		return minimo;
		
	}
	
	public static Boolean hayRuido(List<Double> datos, Double umbral){
		
		boolean ruido = false;
		
		for (Double dato : datos) {
			
			/**
			 * Dado un grupo de valores reales, se dice que “hay ruido” 
			 * cuando existen valores mayores o menores que un cierto umbral de tolerancia.
			 * 
			 * No me queda muy claro el concepto. */
			
			if(dato != umbral) {
				ruido = true;
			}
			
		}
		
		return ruido;
		
	}
	
	public static Boolean todosValoresVálidos (List<Double> l){
		
		boolean validos = false;
		
		for (Double elemento : l) {
			if(elemento == null) {
				break;
			}else {
				validos = true;
			}
		}
		
		return validos;
	}

}
