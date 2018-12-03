package hora;

public interface Hora extends Comparable<Hora>{
	Integer getMinutos();
	Integer getSegundos();
	void setMinutos (Integer m);
	void setSegundos (Integer s);
	void suma (Hora h);
}
