package comparators;

import tipos.Cancion;

public class ComparadorCancionPorA�o implements java.util.Comparator<Cancion>{

	@Override
	public int compare(Cancion o1, Cancion o2) {
		// Auto-generated method stub
		return o1.getA�o().compareTo(o2.getA�o());
	}

}
