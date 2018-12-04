package comparators;

import tipos.Vuelo;

public class ComparadorVueloPorFecha implements java.util.Comparator<Vuelo>{

	public int compare(Vuelo v1, Vuelo v2) {
		return v1.getFecha().compareTo(v2.getFecha());
	}
	
}
