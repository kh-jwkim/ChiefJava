package org.chief.day04.array.practice;

import java.util.Scanner;

public class Practice_Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	메소드 명 : public void practice5(){}
		//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		//
		//	ex.
		//	문자열 : application
		//	문자 : i
		//	application에 i가 존재하는 위치(인덱스) : 4 8
		//	i 개수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String text = sc.next();					//문자열 입력
		
		char[] textArr = new char[text.length()];	//문자열 길이만큼 char 배열생성
		for(int i=0; i<textArr.length; i++) {
			textArr[i] = text.charAt(i);			//인덱스값을 문자열과 char배열에 대입하여 값 복사
		}
		
		System.out.print("문자 : ");
		char key = sc.next().charAt(0);				//비교할 문자를 입력받는다. 이 때 .charAT() 메서드를 이용하여 첫 문자를 key에 저장
		int count=0;
		
		System.out.println(text+"에 i가 존재하는 위치(인덱스) : ");
		for(int i=0; i<textArr.length; i++) {
			if(textArr[i]==key) {					//i번 인덱스에서 검색하려는 문자와 일치한 경우
				System.out.print(i+" ");			//화면에 인덱스값 i 출력
				count++;							//카운트값 증가
			}
		}
		System.out.println("\n" + key + " 개수 : "+count);	//최종 카운트값 출력

	}

}
