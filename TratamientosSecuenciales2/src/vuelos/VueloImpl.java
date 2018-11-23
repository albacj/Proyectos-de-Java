package vuelos;


import java.util.*;


public class VueloImpl implements Vuelo{
	
	private static final long serialVersionUID = 1L;
	private final String destino;
	private Double precio;
	private final Integer numPlazas;
	private List<Persona> pasajeros;
	private final Integer codigo;
	private Fecha fecha;
	


	public VueloImpl(String dest, double pre, int npl, int cod, Fecha f, List<Persona> vP){
		String msg="";
		if(npl<=0)
			msg+=" El número de plazas debe ser mayor que cero. ";
		if(vP.size()>npl || vP.size()<0)
			msg+=" El número de pasajeros debe estar comprendido entre cero y el número de plazas. ";
		if(cod<=0)
			msg+=" El código debe ser mayor que cero. ";
		if(f.getAnyo()<2000)
			msg+=" La fecha debe ser posterior al 1/1/2000";
		
		if(!msg.equals(""))
			throw new IllegalArgumentException(msg);
		
		destino=dest;
		precio=pre;
		numPlazas=npl;	
		pasajeros=vP;
		codigo=cod;
		fecha=f;
	}	
	
	public VueloImpl(){
		this.destino="";
		this.numPlazas = 100;
		this.codigo=0;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getDestino() {
		return destino;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public Integer getNumPasajeros() {
		return this.pasajeros.size();
	}
	
	public List<Persona> getPasajeros(){
		return this.pasajeros;
	}

	public Integer getNumPlazas() {
		return numPlazas;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double p){
		precio=p;
	}


	public String toString(){
		//return "(" + getCodigo() + "," + getDestino() + "," + getPrecio() + ")";
		return "\nVUELO: "+getCodigo()+" - Precio:"+getPrecio()+" \tnumPlazas:"+getNumPlazas()+" \tnumPlazasOcupadas:"+""+getNumPasajeros()+"\tDestino:"+getDestino() +"\tFecha:"+this.getFecha();
	}
	
	public boolean equals(Object o){
		boolean res = o instanceof Vuelo;
		if(res){
			Vuelo v = (Vuelo)o;
			res = getDestino().equals(v.getDestino()) && getCodigo()==v.getCodigo();
		}
			
		return res;
	}
	
	public int hashCode(){
		return getDestino().hashCode() + getCodigo().hashCode()*31;
	}
	
	public Vuelo clone(){
		Vuelo copia=null;
		try{
			copia = (Vuelo)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return copia;
	}

	public int compareTo(Vuelo v) {
		int res = getDestino().compareTo(v.getDestino());
		if(res==0)
			res = getCodigo() - v.getCodigo();
		
		return res;
	}
}
