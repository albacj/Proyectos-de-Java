package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import test.Test;

public class Ejercicio3 extends Test {

	public static Set<String> apartadoA(Set<String> g1, Set<String> g2) {
		// Repetidores:
		// TODO
		Set<String> repetidores = new HashSet<String>();
		
		for(String alumno : g1) {
			if(g2.contains(alumno)) {
				repetidores.add(alumno);
			}
		}
		
		return repetidores;
	}

	public static List<String> apartadoB(Set<String> g1, Set<String> g2) {
		// Todos:
		// TODO
		List<String> todos = new ArrayList<String>();
		todos.addAll(g1);
		
		for(String alumno : g2) {
			if(!todos.contains(alumno)) {
				todos.add(alumno);
			}
		}
		
		return todos;
	}

	public static Set<String> apartadoC(Set<String> g1, Set<String> g2) {
		// Nuevos:
		// TODO
		Set<String> nuevos = new HashSet<String>();
		nuevos.addAll(g1);
		
		for(String alumno : g1) {
			if(g2.contains(alumno)) {
				nuevos.remove(alumno);
			}
		}
		
		return nuevos;
	}
}
