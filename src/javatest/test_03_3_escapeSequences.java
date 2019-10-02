package javatest;

public class test_03_3_escapeSequences {
	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'c');
		System.out.println("AB" + '\t' + 'c');
		System.out.println("AB" + '\n' + 'c');
		System.out.println("AB1" + '\r' + 'c');
	}
}
