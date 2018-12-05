package test;

public class Test {
	
	public static <T> void show(T objeto){
		System.out.println(objeto.toString());
	}

	public static <T> void show(String s, T objeto){
		System.out.println(s + objeto.toString());
	}
	
}
