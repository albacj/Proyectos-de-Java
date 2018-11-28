package futbol;

import java.util.Vector;

public class EquipoImpl<T> implements Equipo<T>{
	
	private String nombreEquipo;
	private Vector<T> componentesDelEquipo;
	
	public EquipoImpl(String nom, Vector<T> componentes){
		this.nombreEquipo = nom;
		this.componentesDelEquipo = componentes;
	}

	@Override
	public String getNombre() {
		// Auto-generated method stub
		return nombreEquipo;
	}

	@Override
	public void setNombre(String nombreEquipo) {
		// Auto-generated method stub
		this.nombreEquipo = nombreEquipo;
	}

	@Override
	public Vector<T> getComponentesDelEquipo() {
		// Auto-generated method stub
		return componentesDelEquipo;
	}

	@Override
	public void setComponentesDelEquipo(Vector<T> componentesDelEquipo) {
		// Auto-generated method stub
		this.componentesDelEquipo = componentesDelEquipo;
	}
	
	public void anadeComponente(T componente) {
		componentesDelEquipo.addElement(componente);
	}
	
	public T getComponente(Integer pos) {
		return componentesDelEquipo.get(pos);
	}
	
	public String toString() {
		
		String representacion = "";
		
		for(T comp: componentesDelEquipo) {
			representacion = representacion + comp + ", ";
			
			if(componentesDelEquipo.get(-1) == comp) {
				representacion = representacion + comp;
			}
			
		}
		
		return representacion;
	}

}
