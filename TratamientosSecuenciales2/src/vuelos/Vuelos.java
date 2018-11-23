package vuelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vuelos {

	public static Vuelo primeroDestino1(List<Vuelo> vuelos, String dst) {
		Vuelo primeroADestino = new VueloImpl();
		
		for(Vuelo v : vuelos) {
			if(v.getDestino() == dst) {
				primeroADestino = v;
				break;
			}
		}
		
		return primeroADestino;
	}

	public static Vuelo primeroDestino2(List<Vuelo> vuelos, String dst) {
		//apartado 2.a
		Vuelo primeroADestinoOrden = new VueloImpl();
		
		Collections.sort(vuelos, (v1, v2) -> v1.getFecha().compareTo(v2.getFecha()));
		
		for(Vuelo v : vuelos) {
			if(v.getDestino() == dst) {
				primeroADestinoOrden = v;
				break;
			}
		}
		
		return primeroADestinoOrden;
	}

	public static Double recaudacionCompletos(List<Vuelo> vuelos) {
		//apartado 2.b
		Double recaudacion = 0.0;
		Double aux = 0.0;
		
		for(Vuelo v : vuelos) {
			
			if(v.getNumPasajeros() == v.getNumPlazas()) {
				aux = aux + (v.getPrecio() * v.getNumPasajeros());
			}
			
		}
		
		recaudacion = aux;
		return recaudacion;
	}

	public static List<Vuelo> seleccionaDestino(List<Vuelo> vuelos,String dst) {
		//apartado 2.c
		List<Vuelo> vuelosADestino = new ArrayList<Vuelo>();
		
		for(Vuelo v : vuelos) {
			
			if(v.getDestino() == dst) {
				vuelosADestino.add(v);
			}
			
		}
		
		return vuelosADestino;
	}

	public static Vuelo masPlazasDestino(List<Vuelo> vuelos, String dst) {
		//apartado 2.d
		Vuelo vueloMasPasajeros = new VueloImpl();
		List<Vuelo> vuelosADestino = new ArrayList<>();
		
		for(Vuelo v : vuelos) {
			
			if(v.getDestino() == dst) {
				vuelosADestino.add(v);
			}
			
		}
		
		Collections.sort(vuelosADestino, (v1, v2) -> v1.getNumPasajeros().compareTo(v2.getNumPasajeros()));
		
		vueloMasPasajeros = vuelosADestino.get(vuelosADestino.size()-1);
		
		return vueloMasPasajeros;
	}

	public static Vuelo masBarato(List<Vuelo> vuelos) {
		//apartado 2.e
		Collections.sort(vuelos, (v1, v2) -> v1.getPrecio().compareTo(v2.getPrecio()));
		return vuelos.get(0);
	}

	public static Integer completosDestino(List<Vuelo> vuelos, String dst) {
		//TODO apartado 2.f
		return null;
	}

	public static Double recaudacionDestino(List<Vuelo> vuelos, String dst) {
		//TODO apartado 2.g
		return null;
	}

	public static Boolean hayVueloPlazasLibres(List<Vuelo>vuelos, String nom) {
		//TODO apartado 2.h
		return null;
	}

	private static Boolean hayPlazas(Vuelo v) {
		//TODO apartado 2.h
		return null;
	}

	public static Boolean hayVuelo(List<Vuelo>vuelos, String nom) {
		//TODO apartado 2.i
		return null;
	}


}
