package org.chief.day11.oop.objectex;

class Member {
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	public Member() {}	//기본생성자는 무조건!!! 꼭!!! 만들자!! 없으면 의도치 않은 에러의 원인이 된다!!!
	
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 나이 : " + age + ", 이메일 : " + email + ", 전화번호 : " + phone + ", 주소 : " + address;
	}
}

public class Exam_ObjecProperty {
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드값 : " + obj.hashCode());
		//의미있는 데이터로 만들어 추력하고 싶다면 오버라이딩 필수!
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
//		System.out.println("객체 출력 : " + obj);	//toString() 생략 가능함
													//객체를 출력하면 toString()의 결과로 출력됨
	}
	
	public static void main(String[] args) {
		print(new Member("일용자", 11, "khuser01@naver.com", "01092920303", "서울시 중구"));
		print(new Member());
//		Member mem = new Member();
		
		String javaStr = "Java";
		String javaStr2 = new String("Java");	//편의성을 위해 String 인스턴스 만드는건 new String() 생략이 가능하도록 되어있다.
		String javaStr3 = "Java";
		System.out.println("javaStr : " + javaStr + "해시코드 : " + javaStr.hashCode() + "\njavaStr2 : " + javaStr2 + "해시코드 : " + javaStr2.hashCode());
		
		//문제
		System.out.println(javaStr == javaStr3);// ??	t 	주소가 똑같기 때문(feat.상수풀)
		System.out.println(javaStr3 == javaStr2);// ??	f	주소가 다르기 때문
		System.out.println(javaStr3 == "Java");//		t	주소가 같다
		System.out.println(javaStr == "javA");//		f	주소가 다름
		System.out.println(javaStr2 == "Java");//		f	주소가 다름
		System.out.println(javaStr2.equals("Java"));//	t	값 비교를 해서
		
		
//		if(javaStr == "Java") 
//		if(javaStr2 == "Java") 
		if("Java".equals(javaStr2)) 		//문자열 비교는 equals
			System.out.println("똑같다");	//equals는 Object클래스의 메서드
		else
			System.out.println("다르다");
		
	}
}
