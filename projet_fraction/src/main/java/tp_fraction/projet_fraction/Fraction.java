package tp_fraction.projet_fraction;

public class  Fraction {
	private int num;
	private int denum;
	
	final public Fraction ZERO = new Fraction(0,1);
	final public Fraction UN = new Fraction(1,1);
	
	public Fraction() {
		this.num = 0;
		this.denum = 1;
	}
	
	public Fraction(int n, int d) {
		if (d == 0) throw new IllegalArgumentException("Denominateur egal a 0");
		this.num = n;
		this.denum = d;
	}
 
	public Fraction(int n) {
		 this.denum=1;
		 this.num=n;
	}
	
	public int getNum() {
		return num;
	}

	public int getDenum() {
		return denum;
	}

	public double getValue() {
		return (double)this.num / (double)this.denum;
	}
	
	public String toString() {
		return "numerateur"+num+"denominateur"+denum;
	}
	
}
