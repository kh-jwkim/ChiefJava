package org.chief.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/org/chief/day15/stream/inputstream/reading.txt");
			byte[] readBytes = new byte[3];	//스트림에서 데이터를 퍼올 버퍼의 크기
			int readCount;
			String result = "";
			while((readCount = is.read(readBytes)) != -1) {	//스트림의 끝에서 read() 메서드는 -1을 리턴
				result += new String(readBytes, 0, readCount);
//				System.out.println(new String(readBytes, 0, readCount));	//String 객체를 생성하여 byte배열, 읽어올 첫 바이트의 index, length 입력 후 출력
			}
			System.out.println(result);	//result 객체에 버퍼의 내용을 전부 합친 뒤 한번에 출력
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
