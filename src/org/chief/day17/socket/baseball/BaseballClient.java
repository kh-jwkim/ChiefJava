package org.chief.day17.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.*;

public class BaseballClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클라이언트 소켓을 생성하였습니다.
		
//		게임 준비 완료
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
//		--> 2 3 6
//		0스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
//		--> 1 4 6
//		2스트라이크 0볼
//		--> 1 5 4
//		1스트라이크 2볼
//		--> 1 4 5
//		아웃! 게임 종료!
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		String address = "127.0.0.1";
		int port = 8888;
		
		try {
			//////// address, port 정보를 기반으로 서버와 통신하여 소켓 생성
			socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			
			//////// 통신에 사용할 스트림 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			//////// 서버가 정답 판정을 내려줄 때 까지 while(true)로 반복
			while(true) {
				
				//// 메시지에는 공백이 포함되어야 하므로 nextLine() 메서드로 입력받기
				System.out.print("숫자 입력(띄어쓰기로 구분) ex 1 2 3\n-->");
				String writeMsg = sc.nextLine();
				
				//// 서버로 답안 메시지 전송
				dos.writeUTF(writeMsg);
				dos.flush();
				
				//// 서버에서 판독결과 수신
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
				
				//// 서버에서 정답 판정을 받은 경우 while 탈출
				if(recvMsg.equals("아웃! 게임 종료!"))
					break;
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
				is.close();
				os.close();
				socket.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
