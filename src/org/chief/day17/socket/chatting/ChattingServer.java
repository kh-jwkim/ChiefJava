package org.chief.day17.socket.chatting;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//ServerSockt 생성
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			
			//ServerSocket Listen 대기 하다가 연결 요청 시 Socket 생성
			socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			
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
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				//입력받은 String 데이터를 writeUTF메서드를 통해 dos->os->socket을 거쳐 서버로 전송한다.
				dos.writeUTF(sendMsg);
				dos.flush();
				if(sendMsg.equals("end")) 
					break;
				
				//socket->is->dis를 거쳐 들어온 데이터를 readUTF메서드의 리턴(String)으로 받는다.
				String recvMsg = dis.readUTF();
				System.out.println("서버(상대) : " + recvMsg);
				if(recvMsg.equals("end"))
					break;
			
			}
			
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
