package org.chief.day13.collection.music.view;

import java.util.List;
import java.util.Scanner;

import org.chief.day13.collection.music.model.Music;

public class ViewMusic {

	public ViewMusic() {
		// TODO Auto-generated constructor stub
	}
	
	//arg : -
	//return : int
	//todo : 메인메뉴 텍스트 출력
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");		//오늘(06/04)은 일단 1~6번까지
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");			//title로 검색
		System.out.println("5. 특정 곡 삭제");			//title로 검색
		System.out.println("6. 특정 곡 정보수정");		//title로 검색
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		
		return sc.nextInt();
	}
	
	//arg : msg:String
	//return : void
	//todo : 매개변수의 msg를 화면에 출력
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
	//arg : category:String
	//return : String
	//todo : 특정 작업을 위해 검색할 키값(title)을 사용자에게 입력받아 리턴
	public String getName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category+"할 곡명 : ");
		String getTitle = sc.next();
		
		return getTitle;
	}
	
	//arg : -
	//return : Music
	//todo : Music 인스턴스를 생성하여 사용자에게 title, singer입력받은뒤 리턴
	public Music inputMusic(String category) {
		Scanner sc = new Scanner(System.in);
		Music music = new Music();
		System.out.println(category + "에 곡을 추가합니다.");
//		sc.nextLine();
		System.out.print("제목 : ");
		music.setTitle(sc.next());
//		music.setTitle(sc.nextLine());
		System.out.print("가수 : ");
		music.setSinger(sc.next());
//		music.setSinger(sc.nextLine());
		
		return music;
	}
	
	//arg : List<Music>
	//return : void
	//todo : List<Music> 을 받아 리스트의 Music 인스턴스의 정보를 순차적으로 출력
	public void printMusicInfo(List<Music> musicList) {
		System.out.println("=== === 음악 정보 출력 === ===");
		if(musicList.size()>0) {
			for(int i=0; i<musicList.size(); i++) {
				System.out.println(i+1 + "번째 곡");
				printMusic(musicList.get(i));
			}
		}
		else
			System.out.println("정보가 존재하지 않습니다.");
	}
	
	//arg : Music
	//return : void
	//todo : Music 을 받아 인스턴스의 정보를 출력
	public void printMusic(Music music) {
		if(music != null) {
			System.out.println("제목 - " + music.getTitle());
			System.out.println("가수 - " + music.getSinger() + "\n");
		}else {
			System.out.println("검색결과가 없습니다.");
		}
	}
	
	//arg : String
	//return : Music
	//todo : Music 인스턴스를 생성하여 수정하려는 정보 입력 후 인스턴스 리턴
	public Music modifyMusic(String category) {
		Scanner sc = new Scanner(System.in);
		Music music = new Music();
		System.out.println(category + "할 곡의 정보 입력");
		System.out.print("제목 : ");
		music.setTitle(sc.next());
		System.out.print("가수 : ");
		music.setSinger(sc.next());

		return music;
	}
	
}
