package org.chief.day15.file.exercise;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_ShowFileList {

	public static void main(String[] args) {
		//요구사항
		//1. 경로의 파일 리스트를 가져온다
		//2. 파일의 이름을 출력 "%-35s", fileName
		//3. 파일의 크기를 출력 "파일크기 : " + fileSize + "\t"
		//4. 수정한 시간을 출력 "\t수정한 시간 : %tb %td %ta %tT \n", time ...
		
		File file = new File("C:/windows");
		System.out.println("------" + file.getPath() + "의 서브 리스트 입니다. ------");
		File[] subFiles = file.listFiles();	//file이 디렉터리가 아닐때는 null을 리턴한다
		
		Date date;
		SimpleDateFormat trans = new SimpleDateFormat("MM월 dd E HH:mm:ss");
		
		for(int i=0; i<subFiles.length; i++) {
			System.out.printf("%-35s", subFiles[i].getName());
			System.out.print("파일크기 : " + subFiles[i].length() + "\t");
			date = new Date(subFiles[i].lastModified());
//			long time = subFiles[i].lastModified();		//Java에서 시간은 long 타입으로 처리 된다!
			//printf에서 %t+@ 형식으로 처리해도 되고 Date() 생성자에 넣어서 처리해주는것도 가능!!
//			System.out.printf("\t수정한 시간 : %tb %td %ta %tT \n", time, time, time, time);
			System.out.print("\t수정한 시간 : " + trans.format(date) + "\n");
			
		}

	}

}
