package org.chief.day17.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.*;

public class BaseballServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		서버소켓을 생성하였습니다.
//		클라이언트의 접속을 기다립니다.
//		클라이언트가 접속했습니다.
//		1 4 5
//		서버 준비 완료
//		받기 : 2 3 6
//		받기 : 1 4 6
//		받기 : 1 5 4
//		받기 : 1 4 5
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		int port = 8888;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			
			System.out.println("클라이언트의 접속을 기다립니다.");
			socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			//////// 통신에 사용할 스트림 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Random random = new Random();
			
			////////////// 난수 생성 //////////////////
//			int[] nums = {1, 4, 5};
			int[] nums = new int[3];	//nums는 정답을 저장할 int 배열이다.
			
			for(int i=0; i<nums.length; i++) {
				int randNum = random.nextInt(9)+1;
				//randNum이 res에 포함된 숫자인지(=중복 숫자인지) 체크해야 함
				//배열의 처음(0번째) 부터 현재 데이터가 저장된 마지막(i)번째 까지를 체크해야함
				for(int j=0 ; j<i; j++) {
					//중복 숫자가 나온 경우
					if(nums[j]==randNum) {
						//randNum을 새로 만들고 nums[0~i] 범위의 숫자들과 다시 비교
						//i-- 시켜서 동일한 i값으로 숫자 만들어서 체크하는 방식도 있다!
						randNum = random.nextInt(9)+1;
						j=0;
					}
				}
				nums[i] = randNum;
			}
			
			///////////// 정답을 화면에 출력 ////////////
			for(int num:nums)
				System.out.print(num + " ");
			
			///////////// 스트림, 정답 생성 완료 되었으므로 준비 완료 출력 //////////
			System.out.println();
			System.out.println("서버 준비 완료");
			
			///////////// 정답과 일치하는 답안을 받을때 까지 while(true)로 반복 /////
			while(true) {
				///////// dis.readUTF로 client에서 답안을 전송받는다 ////////////////
				System.out.print("받기 : ");
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
				
				///////// split(" ") 메서드로 메시지를 쪼개서 String[] data 에 저장
				String[] data = recvMsg.split(" ");
				String sendMsg = "";
				
				///////// strike, ball을 0으로 초기화
				int strike = 0, ball = 0;
				for(int i=0; i<3; i++) {
					
					///// data[i]가 정답과 자리까지 동일한 경우
					if(Integer.parseInt(data[i]) == nums[i])
						strike++;
					else {
						for(int j=0; j<3; j++) {
							// data[i]가 정답에 포함은 되어 있는 경우
							if(Integer.parseInt(data[i]) == nums[j])
								ball++;
						}
					}
				}
				///////// 정답과 일치하는 답변(strike가 3일때)을 받으면 정답판정 전송 후 종료
				if(strike==3) {
					sendMsg = "아웃! 게임 종료!";
					dos.writeUTF(sendMsg);
					dos.flush();
					break;
				}
				///////// 답변을 체크해서 스트라이크, 볼의 갯수를 전송
				else {
					sendMsg = strike+"스트라이크 "+ball+"볼";
					dos.writeUTF(sendMsg);
					dos.flush();
				}
					
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
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
