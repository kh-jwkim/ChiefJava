package org.chief.day17.socket.chatting;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//IP, Port 정보로 서버에 연결 시도
			System.out.println("서버에 연결을 시도합니다.");
//			socket = new Socket("127.0.0.1", port);
			socket = new Socket("192.168.160.206", port);
			
			//연결 성공하면 Socket 객체라 생성되어 socket에 저장
			System.out.println("서버에 연결되었습니다.");
			
			//socket의 I/O 스트림 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			System.out.println("Socket의 I/O 스트림 생성 완료");
			
			//socket의 I/O 스트림에 이어지는 Data I/O 스트림 생성
			//Data I/O 스트림은 타입 변환 등을 쉽게 해주는 기능이다!
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("Data I/O 스트림 생성 완료");
			
			while(true) {
				//socket->is->dis를 거쳐 들어온 데이터를 readUTF메서드의 리턴(String)으로 받는다.
				String recvMsg = dis.readUTF();
				System.out.println("클라이언트(상대) : " + recvMsg);
				if(recvMsg.equals("end"))
					break;
				
				//입력받은 String 데이터를 writeUTF메서드를 통해 dos->os->socket을 거쳐 서버로 전송한다.
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				if(sendMsg.equals("end")) 
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
