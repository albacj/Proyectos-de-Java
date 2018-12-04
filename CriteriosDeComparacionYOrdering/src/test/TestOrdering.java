package test;

import java.util.ArrayList;
import java.util.List;
import tipos.Cancion;
import tipos.CancionImpl;
import tipos.ListaDeReproduccion;
import util.Canciones;

public class TestOrdering extends Test{

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListaDeReproduccion playlist = TestMusica.inicializaListaDeReproduccion();
		List<Cancion> listaCanciones  = playlist.getCanciones();
		mostrar("lista original:\n"+listaCanciones);
				
		
		// TODO Pr14. Ejercicio 6a
		mostrar("----- 6a:");
		
		
		
		// TODO Pr14. Ejercicio 6b
		mostrar("----- 6b:");
		
		
		
		// TODO Pr14. Ejercicio 6c
		mostrar("----- 6c:");
		
		
		
		// TODO Pr14. Ejercicio 6d
		mostrar("----- 6d:");
			
						
		
		
		//--------------------------------------------------------------------
		// Tratamiento de iterables que contienen elementos null
		//--------------------------------------------------------------------
		List<Cancion> listaCancionesConNulo = new ArrayList<Cancion> (listaCanciones);
		listaCancionesConNulo.add(null);
		listaCancionesConNulo.add(null);
		
		
		// TODO Pr14. Ejercicio 6e
		mostrar("----- 6e:");


		
		// TODO Pr14. Ejercicio 6f
		mostrar("----- 6f:");


		
		
	}

}
