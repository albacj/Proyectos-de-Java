package decimales;

import java.util.List;

public class Decimales {
	
	public static Double sumaLista(List<Double> l) {
		double res = 0.0;
		
		for(Double d:l) {
			res = res + d;
		}
		
		return res;
	}
	
	public static Double sumaListaPar(List<Double> l) {
		double res = 0.0;
		
		for(int i = 0; i <= l.size(); i++) {
			if(i % 2 == 0) {
				res = res + l.get(i);
			}
		}
		
		return res;
	}
	
	public static Integer divisionEntera(Integer a, Integer b) {
		Integer res = 0;
		Integer aux = a;
		
		while(aux >= b) {
			aux = aux - b;
			res++;
		}
		
		return res;
	}

}
