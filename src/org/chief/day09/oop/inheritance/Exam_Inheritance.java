package org.chief.day09.oop.inheritance;

import org.chief.day09.oop.inheritance.point.ColorPoint;

public class Exam_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint();
		cp.setX(5);
		cp.setY(7);
		cp.showPoint();
		
		ColorPoint cp2 = new ColorPoint(10,23,"green");
		cp2.showColorPoint();
	}

}
