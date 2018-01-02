package persona;

import java.util.List;

public interface Alumno {
	
	Integer getIngreso();
	void setIngreso(Integer ingreso);
	
	Integer getCursoMasAlto();
	void setCursoMasAlto(Integer cursoMasAlto);
	
	List<Double> getNotas();
	void setNotas(List<Double> notas);
	
	Double getNotaMedia();
	void setNotaMedia(Double notaMedia);

}
