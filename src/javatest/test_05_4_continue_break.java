package javatest;

public class test_05_4_continue_break {
	public static void main(String[] args) {
		int num = 1;
		boolean search = false;
		
		while(num < 100) {
			if(((num % 5) == 0) && ((num % 7) == 0)){
				search = true;
				break;
			}
			num++;
		}
		if(search) {
			System.out.println("찾는 정수 : " + num);
		}else {
			System.out.println("오답");
		}
		
		
		
		
	}
}
