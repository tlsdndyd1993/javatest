package javatest.extends_;

public class B extends A {

	public B() {
		super();
	}

	public B(int left, int right) {
		super(left, right);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
}
