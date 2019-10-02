package javatest;

public class test_05_5_ {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((++num) < 100) {
			System.out.println(num);
			if(((num % 5) != 0) || ((num % 7) != 0)) {
				continue;
			}
			count++;
			System.out.println(num);			
		}
		System.out.println(num);
		System.out.println("count : " + count);
	}
}
