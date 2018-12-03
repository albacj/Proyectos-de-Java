package test;

public class Test {
	public static <T> void mostrar(T objeto){
		System.out.println(objeto.toString());
	}

	public static <T> void mostrar(String s, T objeto){
		System.out.println(s + objeto.toString());
	}
}
