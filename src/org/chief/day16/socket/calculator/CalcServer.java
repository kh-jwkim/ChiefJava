package org.chief.day16.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//요구사항
		//1. 프로그램 실행 시 Listen상태 진입
		//2. client의 통신을 받으면 소켓 생성
		//3. 클라이언트로부터 수식을 입력받기
		//4. 입력받은 수식을 처리
		//5. 처리한 결과값을 클라이언트로 전송
		ServerSocket serverSocket = null;
		int port = 9999;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 요청 대기");
			//1. 프로그램 실행 시 Listen상태 진입
			//2. client의 통신을 받으면 소켓 생성
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 성공");
			is = socket.getInputStream();	//소켓의 스트림은 byte 타입
			os = socket.getOutputStream();
			dis = new DataInputStream(is);	//DataInputStream은 다양한 타입 전환을 지원
			dos = new DataOutputStream(os);
			
			while(true) {
			
				//3. 클라이언트로부터 수식을 입력받기
	//			os.write((int)'a');	//소켓의 스트림은 byte 타입으로 데이터를 주고받는다...
				String recvMsg = dis.readUTF();	//전송받은 데이터를 UTF 타입으로 변환하여 String객체에 저장
				System.out.print(recvMsg + " = ");
				
				//4. 입력받은 수식을 처리
				if(recvMsg.equals("exit")) {	//recvMsg 값이 exit이면 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				//문자열로 받은 수식을 split() 메서드로 쪼개서 저장
				String[] data = recvMsg.split(" ");
				int num1 = Integer.parseInt(data[0]);
				int num2 = Integer.parseInt(data[2]);
				String operator = data[1];
//				int res=0;
				String res="";
				for(String token:data) {
					System.out.println(token);
				}
				switch (operator) {
				case "+":
					res = num1 + num2 +"";
					break;
				case "-":
					res = num1 - num2 +"";
					break;
				case "*":
					res = num1 * num2 +"";
					break;
				case "/":
					res = num1 / num2 +"";
					break;
				case "%":
					res = num1 % num2 +"";
					break;
	
				default:
					System.out.println("잘못된 인자 전달받음");
					break;
				}
				System.out.println("결과값="+res);
				//5. 처리한 결과값을 클라이언트로 전송
				dos.writeUTF(res);
				dos.flush();
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				dis.close();
				os.close();
				dos.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
