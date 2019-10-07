package javatest;

public class test_07_1_ {
	int balance = 0;
	
	
	public void checkMybalance() {
		System.out.println("남은 잔액은 " + balance + "원 입니다.");
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
}
