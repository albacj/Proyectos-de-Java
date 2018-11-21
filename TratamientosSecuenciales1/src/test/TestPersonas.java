package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import resolucionPractica.Personas;
import tipos.Persona;
import tipos.PersonaImpl2;

public class TestPersonas extends Test {

	public static void main(String[] args) {
		
		mostrar("%%%%% Apartado a) %%%%%");
		compruebaApartado_a();
		
		mostrar("\n");
		mostrar("%%%%% Apartado b) %%%%%");
		compruebaApartado_b();

		mostrar("\n");
		mostrar("%%%%% Apartado c) %%%%%");
		compruebaApartado_c();
		
		mostrar("\n");
		mostrar("%%%%% Apartado d) %%%%%");
		compruebaApartado_d();
		
	}
	
	private static void compruebaApartado_a(){
		Persona p1 = new PersonaImpl2("Juan", "Garcia-Gil","57687980",19,1.85,'V');
		Persona p2 = new PersonaImpl2("Miguel", "Expósito-Gutierrez","23232355",20,1.70,'V');
		Persona p3 = new PersonaImpl2("Ana", "Oz-Nair","23232324",18,1.55,'F');
		
		List<Persona> l = new ArrayList<Persona>();
		l.add(p1);l.add(p2);l.add(p3);
		
		for(Persona e:l){
			mostrar(" -->"+e+": su altura es "+e.getEstatura());
		}
		mostrar("La persona más alta de la lista tiene altura = "+Personas.masAlto(l));
	}

	private static void compruebaApartado_b(){
		Persona p1 = new PersonaImpl2("Juan", "Garcia-Gil","57687980",19,1.85,'V');
		Persona p2 = new PersonaImpl2("Miguel", "Expósito-Gutierrez","23232355",20,1.70,'V');
		Persona p3 = new PersonaImpl2("Ana", "Oz-Nair","23232324",18,1.55,'F');
		
		Set<Persona> s = new HashSet<Persona>();
		s.add(p1);s.add(p2);s.add(p3);

		for(Persona e:s){
			mostrar(" -->"+e+": su edad es "+e.getEdad());
		}
		mostrar("¿Todos son mayores de 18 años? "+Personas.todosMayoresQue(s, 18));
	}
	
	private static void compruebaApartado_c(){
		Persona p1 = new PersonaImpl2("Juan", "Garcia-Gil","57687980",19,1.85,'V');
		Persona p2 = new PersonaImpl2("Miguel", "Expósito-Gutierrez","23232355",20,1.70,'V');
		Persona p3 = new PersonaImpl2("Ana", "Oz-Nair","23232324",18,1.55,'F');
		Persona p4 = new PersonaImpl2("Rocio", "Pérez Contreras","57432324",23,1.66,'F');
		Persona p5 = new PersonaImpl2("Ada", "Byron","45462324",25,1.59,'F');
		Persona p6 = new PersonaImpl2("Mª Luisa", "Sarte-Carcía","23452324",22,1.71,'F');
		
		List<Persona> l1 = new ArrayList<Persona>();
		l1.add(p1);l1.add(p2);
		List<Persona> l2 = new ArrayList<Persona>();
		l2.add(p3);l2.add(p4);l2.add(p5);
		List<Persona> l3 = new ArrayList<Persona>();
		l3.add(p6);	
	
		Set<List<Persona>> s = new HashSet<List<Persona>>();
		s.add(l1);s.add(l2);s.add(l3);
		
		for(Persona e: l1){
			mostrar("l1: edad de persona ---> "+e.getEdad());
		}
		for(Persona e: l2){
			mostrar("l2: edad de persona ---> "+e.getEdad());
		}
		for(Persona e: l3){
			mostrar("l3: edad de persona ---> "+e.getEdad());
		}
		
		mostrar("La edad media de las personas incluidas en el Set<List<Persona>> es: "+Personas.edadMedia(s));
	}

	private static void compruebaApartado_d(){
		Persona p1 = new PersonaImpl2("Juan", "Garcia-Gil","57687980",19,1.85,'V');
		Persona p2 = new PersonaImpl2("Miguel", "Expósito-Gutierrez","23232355",20,1.70,'V');
		Persona p3 = new PersonaImpl2("Ana", "Oz-Nair","23232324",18,1.55,'F');
		Set<Persona> s = new HashSet<Persona>();
		s.add(p1);s.add(p2);s.add(p3);
		for(Persona e:s){
			mostrar(" --->"+e);
		}
	
		mostrar("Listado de DNIs: "+Personas.listadoDNI(s));
	}
}
