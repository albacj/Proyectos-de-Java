package utiles;

import java.util.Vector;

public class Enteros {

	// Devuelve un vector de n elementos donde cada elemento es igual a su posición natural + 1
	public static Vector<Integer> iniVector(Integer n){
		
		Vector<Integer> res = new Vector<Integer>();
		
		for(int i = 0; i < n; i++) {
			res.add(i + 1);
		}
		
		return res;
		
	}
	
}
