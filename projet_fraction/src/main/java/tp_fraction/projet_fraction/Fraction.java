package tp_fraction.projet_fraction;

public class  Fraction {
	private int num;
	private int denum;
	
	public Fraction(int n, int d) {
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

	

	
	
}
