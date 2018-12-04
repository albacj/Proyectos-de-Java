package comparators;

import tipos.Cancion;

public class ComparadorCancionPorAño implements java.util.Comparator<Cancion>{

	@Override
	public int compare(Cancion o1, Cancion o2) {
		// Auto-generated method stub
		return o1.getAño().compareTo(o2.getAño());
	}

}
