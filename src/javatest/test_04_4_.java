package javatest;

public class test_04_4_ {
	public static void main(String[] args) {
//		byte n1 = 13;
//		byte n2 = 7;
//		byte n3 = (byte) (n1 & n2);
//		System.out.println(n3);
		
		byte n1 = 5;	//00000101
		byte n2 = 3;	//00000011
		byte n3 = -1;	//11111111
		
		byte r1 = (byte)(n1 & n2);
		byte r2 = (byte)(n1 | n2);
		byte r3 = (byte)(n1 ^ n2);
		byte r4 = (byte)(~n3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		  
		
	}
}
