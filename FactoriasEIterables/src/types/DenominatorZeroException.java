package types;

@SuppressWarnings("serial")
public class DenominatorZeroException extends RuntimeException {


	public DenominatorZeroException() {
		super();
	}

	public DenominatorZeroException(String s) {
		super(s);
	}
}
