package org.chief.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		//요구사항 : C드라이브에 있는 파일을 E드라이브로 복사해보자~!
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:/Temp/Fetility.png");
			os = new FileOutputStream("D:/Copy/copied.png");
			
			byte[] buffer = new byte[1024];
			int readCount;
			while((readCount=is.read(buffer)) != -1) {
				os.write(buffer, 0, readCount);
			}
			os.flush();
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
