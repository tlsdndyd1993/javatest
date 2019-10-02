package javatest;

public class test_04_3_LogicalOP {
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		
		boolean result;
		
		result = (1 < num1) && (num1 < 100);
		System.out.println("1초과 100 미만인가? : " + result);
		
		result = ((num1 += 10) > 0) && ((num2 += 10) > 0);
		System.out.println(result);
//		의도치 않은 결과를 얻을 수 있다. 왜냐하면 ((num1 += 10) > 0)부분이 false를 나타내서 뒤에있는
//		식을 연산하지 않고 넘어간다. 따라서 num2 += 10 을 연산하지 않는다.
	}
}
