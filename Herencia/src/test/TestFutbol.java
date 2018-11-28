package test;

import java.util.Vector;
import gui.Ventana;
import futbol.*;


public class TestFutbol extends Test{

	public static void main(String[] args) {
		
		/*
		 	Iker Casillas Iker Portero 1 
			Gerard Piqué Piqué "Defensa 3 
			Carles Puyol Puyol Defensa 5
			Joan Capdevila Capdevila Defensa 11
			Sergio Ramos Ramos Defensa 15 
			Sergio Busquets Busquets CentroCampista 16 
			Xavi Hernandez Xavi CentroCampista 8 
			Xabi Alonso  Xabi-Alonso CentroCampista 14 
			Andrés Iniesta Iniesta Delantero 6 
			Pedro Rodriguez Pedro Delantero 18 
			David Villa Villa Delantero 7
		 */
		
		//Futbolistas --------------------------------------------------------------------------------------
		//Crear jugadores 
		Persona p1 = new PersonaImpl("Iker", "Casillas");
		Persona p2 = new PersonaImpl("Gerard", "Piqué"); 
		Persona p3 = new PersonaImpl("Carles", "Puyol");
		Persona p4 = new PersonaImpl("Joan", "Capdevila");
		Persona p5 = new PersonaImpl("Sergio", "Ramos");
		Persona p6 = new PersonaImpl("Sergio", "Busquets");
		Persona p7 = new PersonaImpl("Xavi", "Hernandez"); 
		Persona p8 = new PersonaImpl("Xabi", "Alonso"); 
		Persona p9 = new PersonaImpl("Andrés", "Iniesta"); 
		Persona p10 = new PersonaImpl("Pedro", "Rodriguez"); 
		Persona p11 = new PersonaImpl("David", "Villa");
		
		mostrar(p1);
		mostrar(p2);
		mostrar(p3);
		mostrar(p4);
		mostrar(p5);
		mostrar(p6);
		mostrar(p7);
		mostrar(p8);
		mostrar(p9);
		mostrar(p10);
		mostrar(p11);
		
		JugadorFutbol j1 = new JugadorFutbolImpl("Iker", "Casillas", "Iker", "Portero", 1); 
		JugadorFutbol j2 = new JugadorFutbolImpl("Gerard", "Piqué", "Piqué", "Defensa", 3); 
		JugadorFutbol j3 = new JugadorFutbolImpl("Carles", "Puyol", "Puyol", "Defensa", 5);
		JugadorFutbol j4 = new JugadorFutbolImpl("Joan", "Capdevila", "Capdevila", "Defensa", 11);
		JugadorFutbol j5 = new JugadorFutbolImpl("Sergio", "Ramos", "Ramos", "Defensa", 15); 
		JugadorFutbol j6 = new JugadorFutbolImpl("Sergio", "Busquets", "Busquets", "CentroCampista", 16); 
		JugadorFutbol j7 = new JugadorFutbolImpl("Xavi", "Hernandez", "Xavi", "CentroCampista", 8); 
		JugadorFutbol j8 = new JugadorFutbolImpl("Xabi", "Alonso", "Xabi-Alonso", "CentroCampista", 14); 
		JugadorFutbol j9 = new JugadorFutbolImpl("Andrés", "Iniesta", "Iniesta", "Delantero", 6); 
		JugadorFutbol j10 = new JugadorFutbolImpl("Pedro", "Rodriguez", "Pedro", "Delantero", 18); 
		JugadorFutbol j11 = new JugadorFutbolImpl("David", "Villa", "Villa", "Delantero", 7);
		
		mostrar(j1);
		mostrar(j2);
		mostrar(j3);
		mostrar(j4);
		mostrar(j5);
		mostrar(j6);
		mostrar(j7);
		mostrar(j8);
		mostrar(j9);
		mostrar(j10);
		mostrar(j11);

		//Equipo España Final 2010 --------------------------------------------------------------------------------------
		
		Equipo<JugadorFutbol> e1 = new EquipoImpl<JugadorFutbol>("", Vector<JugadorFutbol>); // FIXME
		e1.anadeComponente(j1);
		e1.anadeComponente(j2);
		e1.anadeComponente(j3);
		e1.anadeComponente(j4);
		e1.anadeComponente(j5);
		e1.anadeComponente(j6);
		e1.anadeComponente(j7);
		e1.anadeComponente(j8);
		e1.anadeComponente(j9);
		e1.anadeComponente(j10);
		e1.anadeComponente(j11);
		
		mostrarTactica(e1.getComponentesDelEquipo(),"442","local");
					
	}
	
	public static void mostrarTactica(Vector<JugadorFutbol> e, String tactica, String loc){
		System.out.println("mostrarTactica");
		Ventana v = new Ventana(e, tactica, loc);
		v.editarVentana();
	}

}
