package org.chief.day14.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		String msg = "Hello Java";		//상수풀로 들어가서 (같은 프로그램 내일 때)재사용
		msg = new String("Hello Java");	//new 키워드가 있기 때문에 주소는 무조건 새롭게 생성
		
		//문자열 길이
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		
		//문자열 포함되어 있는지 체크
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		//문자열 연결
		// C#,C++
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);
		
		//문자열 공백 제거
		data1 = data1.trim();
		data2 = data2.trim();
		System.out.println("공백 제거 확인 : " + data1);
		System.out.println("공백 제거 확인 : " + data2);
		
		//문자열 교체 C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : " + data1);
		
		//문자열 썰기1 - 기준 잡고 썰어줌
		//split은 return값이 String[] 이다!!
		String[] words = data1.split(",");
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i] + " / ");
		}
		for(String word : words) {
			System.out.println(word + " / ");
		}
		System.out.println();
		
		//문자열 썰기2 - 인덱스로 썰어줌
//		data1 = data1.substring(4);		index 4 부터 끝까지 잘라버림
		System.out.println("문자열 자르기 : " + data1);
		data1 = data1.substring(0, 4);	//index 0 부터 4 까지 잘라버림
		System.out.println("문자열 자르기 : " + data1);
		
		//문자열 -> 문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자로 자르기 : " + word);
	}

}
