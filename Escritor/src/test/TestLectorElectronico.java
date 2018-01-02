package test;

import librerias.tipos.*;
import utilidades.Nacionalidades;

public class TestLectorElectronico extends Test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO: Descomente estas líneas
		
		Escritor e1 = new EscritorImpl("Miguel", "de Cervantes y Saavedra", Nacionalidades.SPANISH);
		 
		Libro l1 = new LibroImpl("Don Quijote de La Mancha", e1, 1995, "ETSII");
		 
		l1.setCopiasVendidas(14);
		l1.setPrecio(12.5);
		
		LectorElectronico lec = new LectorElectronicoImpl("LE1", "Visor", l1);
		mostrar(lec);
	}

}
