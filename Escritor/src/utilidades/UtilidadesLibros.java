package utilidades;

import librerias.tipos.Libro;

public class UtilidadesLibros {
	
	public static Integer LIMITE_BEST_SELLER = 50000;
	
	public static Boolean esBestSeller(Libro l) {
		
		if(l.getCopiasVendidas() >= LIMITE_BEST_SELLER) {
			return true;
		}else {
			return false;
		}
	}
	
	public static double aplicaDescuento(Libro l, double d) {
		
		return l.getPrecio() - (l.getPrecio() * d);
		
	}
	
	public static double aplicaIncremento(Libro l, double d) {
		
		return l.getPrecio() + (l.getPrecio() * d);
		
	}
	
	public static double cambiaPrecio1(Libro l, double d, boolean b) {
		
		double res = 0.0;
		
		if(b == true) {
			res = aplicaDescuento(l,d);
		}else {
			res = aplicaIncremento(l, d);
		}
		
		return res;
		
	}
	
	public static double cambiaPrecio2(Libro l, double d, int i) {
		
		double res = 0.0;
		
		switch(i) {
		
		case 0:
			res = aplicaDescuento(l,d);
			break;
			
		default:
			res = aplicaIncremento(l,d);
		
		}
		
		return res;
		
	}
	
	public static boolean correctoPrecio(Libro l) {
		
		if(l.getPrecio() >= 0.0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static double corrigePrecio(Libro l) {
		
		double res = 0.0;
		
		if(l.getPrecio() <= 0.0) {
			l.setPrecio(Double.NaN); 
			res = l.getPrecio();
		}
		
		return res;
		
	}

}
