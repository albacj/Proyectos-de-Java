package test;

import java.util.ArrayList;
import java.util.List;

import viajes.Crucero;
import viajes.CruceroImpl;

public abstract class TestCrucero extends Test {

	
	public static void main(String[] args) {
		List<String> ciudades = new ArrayList<String>();
		ciudades.add("Barcelona");ciudades.add("Marsella");ciudades.add("Savona");ciudades.add("Civitavecchia");
		ciudades.add("Palermo");ciudades.add("Túnez");ciudades.add("Palma de Mallorca");ciudades.add("Barcelona");
		Crucero c1 = new CruceroImpl("564j","CostaCruceros",200,ciudades,560.30,8,"Barcelona",true);
		
		mostrar("Crucero 1: " + c1);
		
		List<String> ciudades2 = new ArrayList<String>();
		ciudades2.add("Barcelona");ciudades2.add("Casablanca");ciudades2.add("Santa Cruz de Tenerife");ciudades2.add("Funchal");
		ciudades2.add("Malaga");ciudades2.add("Civitavecchia");ciudades2.add("Génova");ciudades2.add("Barcelona");
		Crucero c2 = new CruceroImpl("8915l","CruceroOnLine",120,ciudades2,845.23,7,"Barcelona",true);
		
		mostrar("Crucero 2: " + c2);
		
		Crucero c3 = (Crucero)c1.clone();
		c3.setMínimoDePersonas(20);
		c3.setPrecio(1300.0);
		
		mostrar("Crucero 3: " + c3);		
		
		
		
	}

}
