package org.chief.day11.oop.objectex;

class Rectangle{
	int width, height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Rectangle rect = (Rectangle)obj;
		return (this.width==rect.width) && (this.height==rect.height);
	}
	
}

public class Exam_RectEquals {
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 7);
		Rectangle rect2 = new Rectangle(5, 7);
//		if(rect1 == rect2{}	//주소는 다를테니 이렇게 비교는 안될것이다.
		if(rect1.equals(rect2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
