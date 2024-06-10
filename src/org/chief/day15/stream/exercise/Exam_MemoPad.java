package org.chief.day15.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		//저장할 파일 입력(확장자 제외) : snow
		//종료는 exit
		//1 : 오늘은
		//2 : 눈이
		//3 : 옵니다.
		//4 : 펑펑
		//5 : 옵니다.
		//6 : exit
		//파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~
		//snow.txt -> 오늘은 \n 눈이 \n 옵니다 \n 펑펑 \n 옵니다
		
		Scanner sc = new Scanner(System.in);
//		Reader reader = null;
		Writer writer = null;
		String filePath = "src/org/chief/day15/stream/exercise/";
		String input = "";
		int line = 1;
		
		System.out.print("저장할 파일 입력(확장자 제외) : ");
		String filename = "";
		filename = sc.nextLine();	//Scanner 객체로 저장할 파일명 받기
		filePath += filename;			//filePath에 위에서 입력받은 파일명 추가
		
		try {
			writer = new FileWriter(filePath);
			System.out.print(line++ + " : ");
			while(!(input = sc.nextLine()).equals("exit")) {
				System.out.print(line++ + " : ");
				writer.write((input+"\n"), 0, input.length()+1);	//length를 그냥 쓰면 내가 뒤에 추가한 개행문자가 잘려버린다! +1 해주니 해결
				writer.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
