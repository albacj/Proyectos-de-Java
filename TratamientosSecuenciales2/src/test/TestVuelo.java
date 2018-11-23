package test;

import java.util.ArrayList;
import java.util.List;

import vuelos.FechaImpl;
import vuelos.Persona;
import vuelos.PersonaImpl;
import vuelos.Vuelo;
import vuelos.VueloImpl;
import vuelos.Vuelos;

public class TestVuelo extends Test{

	public static void main(String[] args){
		
		//el método crearVuelos, se encuentra al final de esta clase. Échale un vistazo.
		List<Vuelo> vuelos=crearVuelos();

		mostrar("El primer vuelo (en orden de aparición) con destino a París");
		//ejercicio 1
		mostrar(Vuelos.primeroDestino1(vuelos, "Paris"));
		
		//======================================================================
		
		mostrar("\nEl primer vuelo (en orden cronológico) con destino a París");
		mostrar(Vuelos.primeroDestino2(vuelos, "Paris"));
		
		
		//======================================================================
		
		mostrar("\n¿Cuánto vale la suma de las recaudaciones de todos los vuelos que están completos?");
		mostrar(Vuelos.recaudacionCompletos(vuelos));


		//======================================================================
		
		mostrar("\nConstruye un List con los vuelos con destino Madrid"); 
		mostrar(Vuelos.seleccionaDestino(vuelos, "Madrid"));

		//======================================================================
		
		mostrar("\n¿Cuál es el vuelo con destino París con más plazas?"); 
		mostrar(Vuelos.masPlazasDestino(vuelos, "Paris"));


		//======================================================================
		
		mostrar("\n¿Cuál es el vuelo más barato de todos?");
		mostrar(Vuelos.masBarato(vuelos));

	
		//======================================================================
		
		mostrar("\n¿Cuántos vuelos hay a Bilbao que estén completos?");
		mostrar(Vuelos.completosDestino(vuelos, "Bilbao"));
		
		
		//======================================================================
		
		mostrar("\n¿Cuál es la recaudación de los vuelos a París?"); 
		mostrar(Vuelos.recaudacionDestino(vuelos, "Paris"));

		//======================================================================
		mostrar("\n¿Hay algún vuelo a Londres?");
		if(Vuelos.hayVueloPlazasLibres(vuelos, "Londres"))
			mostrar("sí hay vuelo a Londres");
		else
			mostrar("no hay vuelo a Londres");
		//======================================================================
		
		mostrar("\n¿Hay algún vuelo a Madrid con plazas libres?"); 
		if(Vuelos.hayVuelo(vuelos, "Madrid"))
			mostrar("sí hay vuelo a Madrid con plazas libres");
		else
			mostrar("no hay vuelo a Madrid con plazas libres");
		
		//======================================================================

	}

