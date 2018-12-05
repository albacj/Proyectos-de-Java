package sequences;

import java.util.Iterator;

public class ArithmeticSeqIterator extends ArithmeticSeq implements Iterator {
	
	private Integer current;

	public ArithmeticSeqIterator(Integer first, Integer bound, Integer increment, Integer current) {
		super(first, bound, increment);
		// Auto-generated constructor stub
		this.current = current;
	}
	
	public Integer getCurrent() {
		return getFirst();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Integer nextArithmetic() {
		if(current == first) {
			return first + increment;
		}else {
			return current + increment;
		}
	}

}
