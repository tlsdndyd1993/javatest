package javatest;

import java.util.Scanner;

public class test_09_2_Scanner {
	public static void main(String[] args) {
//		Scanner a = new Scanner(System.in);
//		int i = a.nextInt();
//		double j = a.nextDouble();
//		System.out.println(i * 102);
//		System.out.println(j * 20.1);
//		a.close();
		Scanner b = new Scanner(System.in);
		while(b.hasNextInt()) {
			System.out.println(b.nextInt() * 12);
		}
		b.close();
	}
}
