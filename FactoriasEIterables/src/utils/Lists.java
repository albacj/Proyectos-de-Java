package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import types.ListType;

public class Lists {

	// a) Cree un m�todo est�tico create() que tome como par�metro una variable
	// de tipo ListType y vuelva un objeto de tipo List implementado con
	// ArrayList, LinkedList o Vector. Utilice una sentencia switch-case.
	// Ejercicio 1.a
	
	public static <T> List<T> create(ListType tipoLista) {
		
		switch(tipoLista) {
		case VECTOR_LIST:
			return new Vector<T>();
		case LINKED_LIST:
			return new LinkedList<T>();
		default: // ARRAY_LIST
			return new ArrayList<T>();
		}
		
	}
	
	// b) Cree otro m�todo est�tico create() que tome como par�metros, adem�s
	// del tipo de la lista, una colecci�n con los objetos que se quieren
	// insertar en la lista cuando �sta se crea. Tenga en cuenta que los objetos
	// de la colecci�n pueden ser de cualquier tipo.
	// Ejercicio 1.b
	
	public static <T> List<T> create(ListType tipoLista, Collection<? extends T> c) {
		
		List<T> res = (List<T>) Lists.create(tipoLista);
		res.addAll(c);
		return res;
		
	}
	
	// c) Otro m�todo est�tico create() que tome como par�metros, adem�s del
	// tipo de la lista, un array con los objetos que se quieren insertar en la
	// lista cuando �sta se crea. Tenga en cuenta que los objetos del array
	// pueden ser de cualquier tipo.
	// Ejercicio 1.c
	
	public static <T> List<T> create(ListType tipoLista, T array[]) {
		
		List<T> res = (List<T>) Lists.create(tipoLista);
		
		for(int i = 0; i < array.length; i++) {
			res.add(array[i]);
		}
		
		return res;
		
	}
}
