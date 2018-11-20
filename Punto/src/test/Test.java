package test;

public class Test {
	
//	public static void mostrar(String s, Object p){
//		
//		System.out.println(s+p);
//		
//	}
	
	public static <T> void mostrar(T o){
		System.out.println(o);
	}

	public static <T> void mostrar(String s, T o){
		System.out.println(s + o);
	}

}
