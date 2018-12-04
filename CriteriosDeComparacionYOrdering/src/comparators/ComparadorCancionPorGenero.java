package comparators;

import tipos.Cancion;

public class ComparadorCancionPorGenero implements java.util.Comparator<Cancion>{

	@Override
	public int compare(Cancion o1, Cancion o2) {
		// Auto-generated method stub
		return o1.getGenero().compareTo(o2.getGenero());
	}

}
