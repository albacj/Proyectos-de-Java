package resolucionPractica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tipos.Persona;

public class Personas {

	////////////////////////////////////////////////////////////////	
	public static Double masAlto(List<Persona> grupo){

		double altura = grupo.get(0).getEstatura();
		
		for(Persona p : grupo) {
			
			if(!(p.getEstatura() < altura)) {
				altura = p.getEstatura();
			}
			
		}
		
		return altura;
	}

	////////////////////////////////////////////////////////////////	
	public static Boolean todosMayoresQue(Set<Persona> grupo, Integer edad){
		
		boolean mayores = false;
		
		for(Persona p : grupo) {
			
			if(p.getEdad() < edad) {
				break;
			}else {
				mayores = true;
			}
			
		}
		
		return mayores;
	}

	////////////////////////////////////////////////////////////////
	public static Double edadMedia(Set<List<Persona>> red){
		
		double media = 0.0;
		
		for (Persona p : agrupaATodos(red)) {
			media = media + p.getEdad();
		}
		
		return media / agrupaATodos(red).size();
	}
	
	/** Método auxiliar para agrupar todos los set en uno solo */
	
	private static Set<Persona> agrupaATodos(Set<List<Persona>> red){
		
		Set<Persona> agrupadas = new HashSet<Persona>();
		
		for(List<Persona> lp : red) {
			agrupadas.addAll(lp);
		}
		
		return agrupadas;
		
	}
	
	////////////////////////////////////////////////////////////////	
	public static List<String> listadoDNI(Set<Persona> grupo){
		
		List<String> dnis = new ArrayList<String>();
		
		for(Persona p : grupo) {
			dnis.add(p.getDNI());
		}
		
		return dnis;
	}

}
