package viajes;

import java.util.List;

public class ViajeImpl implements Viaje {
	
	private Integer calificacion;
	private List<String> ciudades;
	private String compañia;
	protected Integer minPersonas;
	private Double precio;
	private String id;
	
	public ViajeImpl(String id, String comp, Integer minP, List<String> l, Double p, Integer c){
		if(c<0 || c>10)
			throw new IllegalArgumentException("calificación no válida");
		if(p<0.0)
			throw new IllegalArgumentException("precio negativo");
		
		this.id = id;
		compañia = comp;
		minPersonas = minP;
		precio = p;
		calificacion = c;	
		ciudades = l;		
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public List<String> getCiudadesVisitadas() {
		return ciudades;
	}

	public String getCompañiaOperadora() {
		return compañia;
	}

	public String getIdentificador() {
		return id;
	}

	public Integer getMínimoDePersonas() {
		return minPersonas;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setCalificacion(Integer calif) {
		if(calif<0 || calif>10)
			throw new IllegalArgumentException("calificación no válida");
		calificacion = calif;
	}

	public void setCiudadesVisitadas(List<String> ciudades) {
		this.ciudades = ciudades;
	}

	public void setPrecio(Double precio) {
		if(precio<0.0)
			throw new IllegalArgumentException("precio negativo");
		this.precio = precio;		
	}
	
	public void añadeCiudad(String ciudad){
		ciudades.add(ciudad);
	}
	
	public void eliminaCiudad(String ciudad){
		ciudades.remove(ciudad);
	}
	
	public boolean equals(Object o){
		boolean res = false;
			if (o instanceof Viaje){
				Viaje v =(Viaje)o;
				res= getIdentificador().equals(v.getIdentificador())&& getPrecio().equals(v.getPrecio());
		}
		return res;
	}
	
	public String toString(){
		return "[" + getIdentificador() + ": " + getPrecio() +"]";
	}
	
	public int hashCode(){
		return getIdentificador().hashCode() + getPrecio().hashCode()*31;
	}

	public int compareTo(Viaje o) {
		int cmp = getIdentificador().compareTo(o.getIdentificador());
		if(cmp==0)
			cmp = getPrecio().compareTo(o.getPrecio());
		return cmp;
	}
	
	public Viaje clone(){
		Viaje copia = null;
		try{
			copia = (Viaje)super.clone();			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return copia;
	}

}
