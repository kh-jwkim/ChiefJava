package org.chief.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
//		C:\Windows\Web\Wallpaper\Spotlight\img50.jpg
//		C:\Temp\copyimg.jpg
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Spotlight\\img50.jpg");	// 자바에서 \ 는 기능이 있는 문자라 \\ 두개로 사용해야 경로가 표기됨
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");	//디렉터리가 자동으로 생성되지는 않으니 C:\Temp 디렉터리를 미리 만들어둔다
																//java.io.File 클래스의 mkdirs()메서드 또는 java.nio.file 패키지 Files, Paths 클래스를 사용하여 디렉터리 생성 가능
																//왜 되는지는 모르겠는데 경로에 대소문자가 달라도 파일 출력이 정상적으로 작동했음. 나중에 참고하자
			byte[] byteImages = new byte[1024];
			int readCount;
			while ((readCount = is.read(byteImages)) != -1) {
				os.write(byteImages, 0, readCount);		//스트림의 끝에서는 버퍼를 꽉 채우지 않을수 있으므로 읽어온 갯수를 전달
				os.flush();								//write 후 버퍼를 비워준다
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
