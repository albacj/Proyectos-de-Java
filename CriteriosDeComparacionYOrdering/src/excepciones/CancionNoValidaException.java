package excepciones;

public class CancionNoValidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CancionNoValidaException() {
		super();
	}
	
	public CancionNoValidaException(String info) {
		super(info);
	}
}
