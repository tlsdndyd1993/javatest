package javatest.q_09_1;

public class Point {
	int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]" );
	}
	
}
