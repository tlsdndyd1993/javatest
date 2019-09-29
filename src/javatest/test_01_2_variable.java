package javatest;

public class test_01_2_variable {
	public static void main(String[] args) {
		
		int num1;
		num1 = 10;
		
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num1 + " + " +  num2 + " = " + num3);
		
		
//		실수를 표현하는데 오차가 발생한다.
//		자바의 문제가 아니라 컴퓨터의 한계
		
		double num4, num5;
		double result;
		num4 = 1.000000001;
		num5 = 2.000000002;
		result = num4 + num5;
		System.out.println(result);
		
	}
}
