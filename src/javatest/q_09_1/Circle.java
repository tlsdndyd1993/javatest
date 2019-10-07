package javatest.q_09_1;
import javatest.q_09_1.Point;
public class Circle extends Point{
	
	double r;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		setR(r);
	}
	
	public double getR() {
		System.out.println("반지름은 "+ r + "입니다.");
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}
