package viajes;

import java.util.List;

public class CruceroImpl implements Crucero{
	
	private String id;
	private String compañia;
	private String puerto;
	private boolean ti;
	private double impuestoPortuario;
	private Integer minPersonas;
	private List<String> ciudades;
	private double precio;
	private Integer calificacion;

	public CruceroImpl(String identificador, String compañia, int minPersonas, List<String> ciudades, double precio, int calificacion, 
			String puerto, boolean ti) {
		super();
		this.puerto = puerto;
		this.ti = ti;
		this.impuestoPortuario = impuestoPortuario;
	}

	@Override
	public String getIdentificador() {
		// Auto-generated method stub
		return id;
	}

	@Override
	public String getCompañiaOperadora() {
		// Auto-generated method stub
		return compañia;
	}

	@Override
	public Integer getMínimoDePersonas() {
		// Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getCiudadesVisitadas() {
		// Auto-generated method stub
		return ciudades;
	}

	@Override
	public void setCiudadesVisitadas(List<String> ciudades) {
		// Auto-generated method stub
		this.ciudades = ciudades;
	}

	@Override
	public Double getPrecio() {
		// Auto-generated method stub
		if(0 <= precio) {
			precio = precio;
		}
		return precio + impuestoPortuario;
	}

	@Override
	public void setPrecio(Double precio) {
		// Auto-generated method stub
		this.precio = precio;
	}

	@Override
	public Integer getCalificacion() {
		// Auto-generated method stub
		if(0 <= calificacion && calificacion <= 10) {
			calificacion = calificacion;
		}
		return calificacion;
		
	}

	@Override
	public void setCalificacion(Integer calif) {
		// Auto-generated method stub
		calificacion = calif;
	}

	@Override
	public void añadeCiudad(String ciudad) {
		// Auto-generated method stub
		ciudades.add(ciudad);
	}

	@Override
	public void eliminaCiudad(String ciudad) {
		// Auto-generated method stub
		ciudades.remove(ciudad);
	}

	@Override
	public Crucero clone() {
		// Auto-generated method stub
		Crucero copia = null;
		try{
			copia = (Crucero)super.clone();			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return copia;
	}

	@Override
	public int compareTo(Crucero o) {
		// Auto-generated method stub
		int cmp = getIdentificador().compareTo(o.getIdentificador());
		if(cmp==0)
			cmp = getPrecio().compareTo(o.getPrecio());
		return cmp;
	}

	@Override
	public String getPuerto() {
		// Auto-generated method stub
		return puerto;
	}

	@Override
	public boolean getTodoIncluido() {
		// Auto-generated method stub
		return ti;
	}

	@Override
	public void setTodoIncluido(boolean ti) {
		// Auto-generated method stub
		this.ti = ti;
	}

	@Override
	public void setMínimoDePersonas(Integer minPersonas) {
		// Auto-generated method stub
		this.minPersonas = minPersonas;
	}

	@Override
	public double getImpuestoPortuario() {
		// Auto-generated method stub
		return 0.0;
	}

	@Override
	public void setImpuestoPortuario(double impuestoPortuario) {
		// Auto-generated method stub
		this.impuestoPortuario = impuestoPortuario;
	}

	public String toString() {
		return "[" + id + ", " + precio + "] - " + ciudades; 
	}

	@Override
	public int compareTo(Viaje o) {
		// Auto-generated method stub
		int cmp = getIdentificador().compareTo(o.getIdentificador());
		if(cmp==0)
			cmp = getPrecio().compareTo(o.getPrecio());
		return cmp;
	}

	@Override
	public Integer getMinimoPersonas() {
		// Auto-generated method stub
		if(minPersonas >= 0) {
			minPersonas = minPersonas;
		}
		return minPersonas;
	}
	
}
