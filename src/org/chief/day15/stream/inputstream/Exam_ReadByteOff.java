package org.chief.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/org/chief/day15/stream/inputstream/reading.txt");
			int readCount;
			byte [] readBytes = new byte[3];
			String result = "";
			while ((readCount = is.read(readBytes, 1, 2)) != -1) {	//배열의 1번부터 2번 까지만 읽어들이게
				result += new String(readBytes, 0, readCount);
				System.out.println(result);
			}
//			is.close();	//위에서 오류 발생했을때 아래의 catch문으로 넘어가서 close() 메서드가 실행 안될수도 있다... 이런건 finally에 적어주자
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		//위에서 예외가 발생하여 catch문으로 넘어가더라도 finally 안의 코드는 실행된다
			try {
				is.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
		
	}

}
