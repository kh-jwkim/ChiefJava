package org.chief.day05.exception.exercise;

public class Exercise_Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	문제5
		//	NullPointerException
		
		try {
			String word = null;
			if(word.equals("키위")) {
				System.out.println("맞습니다.");
			}else {
				System.out.println("다릅니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Null값을 참조하였습니다.");
			e.printStackTrace();
			//. 앞이 Null인데 명령어를 작성함
		}

	}

}
