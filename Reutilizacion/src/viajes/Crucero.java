package viajes;

public interface Crucero extends Viaje{
	
	String getPuerto();
	boolean getTodoIncluido();
	void setTodoIncluido(boolean ti);
	Integer getMinimoPersonas();
	void setM�nimoDePersonas(Integer minPersonas);
	double getImpuestoPortuario();
	void setImpuestoPortuario(double impuestoPortuario);
	int compareTo(Crucero o);

}
