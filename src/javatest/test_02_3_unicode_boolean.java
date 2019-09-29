package javatest;

public class test_02_3_unicode_boolean {
	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736;
		char ch4 = 54869;
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
	}
}
