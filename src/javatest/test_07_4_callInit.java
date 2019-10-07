package javatest;
import javatest.test_07_3_init;
public class test_07_4_callInit {
	public static void main(String[] args) {
		test_07_3_init f1 = new test_07_3_init();
		test_07_3_init f2 = new test_07_3_init();
		
		f1.incrCnt();
		f2.incrCnt();
		
		test_07_3_init.num++;
		
		System.out.println(test_07_3_init.num);
	}
}