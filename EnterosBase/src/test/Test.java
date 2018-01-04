package test;

public class Test {

	public static void mostrar(String s, Object o) {
		if(o==null)
			System.out.println("El objeto es nulo");
		else {
			mostrar(s);
			mostrar(o);
		}
	}

	public static void mostrar(String s) {
		if(s==null)
			System.out.print("Texto Nulo");
		else		
			System.out.print(s);
	}
	
	public static void mostrar(Object o) {
		if(o.getClass().isArray())
			mostrar((Object[]) o);
		else
			System.out.println(o.toString());
	}
	
	public static void mostrar(Object[] w) {
		int i=0;
		String s = "[";
		for(; i<w.length-1; i++)
			s+=w[i]+", ";
		s+=w[i]+"]";
		System.out.println(s);
	}
}
