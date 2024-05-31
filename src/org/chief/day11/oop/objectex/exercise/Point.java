package org.chief.day11.oop.objectex.exercise;

public class Point {
	int x, y;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point dot = (Point)obj;
		return this.x==dot.x && this.y==dot.y;
	}
}
