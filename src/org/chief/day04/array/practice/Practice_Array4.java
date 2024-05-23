package org.chief.day04.array.practice;

public class Practice_Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		//	배열 인덱스를 활용해서 귤을 출력하세요.
		//
		//	ex.
		//	귤
		
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
//		System.out.println(fruits[1]);
		
		for(String fru: fruits)
			if(fru.equals("귤"))
				System.out.println(fru);

	}

}
