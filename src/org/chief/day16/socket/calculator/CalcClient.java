package org.chief.day16.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//요구사항
		//1. 서버로 통신 시도하여 성공시 소켓 생성
		//2. 사용자에게 수식을 입력받는다
		//3. 서버로 수식 전송
		//4. 전송받은 결과를 화면 출력
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//프로그램 시작의 서순이 중요!!
			//당연하지만 서버를 먼저 실행 시키고 클라이언트를 실행해야 한다!!
			//1. 서버로 통신 시도하여 성공시 소켓 생성
			socket = new Socket(address, port);
			System.out.println("서버와 연결 성공");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
//			int result = is.read();
//			System.out.println((char)result);
			//문자열(UTF타입)을 소켓에서 쓸 수 있는 byte 형태로 변환하여 소켓의 스트림으로 전달
//			dos.writeUTF("html");
			
			while(true) {
			
				//2. 사용자에게 수식을 입력받는다
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String sendMsg = sc.nextLine();
				//3. 서버로 수식 전송
				dos.writeUTF(sendMsg);
				
				if(sendMsg.equals("exit")) {	//sendMsg 값이 exit이면 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				//4. 전송받은 결과를 화면 출력
				System.out.println("결과값 = " + dis.readUTF());
			
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				dis.close();
				os.close();
				dos.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
