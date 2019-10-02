package javatest;

public class test_03_2_integerLiterals {
	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 0123;
		int num3 = 0x123;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
//		System.out.println(14512341234 + 132512341235);
		System.out.println(12341235233L + 13241324132L);
		
		byte seven = 0B111;
		System.out.println(seven);
		int num = 100_000_000;
		System.out.println(num);
		
		System.out.println(3.0004999f + 2.0004999f );
	}
}
