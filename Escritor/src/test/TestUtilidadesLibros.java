package test;

import librerias.tipos.*;
import utilidades.Nacionalidades;
import utilidades.UtilidadesLibros;

public class TestUtilidadesLibros extends Test {
	public static void main(String args[]) {
		// TODO: Descomente estas líneas
		Escritor e1 = new EscritorImpl("Miguel", "de Cervantes y Saavedra", Nacionalidades.SPANISH);
		Libro l1 = new LibroImpl("Don Quijote de La Mancha", e1, 1995, "ETSII");
		l1.setCopiasVendidas(14);
		l1.setPrecio(12.5);
		//
		Escritor e2 = new EscritorImpl("J. K.", "Rowling", Nacionalidades.BRITISH);
		Libro l2 = new LibroImpl("Harry Potter y el cáliz de fuego", e2, 2010, "Salamandra");
		l2.setCopiasVendidas(57653);
		l2.setPrecio(19.95);
		//
		Escritor e3 = new EscritorImpl("Gabriel", "García Márquez", Nacionalidades.OTHER);
		Libro l3 = new LibroImpl("Cien años de soledad", e3, 1999, "Mondadori");
		l2.setCopiasVendidas(57653);
		l2.setPrecio(19.95);
		l3.setCopiasVendidas(0);
		l3.setPrecio(-19.95);

		mostrar("-------------------------APARTADO A----------------------------------");
		
		mostrar(UtilidadesLibros.esBestSeller(l1));
		mostrar(UtilidadesLibros.esBestSeller(l2));
		mostrar(UtilidadesLibros.esBestSeller(l3));

		mostrar("-------------------------APARTADO B----------------------------------");
		
		mostrar(UtilidadesLibros.aplicaDescuento(l1, 0.1));
		mostrar(UtilidadesLibros.aplicaDescuento(l2, 0.1));

		mostrar("-------------------------APARTADO C----------------------------------");
		
		mostrar(UtilidadesLibros.aplicaIncremento(l1, 0.1));
		mostrar(UtilidadesLibros.aplicaIncremento(l2, 0.1));

		mostrar("-------------------------APARTADO D----------------------------------");
		
		mostrar(UtilidadesLibros.cambiaPrecio1(l1, 0.2, true));
		mostrar(UtilidadesLibros.cambiaPrecio1(l2, 0.3, false));

		mostrar("-------------------------APARTADO E----------------------------------");
		
		mostrar(UtilidadesLibros.cambiaPrecio2(l1, 0.4, 0));
		mostrar(UtilidadesLibros.cambiaPrecio2(l2, 0.5, 569));

		mostrar("-------------------------APARTADO F----------------------------------");
		
		mostrar(UtilidadesLibros.correctoPrecio(l1));
		mostrar(UtilidadesLibros.correctoPrecio(l3));

		mostrar("-------------------------APARTADO G----------------------------------");
		
		mostrar(UtilidadesLibros.corrigePrecio(l3));

	}
}
