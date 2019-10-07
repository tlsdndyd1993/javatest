package javatest;

public class test_09_6_Instance_vs_methodVar{
	int v = 5;
	void k() {
		int v = 4;
		System.out.println(this.v);
	}
}
