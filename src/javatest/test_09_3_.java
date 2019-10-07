package javatest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class test_09_3_ {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\tlsdn\\OneDrive\\바탕 화면\\git\\java\\javatest\\src\\javatest\\openpose.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 1002);
			}
			sc.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
