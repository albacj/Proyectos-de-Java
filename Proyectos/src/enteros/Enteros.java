package enteros;

public class Enteros {
	
	public static Integer x;
	
	public static Boolean estaEnIntervaloCerrado(Integer a, Integer b) {
		
		if(x >= a && x <= b) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static Boolean estaEnIntervaloAbierto(Integer a, Integer b) {
		
		if(x > a && x < b) {
			return true;
		}else {
			return false;
		}
		
	}

}
