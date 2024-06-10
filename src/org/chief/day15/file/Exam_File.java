package org.chief.day15.file;

import java.io.File;
import java.io.IOException;

public class Exam_File {

	public static void main(String[] args) throws IOException {
		File folderMake = new File("src/org/chief/day15/file/sample");
		if(!folderMake.exists()) {
			folderMake.mkdir();
			System.out.println("폴더가 만들어졌습니다.");
		} else {
			System.out.println("이미 폴더가 존재합니다.");
		}
	}
	
	public void fileMake() throws IOException {	//오류를 이 프로그램에서 처리하지 않고 JVM에 처리를 부탁한다!
		File fileMake = new File("src/org/chief/day15/file/sample.txt");
		if(!fileMake.exists()) {
			fileMake.createNewFile();
			System.out.println("파일이 만들어졌습니다.");
		} else {
			System.out.println("이미 파일이 존재합니다.");
		}
	}

	public void fileBasic() {
		File file = new File("C:/Temp/copyimg.jpg");
		String filename = file.getName();
		String path		= file.getPath();
		String parent	= file.getParent();
		System.out.println("파일 이름 : " + filename);
		System.out.println("파일 경로 : " + path);
		System.out.println("부모 폴더 : " + parent);
		System.out.println("파일이 존재하는가? : " + file.exists());
		System.out.println("파일이 맞는가? : " + file.isFile());
		System.out.println("폴더가 맞는가? : " + file.isDirectory());
	}
}
