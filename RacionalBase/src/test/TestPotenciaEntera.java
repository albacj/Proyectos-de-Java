package test;

import potenciaEntera.*;

public class TestPotenciaEntera extends Test{

	public static void main(String[] args) {
		// Auto-generated method stub
		
		try {
			PotenciaEntera p = new PotenciaEnteraImpl(0,0);
			
		}catch(baseExponenteCeroException e) {
			e.printStackTrace();
			System.out.println("Excepción capturada");
			
		}

	}

}
