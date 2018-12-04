package tipos;

import java.util.ArrayList;
import java.util.List;

public class Vuelos {

	public static Vuelo primeroDestino1(List<Vuelo> vuelos, String dst) {
		Vuelo vPrimero=null;
		for(Vuelo v:vuelos){
			if(v.getDestino().equals(dst)){
				vPrimero=v;
				break;
			}
		}
		return vPrimero;
	}

	public static Vuelo primeroDestino2(List<Vuelo> vuelos, String dst) {
		Vuelo vPrimero=null;
		for(Vuelo v:vuelos){
			if(v.getDestino().equals(dst)) {
				if(vPrimero==null)
					vPrimero=v;
				else if(v.getFecha().compareTo(vPrimero.getFecha())<0){
					vPrimero=v;
				}
			}
		}
		return vPrimero;
	}

	public static Double recaudacionCompletos(List<Vuelo> vuelos) {
		Double rec=0.0;
		for(Vuelo v:vuelos){
			if(v.getNumPasajeros().equals(v.getNumPlazas())){
				rec+=v.getPrecio()*v.getNumPasajeros();
			}
		}
		return rec;
	}

	public static List<Vuelo> seleccionaDestino(List<Vuelo> vuelos,String dst) {
		List<Vuelo>l=new ArrayList<Vuelo>();
		for(Vuelo v:vuelos){
			if(v.getDestino().equals(dst)){
				l.add(v);
			}
		}
		return l;
	}

	public static Vuelo masPlazasDestino(List<Vuelo> vuelos, String dst) {
		Vuelo max=null;
		for(Vuelo v:vuelos){
			if(v.getDestino().equals(dst)) {
				if(max==null)
					max=v;
				else if(v.getNumPlazas().compareTo(max.getNumPlazas())>0){
					max=v;
				}
			}
		}
		return max;
	}

	public static Vuelo masBarato(List<Vuelo> vuelos) {
		Vuelo minVuelo=null;
		for(Vuelo v:vuelos){
			if(minVuelo==null)
				minVuelo=v;
			else if(v.getPrecio().compareTo(minVuelo.getPrecio())<0){
				minVuelo=v;
			}
		}
		return minVuelo;
	}

	public static Integer completosDestino(List<Vuelo> vuelos, String dst) {
		Integer n=0;
		for(Vuelo v:vuelos){
			if(v.getDestino().equals(dst) && v.getNumPasajeros().equals(v.getNumPlazas())){
				n++;
			}
		}
		return n;
	}

	public static Double recaudacionDestino(List<Vuelo> vuelos, String dst) {
		Double rec=0.0;
		for(Vuelo v:vuelos){
			if(v.getDestino().equals("Paris")){
				rec+=v.getPrecio()*v.getNumPasajeros();
			}
		}
		return rec;
	}

	public static boolean hayVueloPlazasLibres(List<Vuelo>vuelos, String nom) {
		Boolean hay=false;
		for(Vuelo v:vuelos){
			if(v.getDestino().equals(nom) && hayPlazas(v)){
				hay=true;
				break;
			}
		}
		return hay;
	}

	private static boolean hayPlazas(Vuelo v) {
		return v.getNumPlazas().compareTo(v.getNumPasajeros())>0;
	}

	public static boolean hayVuelo(List<Vuelo>vuelos, String nom) {
		Boolean hay=false;
		for(Vuelo v:vuelos){
			if(v.getDestino().equals(nom)){
				hay=true;
				break;
			}
		}
		return hay;
	}


}
