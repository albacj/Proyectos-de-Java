package test;
import java.util.Arrays;

public class Test {
	public static void mostrar(String s, Object p) {
		System.out.println(s + p);
	}

	public static void mostrar(Object p) {
		System.out.println("El objeto es: " + p);
	}
	
	public static <T> void  mostrar(String s, T []p){
		System.out.println(s + Arrays.toString(p));
	}

	public static void mostrar(String p) {
		System.out.println(p);
	}
}
