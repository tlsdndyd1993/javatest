package javatest;

public class test_08_1_Circle_get_set {
	private double rad;
	final double PI = 3.14;

	public test_08_1_Circle_get_set(double rad) {
		super();
		setRad(rad);
	}

	public void setRad(double rad) {
		if (rad <= 0) {
			this.rad = 0;
		}
		this.rad = rad;
	}
	
	public double getRad() {
		return rad;
	}

	
	public double getArea() {
		return (rad * rad)* PI;
	}
	
}
