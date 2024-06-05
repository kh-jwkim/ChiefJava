package kr.or.iei;

class SuperClass{
	String name = "super";	//필드값은 오버로딩이 아니라 개별의 지역변수 취급
	int test = 1;			//지역변수기 때문에 해당하는 스코프에 따라서 접근된다.
	void paint() { 
		System.out.println(this.name);
		System.out.println(name);
		draw();									//4. 3번에서 super.draw()가 나왔으므로 이 구문이 실행, 이 메서드는 SubClass에서 오버라이딩 했음
	}
	void draw() {
		System.out.println(1);					//7. 6번에서 super.draw()가 나왔으므로 이 구문이 실행
	}
}

class SubClass extends SuperClass {
	String name = "sub";
	int test = 2;
	@Override
	void paint() {
		// TODO Auto-generated method stub
		System.out.println(name);
		super.paint();							//3. super 클래스(SuperClass)의 paint() 메서드가 실행
		super.draw();							//6. super 클래스(SuperClass)의 draw() 메서드가 실행
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println(2);					//5. 4번에서 실행된 draw()는 여기서 오버라이딩 한 내용으로 실행됨
	}
}

public class Practice04 {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();			//1. 객체 ex의 타입은 SuperClass 지만 알맹이(인스턴스)는 SubClass
		ex.paint();								//2. ex의 paint() 메서드 실행
	}
}
