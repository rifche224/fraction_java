package tp_fraction.projet_fraction;

public class  Fraction {
	private int num;
	private int denum;
	
	public Fraction(int n, int d) {
		this.num = n;
		this.denum = d;
	}
 
	public void fraction_initial(int n) {
		 this.denum=1;
		 this.num=n;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDenum() {
		return denum;
	}

	public void setDenum(int denum) {
		this.denum = denum;
	}

	
	
}
