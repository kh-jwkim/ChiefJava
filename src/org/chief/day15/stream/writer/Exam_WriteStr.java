package org.chief.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/org/chief/day15/stream/writer/writing3.txt");
			writer.write("Html/Css/Java");
			writer.flush();	//출력이 다 끝나고 나서 버퍼 비우기
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
