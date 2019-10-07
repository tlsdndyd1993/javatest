package javatest.extends_;

public class C extends B{
	public static void main(String[] args) {
		B b1 = new B(13, 153);
		b1.sum();	//A
		b1.avg();	//A
		b1.substract();		//B
	}
}
