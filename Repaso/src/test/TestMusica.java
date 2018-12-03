package test;

import java.util.LinkedList;
import java.util.List;

import musica.Cancion;
import musica.CancionImpl;
import musica.Canciones;
import musica.ListaDeReproduccion;
import musica.ListaDeReproduccionImpl;

public class TestMusica extends Test {

	public static void main(String[] args) {

		// TODO Ejercicio 1 - Test
		Cancion c1 = new CancionImpl("5 sentidos", "Dvicio, Taburete", 3, 31, 2018, "pop");
		Cancion c2 = new CancionImpl("Viva la vida", "Coldplay", 4, 3, 2000, "pop");
		
		if (c1.compareTo(c2) > 0) {
			mostrar ("La canción c1 es mayor que c2");
		}else if(c1.compareTo(c2) == 0){
			mostrar ("La canción c1 es igual que c2");
		}else {
			mostrar ("La canción c1 es menor que c2");
		}
		
		mostrar ("Ejercicio 1\n===========");
		
		// TODO Ejercicio 2 - Test
		c1.setCalificacion(5);
		mostrar(c1.getCalificacion());
		
		mostrar ("\nEjercicio 2\n===========");

		// TODO Ejercicio 3 - Test
		mostrar ("\nEjercicio 3\n===========");
		ListaDeReproduccion playlist = inicializaListaDeReproduccion();
		
		mostrar ("Lista: ", playlist);
		mostrar("La calificación media de la lista es: " + ((ListaDeReproduccionImpl) playlist).duracionLista());
		mostrar("La calificación media de la lista es: " + ((ListaDeReproduccionImpl) playlist).calificacionLista());
		
		// TODO Ejercicio 4a) - Test
		mostrar ("\nEjercicio 4a)\n===========");
		
		// TODO Ejercicio 4b) - Test
		mostrar ("\nEjercicio 4b)\n===========");
		
		// TODO Ejercicio 4c) - Test
		mostrar ("\nEjercicio 4c)\n===========");
		
		// TODO Ejercicio 4d) - Test
		mostrar ("\nEjercicio 4d)\n===========");
		
		// TODO Ejercicio 4e) - Test
		mostrar ("\nEjercicio 4e)\n===========");
		
		// TODO Ejercicio 4f) - Test
		mostrar ("\nEjercicio 4f)\n===========");
		
		// TODO Ejercicio 4g) - Test
		mostrar ("\nEjercicio 4g)\n===========");
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
