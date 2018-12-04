package tipos;



public class FechaImpl implements Fecha {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	// los días en función de dicha fecha.
	
	private static final Fecha FECHA_INICIAL = new FechaImpl(1, 1, 1900);
	private Integer mes;
	private Integer dia;
	private Integer anyo;

	public FechaImpl(Integer dia, Integer mes, Integer anyo) {
		if (dia < 0 || dia > 31 || mes < 1 || mes > 12 || anyo < 0)
			throw new IllegalArgumentException();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public void setMes(Integer mes) {
		if (mes < 1 || mes > 12)
			throw new IllegalArgumentException();
		this.mes = mes;
	}

	public void setDia(Integer dia) {
		if (dia < 1 || dia > 31)
			throw new IllegalArgumentException();
		this.dia = dia;
	}

	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}

	public Integer getAnyo() {
		return anyo;
	}

	public Integer getDia() {
		return dia;
	}

	public Integer getMes() {
		return mes;
	}

	public Fecha clone() {
		Fecha clon = null;
		try {
			clon = (Fecha) super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return clon;
	}

	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof Fecha) {
			Fecha f = (Fecha) o;
			res = f.getAnyo().equals(getAnyo()) && f.getMes().equals(getMes())
					&& f.getDia().equals(getDia());
		}
		return res;
	}

	public int hashCode() {
		return getDia().hashCode() + getMes().hashCode() * 31
				+ getAnyo().hashCode() * 37;
	}

	public String toString() {
		return getDia() + "/" + getMes() + "/" + getAnyo();
	}

	public int compareTo(Fecha f) {
		int cmp = getAnyo().compareTo(f.getAnyo());
		if (cmp == 0) {
			cmp = getMes().compareTo(f.getMes());
			if (cmp == 0) {
				cmp = getDia().compareTo(f.getDia());
			}
		}
		return cmp;
	}

	
	// el objeto this y la fecha de referencia tomando como aproximación que un
	// año son 365 días y un mes 30 días. Si la fecha es menor que la constante
	// FECHA_INICIAL debe lanzar IllegalArgumentException.
	
	public Integer totalDiasDesdeReferencia() {
		if (FECHA_INICIAL.compareTo(this) > 0)
			throw new IllegalArgumentException(
					"Comparación de fecha anterior a la referencia: 1/1/1900");
		Integer diasDiferencia = getDia() - FECHA_INICIAL.getDia();
		diasDiferencia += (getMes() - FECHA_INICIAL.getMes()) * 30;
		diasDiferencia += (getAnyo() - FECHA_INICIAL.getAnyo()) * 365;
		return diasDiferencia;
	}
}
