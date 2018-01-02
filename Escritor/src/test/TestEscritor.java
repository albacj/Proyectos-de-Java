package test;

import librerias.tipos.*;
import utilidades.Nacionalidades;

public class TestEscritor extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escritor e1 = new EscritorImpl("Miguel", "de Cervantes y Saavedra", Nacionalidades.SPANISH);
		mostrar(e1);

	}

}
