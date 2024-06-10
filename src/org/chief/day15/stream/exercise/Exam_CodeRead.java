package org.chief.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_CodeRead {

	public static void main(String[] args) {
		// Exam_ImageCopy.java 파일을 읽어서 콘솔로 출력해보세요
		// 문자기반 스트림
		// 1. 입력스트림 사용
		//   - 문자 배열 이용
		// 2. 파일의 경로를 파악
		// 3. System.out.println() 으로 출력
		//   - 읽은 것은 문자열로 만들기
		//   - 누적합
		// 4. 자원해제
		Reader reader = null;
		
		try {
			String currentDirectory = System.getProperty("user.dir");
	        System.out.println("현재 작업 디렉토리: " + currentDirectory);
	        //이클립스로 실행했을 때 작업 디렉터리가 프로젝트 디렉터리 이므로 상대경로 입력 시 경로는 src 부터 시작해야 한다!!
//			reader = new FileReader("src/org/chief/day15/stream/exercise/Exam_ImageCopy.java");
//			reader = new FileReader("E:\\KH_JAVA\\Ex\\Backend\\java_workspace\\CheifJava\\src\\org\\chief\\day15\\stream\\exercise\\Exam_ImageCopy.java");
			reader = new FileReader("E:/KH_JAVA/Ex/Backend/java_workspace/CheifJava/src/org/chief/day15/stream\\exercise\\Exam_ImageCopy.java");
			//파일의 경로는 \\ 또는 / 로 구분!! 둘을 적당히 섞어써도 되는듯??
			char[] buffer = new char[1024];
			int readCount;
			String result = "";
			while((readCount = reader.read(buffer))!= -1) {
//				System.out.print(buffer);
				result += new String(buffer, 0, readCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
