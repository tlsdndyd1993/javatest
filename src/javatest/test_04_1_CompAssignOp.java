package javatest;

public class test_04_1_CompAssignOp {
	public static void main(String[] args) {
		System.out.println(7/3);
		System.out.println(7%3);
		
		short num = 10;
		num = (short)(num + 77L);
		int rate = 3;
		rate = (int)(rate * 3.5);
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;
		rate = 3;
		rate *= 3.5;
		System.out.println(num);
		System.out.println(rate);		
	}
}
