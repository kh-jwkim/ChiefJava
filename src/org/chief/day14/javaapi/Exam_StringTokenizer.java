package org.chief.day14.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "name=james&addr=seoul&age=22";
		String words[] = query.split("[&=]");	//정규표현식 사용
		for(String word : words) {
			System.out.print(word + " "	);
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(query, "&=");	//jsp에서 쿼리문 쪼개서 for문 돌릴 때 사용
																//여기는 정규표현식이 아니라 구분자일뿐이다!!
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
