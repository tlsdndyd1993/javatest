package javatest;
import javatest.test_07_1_;

public class test_07_2_call {

	
	public static void main(String[] args) {
		test_07_1_ sinwooyong = new test_07_1_();
		test_07_1_ bro = new test_07_1_();
		sinwooyong.deposit(80000);
		sinwooyong.withdraw(2000);
		sinwooyong.checkMybalance();
		bro.deposit(20000);
		bro.withdraw(200);
		bro.checkMybalance();
	}
}
