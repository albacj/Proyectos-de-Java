package test;

import racional.*;

public class TestRacional extends Test{

	public static void main(String[] args) {
		// Auto-generated method stub
		
		//Racional r1 = new RacionalImpl(564, 0);
		
		try {
			Racional r = new RacionalImpl(4,87);
			r.setDenominador(0);
			
		}catch(DenominadorCeroException e) {
			e.printStackTrace();
			System.out.println("Excepción capturada");
			
		}

	}

}
