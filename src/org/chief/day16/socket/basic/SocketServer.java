package org.chief.day16.socket.basic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		
		try {
			serverSocket = new ServerSocket(port);	//여기선 port값만 생성자에 넘겨서 인스턴스 생성
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			Socket socket = serverSocket.accept();	//listen 상태 설정
			System.out.println("연결이 완료되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
