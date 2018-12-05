package types;

import utils.Integers;

public class RacionalImpl implements Racional {
	private Integer num;
	private Integer den;

	// Construye un racional con valor 1/1
	public RacionalImpl() {
		num = 1;
		den = 1;
	}

	// Construye un racional con denominador 1
	public RacionalImpl(Integer a) {
		num = a;
		den = 1;
	}

	// Construye un racional desde una cadena
	public RacionalImpl(String s) {
		//TODO: Ejercicio 10.b
	}

	public RacionalImpl(Integer a, Integer b) {
		if (b == 0) {
			throw new DenominatorZeroException(
					"Constructor: Denominador igual a 0 en Racional");
		}

		if (b < 0) {
			num = -a;
			den = -b;
		} else {
			num = a;
			den = b;
		}
		simplifica();
	}

	public Integer getNumerador() {
		return num;
	}

	public Integer getDenominador() {
		return den;
	}

	public void setNumerador(Integer a) {
		num = a;
		simplifica();
	}

	public void setDenominador(Integer a) {
		if (a == 0) {
			throw new DenominatorZeroException(
					"SetDenominador: Denominador igual a 0 en Racional");
		}
		den = a;
		if (den < 0) {
			num = -num;
			den = -den;
		}
		simplifica();
	}

	public String toString() {
		String s;
		if (den == 1) {
			s = getNumerador() + "";
		} else {
			s = getNumerador() + "/" + getDenominador();
		}
		return s;
	}

	public Racional multiplica(Racional a) {
		Integer n = getNumerador() * a.getNumerador();
		Integer d = getDenominador() * a.getDenominador();

		Racional r = new RacionalImpl(n, d);
		r.simplifica();
		return r;
	}

	public void simplifica() {
		int mcd = Integers.gcd(num, den);
		if (mcd != 1) {
			num = getNumerador() / mcd;
			den = getDenominador() / mcd;
		}
	}

	public Racional suma(Racional a) {
		int mcm = Integers.lcm(getDenominador(), a.getDenominador());
		Integer n = getNumerador() * mcm / getDenominador() + a.getNumerador()
				* mcm / a.getDenominador();
		Racional r = new RacionalImpl(n, mcm);
		r.simplifica();
		return r;
	}

	public Racional clone() {
		Racional copia = null;
		try {
			copia = (Racional) super.clone();
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		return copia;
	}

	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof Racional) {
			Racional r = (Racional) o;
			Integer p1 = this.getNumerador() * r.getDenominador();
			Integer p2 = this.getDenominador() * r.getNumerador();
			res = p1.equals(p2);
		}
		return res;
	}

	public int compareTo(Racional o) {
		Integer p1 = this.getNumerador() * o.getDenominador();
		Integer p2 = this.getDenominador() * o.getNumerador();
		return p1.compareTo(p2);

	}

	public int hashCode() {
		return getNumerador().hashCode() + 31 * getDenominador().hashCode();
	}
}