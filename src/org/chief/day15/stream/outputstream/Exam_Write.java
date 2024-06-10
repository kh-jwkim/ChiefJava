package org.chief.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/chief/day15/stream/outputstream/writing.txt");
			byte[] input = "헬로우 입출력".getBytes();
			for(int i=0; i<input.length; i++) {
				os.write(input[i]);
			}
//			os.write(input[0]);
//			os.write(input[1]);
//			os.write(input[2]);
//			os.write(input);
//			"헬로우 입출력";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.flush();	//버퍼 비우기
				os.close();	//자원해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
