package comparators;

import tipos.Vuelo;

public class ComparadorVueloPorPrecio implements java.util.Comparator<Vuelo>{

	public int compare(Vuelo v1, Vuelo v2) {
		return v1.getPrecio().compareTo(v2.getPrecio());
	}

}
