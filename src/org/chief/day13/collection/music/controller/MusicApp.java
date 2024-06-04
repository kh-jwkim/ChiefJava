package org.chief.day13.collection.music.controller;

import java.util.List;
import java.util.Map;

import org.chief.day13.collection.music.model.ManageMusic;
import org.chief.day13.collection.music.model.Music;
import org.chief.day13.collection.music.view.ViewMusic;

public class MusicApp {

	public static void main(String[] args) {
		ManageMusic mng = new ManageMusic();
		ViewMusic view = new ViewMusic();
		
		end:
		while(true) {
			switch (view.printMenu()) {
			case 1:
				Music newMusicLast = view.inputMusic("리스트 마지막");
				mng.registerMusicAtLast(newMusicLast);
				break;
			case 2:
				Music newMusicFirst = view.inputMusic("리스트 처음");
				mng.registerMusicAtFirst(newMusicFirst);
				break;
			case 3:
				List<Music> musicList = mng.getAllMusic();
				view.printMusicInfo(musicList);
				break;
			case 4:
				String searchTitle = view.getName("검색");
				Music searchMusic = mng.searchOneByTitle(searchTitle);
				view.printMusic(searchMusic);
				break;
			case 5:
				String deleteTitle = view.getName("삭제");
				mng.removeOneByTitle(deleteTitle);
				break;
			case 6:
//				Map<String, Object> modifyInfo = mng.searchModifyMusic(modifyTitle);
				String modifyTitle = view.getName("수정");
				Music modifyMusic = view.inputMusic("수정");
				int modifyIndex = mng.searchIndexByTitle(modifyTitle);
				mng.modifyOne(modifyIndex, modifyMusic);
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 0:
				view.printMessage("프로그램을 종료합니다.");
				break end;
				
			default:
				view.printMessage("메뉴를 잘못선택하셨습니다.");
				break;
			}
			
		}
	}
	
}
