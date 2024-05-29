package org.chief.day09.oop.inheritance;

import org.chief.day09.oop.inheritance.point.Point;

class Super{
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
}

class Sub extends Super{
	void set() {
		Super sup = new Super();
		sup.pro = 24;	//부모클래스가 같은 패키지에 있으므로 sup.pro로 접근 가능
		super.pro = 24;	//상속받았기 때문에 super.pro로 접근 가능
		super.pub = 24;
		super.def = 24;
		super.pro = 24;
//		super.pri = 24;		//is not visible
	}
}

class ShapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 24;
//		p.def = 24;		//default는 같은 패키지에서만 가능
//		p.pro = 24;		//protected는 같은 패키지 또는 상속일 때 가능
//		p.pri = 24;		//당연히 안됨 private
		super.pub = 24;
//		super.def = 24;
		super.pro = 24;	//상속받았기 때문에 super를 통해서 접근 가능 + 다른 패키지 이기 때문에 p.pro 로는 접근 불가능
//		super.pri = 24;
	}
}

public class Exam_Protected {
	
}
