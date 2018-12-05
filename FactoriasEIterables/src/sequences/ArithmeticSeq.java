package sequences;

import java.util.Iterator;

public class ArithmeticSeq implements Iterable {

	protected Integer first;
	private Integer bound;
	protected Integer increment;

	@Override
	public Iterator iterator() {
		// Auto-generated method stub
		return new ArithmeticSeqIterator(first, bound, increment, null);
	}

	//TODO: Ejercicio 7. Implemente el iterable
	
	public ArithmeticSeq(Integer first, Integer bound, Integer increment) {
		this.first = first;
		this.bound = bound;
		this.increment = increment;
	}
	
	private Integer getBound() {
		return bound;
	}
	
	protected Integer getFirst() {
		return first;
	}
	
	private Integer getIncrement() {
		return increment;
	}
	
	private void setBound(Integer bound) {
		this.bound = bound;
	}
	
	private void setFirst(Integer first) {
		this.first = first;
	}
	
	private void setIncrement(Integer increment) {
		if(!increment.equals(0))
			this.increment = increment;
	}
	
	public String toString() {
		
		String s = "[" + first + ",";
		
		for(int i = 0; i < bound; i++) {
			Integer var = first + increment;
			s = s + var + ",";
			
			if(var == bound) {
				s = s + var + "]";
			}
			
		}
		
		return s;
	}

}
