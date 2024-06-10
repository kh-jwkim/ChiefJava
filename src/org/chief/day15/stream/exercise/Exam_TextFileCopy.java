package org.chief.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		// C:\Windows\system.ini 를 복사해서
		// C:\Temp\system.txt 로 만들어주세요
		// 단 문자기반 스트림을 사용하세요.
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt");
			char[] cBuf = new char[1024];
			int readCount;
			while((readCount = reader.read(cBuf)) != -1) {
				writer.write(cBuf, 0, readCount);
			}
			writer.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