	private static List<Vuelo> crearVuelos() {
		mostrar("======== Creación de vuelos ========");
		List<Vuelo> vuelos=new ArrayList<Vuelo>();

		List<Persona>vPer1=new ArrayList<Persona>();
		Persona p1=new PersonaImpl("Nombre1v1","Ape1v1","DNI1v1",new FechaImpl(1,5,1985));
		Persona p2=new PersonaImpl("Nombre2v1","Ape2v1","DNI2v1",new FechaImpl(1,5,1985));
		Persona p3=new PersonaImpl("Nombre3v1","Ape3v1","DNI3v1",new FechaImpl(1,5,1985));
		vPer1.add(p1);vPer1.add(p2);vPer1.add(p3);
		Vuelo v1=new VueloImpl("Madrid",12.37,50,1,new FechaImpl(22,11,2009),vPer1);
		vuelos.add(v1);
		//---------------------------------------------
		List<Persona>vPer2=new ArrayList<Persona>();
		Persona p4=new PersonaImpl("Nombre1v2","Ape1v2","DNI1v2",new FechaImpl(1,5,1985));
		Persona p5=new PersonaImpl("Nombre2v2","Ape2v2","DNI2v2",new FechaImpl(1,5,1985));
		Persona p6=new PersonaImpl("Nombre3v2","Ape3v2","DNI3v2",new FechaImpl(1,5,1985));

		vPer2.add(p4);vPer2.add(p5);vPer2.add(p6);
		Vuelo v2=new VueloImpl("Barcelona",19.56,30,2,new FechaImpl(22,11,2009),vPer2);
		vuelos.add(v2);
		//-----------------------------------------------
		List<Persona>vPer3=new ArrayList<Persona>();
		Persona p7=new PersonaImpl("Nombre1v3","Ape1v3","DNI1v3",new FechaImpl(1,5,1985));
		Persona p8=new PersonaImpl("Nombre2v3","Ape2v3","DNI2v3",new FechaImpl(1,5,1985));
		Persona p9=new PersonaImpl("Nombre3v3","Ape3v3","DNI3v3",new FechaImpl(1,5,1985));

		vPer3.add(p7);vPer3.add(p8);vPer3.add(p9);
		//vuelo completo
		Vuelo v3=new VueloImpl("Valencia",20.01,3,3,new FechaImpl(22,11,2009),vPer3);
		vuelos.add(v3);
		//------------------------------------------
		List<Persona>vPer4=new ArrayList<Persona>();
		Persona p10=new PersonaImpl("Nombre1v4","Ape1v4","DNI1v4",new FechaImpl(1,5,1985));
		Persona p11=new PersonaImpl("Nombre2v4","Ape2v4","DNI2v4",new FechaImpl(1,5,1985));
		Persona p12=new PersonaImpl("Nombre3v4","Ape3v4","DNI3v4",new FechaImpl(1,5,1985));

		vPer4.add(p10);vPer4.add(p11);vPer4.add(p12);
		Vuelo v4=new VueloImpl("Paris",10.05,50,4,new FechaImpl(23,11,2009),vPer4);
		vuelos.add(v4);
		//------------------------------------------
		List<Persona>vPer5=new ArrayList<Persona>();
		Persona p13=new PersonaImpl("Nombre1v5","Ape1v5","DNI1v5",new FechaImpl(1,5,1985));
		Persona p14=new PersonaImpl("Nombre2v5","Ape2v5","DNI2v5",new FechaImpl(1,5,1985));
		Persona p15=new PersonaImpl("Nombre3v5","Ape3v5","DNI3v5",new FechaImpl(1,5,1985));

		vPer5.add(p13);vPer5.add(p14);vPer5.add(p15);
		Vuelo v5=new VueloImpl("Madrid",22.37,50,5,new FechaImpl(23,11,2009),vPer5);
		vuelos.add(v5);
		//------------------------------------------
		List<Persona>vPer6=new ArrayList<Persona>();
		Persona p16=new PersonaImpl("Nombre1v6","Ape1v6","DNI1v6",new FechaImpl(1,5,1985));
		Persona p17=new PersonaImpl("Nombre2v6","Ape2v6","DNI2v6",new FechaImpl(1,5,1985));
		Persona p18=new PersonaImpl("Nombre3v6","Ape3v6","DNI3v6",new FechaImpl(1,5,1985));
		//vuelo completo
		vPer6.add(p16);vPer6.add(p17);vPer6.add(p18);
		Vuelo v6=new VueloImpl("Bilbao",29.56,3,6,new FechaImpl(23,11,2009),vPer6);
		vuelos.add(v6);
		//------------------------------------------
		List<Persona>vPer7=new ArrayList<Persona>();
		Persona p19=new PersonaImpl("Nombre1v7","Ape1v7","DNI1v7",new FechaImpl(1,5,1985));
		Persona p20=new PersonaImpl("Nombre2v7","Ape2v7","DNI2v7",new FechaImpl(1,5,1985));
		Persona p21=new PersonaImpl("Nombre3v7","Ape3v7","DNI3v7",new FechaImpl(1,5,1985));

		vPer7.add(p19);vPer7.add(p20);vPer7.add(p21);
		Vuelo v7=new VueloImpl("Valencia",22.05,25,7,new FechaImpl(24,11,2009),vPer7);
		vuelos.add(v7);
		//------------------------------------------
		List<Persona>vPer8=new ArrayList<Persona>();
		Persona p22=new PersonaImpl("Nombre1v8","Ape1v8","DNI1v8",new FechaImpl(1,5,1985));
		Persona p23=new PersonaImpl("Nombre2v8","Ape2v8","DNI2v8",new FechaImpl(1,5,1985));
		Persona p24=new PersonaImpl("Nombre3v8","Ape3v8","DNI3v8",new FechaImpl(1,5,1985));

		vPer8.add(p22);vPer8.add(p23);vPer8.add(p24);
		Vuelo v8=new VueloImpl("Paris",70.05,40,8,new FechaImpl(24,11,2009),vPer8);
		vuelos.add(v8);
		//------------------------------------------
		List<Persona>vPer9=new ArrayList<Persona>();
		Persona p25=new PersonaImpl("Nombre1v9","Ape1v9","DNI1v9",new FechaImpl(1,5,1985));
		Persona p26=new PersonaImpl("Nombre2v9","Ape2v9","DNI2v9",new FechaImpl(1,5,1985));
		Persona p27=new PersonaImpl("Nombre3v9","Ape3v9","DNI3v9",new FechaImpl(1,5,1985));

		vPer9.add(p25);vPer9.add(p26);vPer9.add(p27);
		Vuelo v9=new VueloImpl("Madrid",32.37,50,9,new FechaImpl(24,11,2009),vPer9);
		vuelos.add(v9);
		//------------------------------------------
		List<Persona>vPer10=new ArrayList<Persona>();
		Persona p28=new PersonaImpl("Nombre1v10","Ape1v10","DNI1v10",new FechaImpl(1,5,1985));
		Persona p29=new PersonaImpl("Nombre2v10","Ape2v10","DNI2v10",new FechaImpl(1,5,1985));
		Persona p30=new PersonaImpl("Nombre3v10","Ape3v10","DNI3v10",new FechaImpl(1,5,1985));

		vPer10.add(p28);vPer10.add(p29);vPer10.add(p30);
		Vuelo v10=new VueloImpl("Barcelona",39.56,20,10,new FechaImpl(24,11,2009),vPer10);
		vuelos.add(v10);
		//------------------------------------------
		List<Persona>vPer11=new ArrayList<Persona>();
		Persona p31=new PersonaImpl("Nombre1v11","Ape1v11","DNI1v11",new FechaImpl(1,5,1985));
		Persona p32=new PersonaImpl("Nombre2v11","Ape2v11","DNI2v11",new FechaImpl(1,5,1985));
		Persona p33=new PersonaImpl("Nombre3v11","Ape3v11","DNI3v11",new FechaImpl(1,5,1985));

		vPer11.add(p31);vPer11.add(p32);vPer11.add(p33);
		Vuelo v11=new VueloImpl("Londres",28.40,10,11,new FechaImpl(25,11,2009),vPer11);
		vuelos.add(v11);
		//------------------------------------------
		List<Persona>vPer12=new ArrayList<Persona>();
		Persona p34=new PersonaImpl("Nombre1v12","Ape1v12","DNI1v12",new FechaImpl(1,5,1985));
		Persona p35=new PersonaImpl("Nombre2v12","Ape2v12","DNI2v12",new FechaImpl(1,5,1985));
		Persona p36=new PersonaImpl("Nombre3v12","Ape3v12","DNI3v12",new FechaImpl(1,5,1985));

		vPer12.add(p34);vPer12.add(p35);vPer12.add(p36);
		Vuelo v12=new VueloImpl("Paris",80.00,50,12,new FechaImpl(22,11,2009),vPer12);
		vuelos.add(v12);
		//------------------------------------------
		return vuelos;
	}

}
