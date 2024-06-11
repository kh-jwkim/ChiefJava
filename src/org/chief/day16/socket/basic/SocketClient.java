package org.chief.day16.socket.basic;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) {
		Socket clientSocket = null;
		String address = "127.0.0.1";
		int port = 8888;
		
		try {
			//프로그램 시작의 서순이 중요!!
			//당연하지만 서버를 먼저 실행 시키고 클라이언트를 실행해야 한다!!
			clientSocket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
