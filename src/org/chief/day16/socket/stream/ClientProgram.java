package org.chief.day16.socket.stream;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//요구사항
		//1. 서버로 통신 시도하여 성공시 소켓 생성
		//2. 서버에서 텍스트를 전송받기
		//3. 전송받은 텍스트를 화면 출력
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		
		try {
			//프로그램 시작의 서순이 중요!!
			//당연하지만 서버를 먼저 실행 시키고 클라이언트를 실행해야 한다!!
			socket = new Socket(address, port);
			System.out.println("서버와 연결 성공");
			is = socket.getInputStream();
			int result = is.read();
			System.out.println((char)result);
			result = is.read();
			System.out.println((char)result);
			result = is.read();
			System.out.println((char)result);
			result = is.read();
			System.out.println((char)result);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
