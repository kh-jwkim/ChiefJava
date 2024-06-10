package org.chief.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/chief/day15/stream/outputstream/writing2.txt");
			byte[] input = "헬로우 입출력2".getBytes();
			os.write(input);	//byte 배열을 그대로 때려박아서 write() 실행
			os.flush();	//버퍼 비우기
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();	//자원해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
