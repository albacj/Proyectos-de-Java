package tipos;

public class HoraImpl implements Hora {

	private static final long serialVersionUID = 1L;
	private Integer minutos;
	private Integer segundos;
	
	public HoraImpl(Integer min, Integer seg){
		minutos = min;
		segundos = seg;
	}
	
	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setMinutos(Integer m) {
		minutos = m;
	}

	public void setSegundos(Integer s) {
		segundos = s;
	}

	public int compareTo(Hora h) {
		int res = 0;
		res = getMinutos().compareTo(h.getMinutos());
		if (res == 0){
			res = getSegundos().compareTo(h.getSegundos());
		}
		return res;
	}

	public Hora clone(){
		Hora copia=null;
		try{
			copia=(Hora)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return copia;
	}

	public boolean equals(Object o){
		boolean res = false;
		if (o instanceof Hora){
			Hora h = (Hora) o;
			res = getMinutos().equals(h.getMinutos()) &&
			   getSegundos().equals(h.getSegundos());
		}
		return res;
	}

	public int hashCode(){
		return getMinutos().hashCode() + getSegundos().hashCode()*31;
	}
	
	public String toString(){
		String res = getMinutos() + ":";
		if (getSegundos()<10){
			res += "0";
		}
		res += getSegundos();
		return res;
	}

	public void suma (Hora h){
		Integer min = getMinutos() + h.getMinutos();
		Integer seg = getSegundos() + h.getSegundos();
		setSegundos(seg%60);
		setMinutos(min+seg/60);
	}

}
