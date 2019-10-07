package javatest;

import prot.protected_1;

public class test_08_3_Call_protected extends protected_1 {

	
	public test_08_3_Call_protected(int num) {
		super(num);
	}
//	protected_1 에서 num 변수에 protected 선언을 해주었기 때문에 num에 접근 가능.
	public void init() {
		num = 3;
	}
	
	public static void main(String[] args) {
		test_08_3_Call_protected a = new test_08_3_Call_protected(10);
		a.getPlus();
		
		protected_1 test1 = new protected_1(12);
		
	}
}
