package org.chief.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/org/chief/day15/stream/reader/reading.txt");
			int readCount;
			char[] cBuf = new char[3]; //앞서했던 FileInputStream 과는 다르게 char[] 타입의 배열을 버퍼로 사용
			String result = "";
			while((readCount = reader.read(cBuf)) != -1) {
				result += new String(cBuf, 0, readCount);	//Read는 문자기반 스트림이라 char[] 타입으로 입력받는다!!
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
