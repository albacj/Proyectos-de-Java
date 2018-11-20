package ejercicios;

import java.util.HashSet;
import java.util.Set;

import test.Test;

public class Ejercicio4 extends Test {
	private static Set<String> inglesYOtro = null;
	private static Set<String> alMenosDos = null;
	private static Set<String> soloUno = null;

	public static Set<String> apartadoA(Set<String> ingles, 
			Set<String> frances, Set<String> aleman) {
		// Superaron inglés y otro:
		// TODO
		inglesYOtro = new HashSet<String>();
		
		for(String cIngles : ingles) {
			if(frances.contains(cIngles) || aleman.contains(cIngles)) {
				inglesYOtro.add(cIngles);
			}
		}
		
		return inglesYOtro;
	}

	public static Set<String> apartadoB(Set<String> ingles,
			Set<String> frances, Set<String> aleman) {
		// Superaron al menos dos idiomas. Suponemos calculado inglesYOtro
		// TODO	
		alMenosDos = new HashSet<String>();
		
		for(String cIngles : ingles) {
			if(frances.contains(cIngles)) {
				alMenosDos.add(cIngles);
			}else if(aleman.contains(cIngles)) {
				alMenosDos.add(cIngles);
			}
		}
		
		for(String cFrances : frances) {
			if(aleman.contains(cFrances)) {
				alMenosDos.add(cFrances);
			}
		}
		
		return alMenosDos;
	}

	public static Set<String> apartadoC(Set<String> ingles,
			Set<String> frances, Set<String> aleman) {
		// Sólo dominan un idioma. Suponemos calculado alMenosDos
		// TODO
		soloUno = new HashSet<String>();
		
		for(String cIngles : ingles) {
			if (!frances.contains(cIngles) && !aleman.contains(cIngles)) {
				soloUno.add(cIngles);
			}
		}
		
		for(String cFrances : frances) {
			if(!aleman.contains(cFrances)) {
				soloUno.add(cFrances);
			}
		}
		
		return soloUno;
	}
}
