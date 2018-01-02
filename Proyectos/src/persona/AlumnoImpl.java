package persona;

import java.util.List;

public class AlumnoImpl extends PersonaImpl implements Alumno {
	
	private Integer ingreso;
	private Integer cursoMasAlto;
	private List<Double> notas;
	private Double notaMedia;

	public AlumnoImpl(Integer ingreso, Integer cursoMasAlto, List<Double> notas, Double notaMedia) {
		// TODO Auto-generated constructor stub
		super(dni, nombre, apellidos, edad, altura, sexo);
		
		this.ingreso = ingreso;
		this.cursoMasAlto = cursoMasAlto;
		this.notas = notas;
		this.notaMedia = notaMedia;
	}

	@Override
	public Integer getIngreso() {
		// TODO Auto-generated method stub
		return ingreso;
	}

	@Override
	public void setIngreso(Integer ingreso) {
		// TODO Auto-generated method stub
		this.ingreso = ingreso;

	}

	@Override
	public Integer getCursoMasAlto() {
		// TODO Auto-generated method stub
		return cursoMasAlto;
	}

	@Override
	public void setCursoMasAlto(Integer cursoMasAlto) {
		// TODO Auto-generated method stub
		this.cursoMasAlto = cursoMasAlto;

	}

	@Override
	public List<Double> getNotas() {
		// TODO Auto-generated method stub
		return notas;
	}

	@Override
	public void setNotas(List<Double> notas) {
		// TODO Auto-generated method stub
		this.notas = notas;

	}


	@Override
	public Double getNotaMedia() {
		// TODO Auto-generated method stub
		return calculaMedia(notas);
	}

	private Double calculaMedia(List<Double> notas) {
		// TODO Auto-generated method stub
		Double media = 0.0;
		Double suma = 0.0;
		
		for(Double d: notas) {
			suma = suma + d;
		}
		
		media = suma / notas.size();
		
		return media;
	}

	@Override
	public void setNotaMedia(Double notaMedia) {
		// TODO Auto-generated method stub
		this.notaMedia = notaMedia;

	}



}
