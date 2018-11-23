package test;

import librerias.tipos.*;
import utilidades.Nacionalidades;

public class TestLibro extends Test{

	public static void main(String[] args) {
		// Auto-generated method stub
		
		Escritor e1 = new EscritorImpl("Miguel", "de Cervantes y Saavedra", Nacionalidades.SPANISH);
		Libro l1 = new LibroImpl("Don Quijote de La Mancha", e1, 2010, "ETSII");
		
		l1.setPrecio(12.50);
		l1.setCopiasVendidas(14);
		
		mostrar(l1);
		mostrar(l1.getPrecio());
		mostrar(l1.getCopiasVendidas());
		mostrar(l1.getRecaudacion());
		
	}

}
