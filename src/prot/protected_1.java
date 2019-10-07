package prot;

public class protected_1 {
	protected int num;
	double PI = 3.14;

	public protected_1(int num) {
		super();
		this.num = num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	public double getPlus() {
		System.out.print("num + PI = "+ (num + PI));
		return num + PI;
	}

	
}
