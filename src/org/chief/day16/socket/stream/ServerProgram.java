package org.chief.day16.socket.stream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//요구사항
		//1. 프로그램 실행 시 Listen상태 진입
		//2. client의 통신 시도 시 소켓 생성
		//3. 사용자에게 텍스트를 입력받기
		//4. 입력받은 텍스트를 클라이언트로 전송
		ServerSocket serverSocket = null;
		int port = 8888;
		OutputStream os = null;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 요청 대기");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 통신 시작");
			os = socket.getOutputStream();
			os.write((int)'a');	//소켓의 스트림은 byte 타입으로 데이터를 주고받는다...
			os.write((int)'b');
			os.write((int)'c');
			os.write((int)'d');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
