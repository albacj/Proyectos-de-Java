package futbol;

public interface JugadorFutbol extends Persona{

	String getApodo();
	void setApodo(String apodo);
	
	Integer getDorsal();
	void setDorsal(Integer dorsal);
	
	String posicionJuego();
	void setPosicionJuego(String posicion);
	
}
