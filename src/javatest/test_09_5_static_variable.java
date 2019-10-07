package javatest;

public class test_09_5_static_variable {
//	메소드 내(b)에서 지역변수가 존재하지 않는다면 그 메소드가 소속된 클래스의 전역변수를 사용하게 된다.
	static int num = 5;

	static void a() {
		int num = 1;
//		System.out.println(num);
		b();
	}
	
	static void b() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		a();
	}
}
