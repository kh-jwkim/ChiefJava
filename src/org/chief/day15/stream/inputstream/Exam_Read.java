package org.chief.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;	//추상클래스 이기 때문에 InputStream을 그냥 생성할 수는 없다...
		
		try {
			is = new FileInputStream("src/org/chief/day15/stream/inputstream/reading.txt");
			int readByte = is.read();
			System.out.print((char)readByte);		//아스키코드를 받아오므로 char로 형변환 해서 출력
			readByte = is.read();
			while ((readByte=is.read()) != -1) {	//스트림의 끝이면(-1이면) 루프 종료
				System.out.print((char)readByte);
			}
			System.out.println("테스트");
			System.out.println((char)(-1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
