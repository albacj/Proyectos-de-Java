package tipos;

public interface Fecha extends Comparable<Fecha> {
	Integer getDia();

	Integer getMes();

	Integer getAnyo();

	void setDia(Integer d);

	void setAnyo(Integer a);

	void setMes(Integer m);
	
	Integer totalDiasDesdeReferencia();
}
