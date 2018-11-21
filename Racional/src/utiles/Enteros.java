package utiles;

public class Enteros {

	public static Integer mcd(Integer m, Integer n){
		if (m == 0 && n == 0) 
			throw new IllegalArgumentException("Enteros.mcd: m y n son cero");
		int u = Math.abs(m);
		int v = Math.abs(n);
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	public static int mcm(Integer a, Integer b){
		return a*b/Enteros.mcd(a,b);         
	}
		

	public static Boolean primosEntreSi(Integer n, Integer m) {
		if (n <= 0 || m <= 0) 
			throw new IllegalArgumentException("Número no natural");
		
		return (mcd(n, m) == 1);
	}

}
