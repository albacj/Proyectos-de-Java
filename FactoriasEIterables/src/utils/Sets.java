package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import types.ListType;
import types.SetType;

public class Sets {

	// Ejercicio 3
	// Siguiendo la misma filosofía cree una factoría de conjuntos para
	// desacoplar el interface Set de las distintas clases que lo implementan
	// (HashSet, LinkedHashSet, TreeSet).
	
	public static <T> Set<T> create(SetType tipoSet) {
		
		switch(tipoSet) {
		case LINKED_HASHSET:
			return new LinkedHashSet<T>();
		case TREE_SET:
			return new TreeSet<T>();
		default: // HASH_SET
			return new HashSet<T>();
		}
		
	}
	
	public static <T> Set<T> create(SetType tipoSet, Collection<? extends T> c) {
		
		Set<T> res = Sets.create(tipoSet);
		res.addAll(c);
		return res;
		
	}
	
	public static <T> Set<T> create(SetType tipoSet, T array[]) {
		
		Set<T> res = Sets.create(tipoSet);
		
		for(int i = 0; i < array.length; i++) {
			res.add(array[i]);
		}
		
		return res;
		
	}
	
	
}
