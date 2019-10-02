package javatest;

public class test_05_3_while {
	public static void main(String[] args) {
		
		int num = 0;
		
		do {
			System.out.println("I like Java " + num);
			num++;
		}while(num<5);
		
		num = 0;
		while(num<5) {
			System.out.println("I like Java!" + num);
			num++;
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("i : " + i);
		}
		
		
		
	}
}
