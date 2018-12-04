package test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import comparators.*;
import tipos.*;

public class TestMusica extends Test {

	public static void main(String[] args) {

		ListaDeReproduccion playlist = inicializaListaDeReproduccion();
		List<Cancion> lista = playlist.getCanciones();
		
		// Pr14. Ejercicio 4a
		mostrar ("Inicializa lista de reproducción");
		Collections.sort(lista);
		mostrar(lista);
		
				
		// Pr14. Ejercicio 4b
		mostrar("Lista de canciones según criterio adicional basado en la fecha");
		Comparator<Cancion> cf = new ComparadorCancionPorAño();
		Collections.sort(lista, cf);
		mostrar(lista);
		
		
		mostrar("Lista de canciones según criterio adicional basado en la genero");
		Comparator<Cancion> cg = new ComparadorCancionPorGenero();
		Collections.sort(lista, cg);
		mostrar(lista);
		
		
		mostrar("Lista de canciones según criterio adicional basado en la duracion");
		Comparator<Cancion> cd = new ComparadorCancionPorDuracion();
		Collections.sort(lista, cd);
		mostrar(lista);
		
	}

	public static ListaDeReproduccion inicializaListaDeReproduccion (){

		List<Cancion> v = new LinkedList<Cancion>();
		Cancion c1 = new CancionImpl("Alejandro", "Lady Gaga", 4, 34, 2009, "pop");
		Cancion c2 = new CancionImpl("Mercy", "Duffy", 3, 39, 2008, "pop");
		Cancion c3 = new CancionImpl("Viva la Vida", "Coldplay", 4, 1, 2008, "pop");
		Cancion c4 = new CancionImpl("I Kissed a Girl", "Katy Perry", 2, 59, 2008, "pop");
		Cancion c5 = new CancionImpl("Loca", "Shakira", 3, 4, 2010, "latino");
		Cancion c6 = new CancionImpl("Need You Now", "Lady Antebellum", 3, 56, 2010, "country");
		Cancion c7 = new CancionImpl("Sonrisa", "Ana Torroja", 4, 19, 2010, "pop");
		Cancion c8 = new CancionImpl("Por Quererte", "Efecto Mariposa", 4, 14, 2009, "pop");
		Cancion c9 = new CancionImpl("Bad Day", "Daniel Powter", 3, 54, 2005, "rock");
		c1.setCalificacion(4);
		c2.setCalificacion(3);
		c3.setCalificacion(4);
		c4.setCalificacion(3);
		c5.setCalificacion(3);
		c6.setCalificacion(5);
		c7.setCalificacion(3);
		c8.setCalificacion(5);
		c9.setCalificacion(5);
		v.add(c1); v.add(c2); v.add(c3); v.add(c4); v.add(c5);
		v.add(c6); v.add(c7); v.add(c8); v.add(c9);

		ListaDeReproduccion a = new ListaDeReproduccionImpl("Mi lista");
		a.setCanciones(v);

		return a;
	}

}
