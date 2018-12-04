package tipos;

import interfaces.Copiable;

public interface Hora extends Copiable<Hora>, Comparable<Hora>{
	Integer getMinutos();
	Integer getSegundos();
	void setMinutos (Integer m);
	void setSegundos (Integer s);
	void suma (Hora h);
}
