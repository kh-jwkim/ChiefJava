package org.chief.day13.collection.music.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageMusic {

	private List<Music> mList;
//	ArrayList<Music> nList;
	
	public ManageMusic() {
		// TODO Auto-generated constructor stub
		mList = new ArrayList<Music>();
	}
	
	//arg : music:Music
	//return : void
	//todo : 매개변수로 받은 Music 인스턴스를 mList의 끝에 추가
	public void registerMusicAtLast(Music music) {
		mList.add(music);
	}
	
	//arg : music:Music
	//return : void
	//todo : 매개변수로 받은 Music 인스턴스를 mList의 제일 앞에 추가
	public void registerMusicAtFirst(Music music) {
		mList.add(0,music);
	}
	
	//arg : -
	//return : List<Music>
	//todo : Music 인스턴스들이 전부 저장된 mList를 리턴
	public List<Music> getAllMusic(){
		return mList;
	}
	
	//arg : title:String
	//return : Music
	//todo : title을 키값으로 mList를 검색하여 해당하는 Music 인스턴스 리턴
	public Music searchOneByTitle(String title) {
		for(int i=0; i<mList.size(); i++) 
			if(mList.get(i).getTitle().equals(title))
				return mList.get(i);
		return null;
	}
	
	//arg : title:String
	//return : void
	//todo : title을 키값으로 mList를 검색하여 해당하는 Music 인스턴스 삭제
	public void removeOneByTitle(String title) {
		for(int i=0; i<mList.size(); i++) 
			if(mList.get(i).getTitle().equals(title))
				mList.remove(i);
	}
	
	//arg : title:String
	//return : Map<String, Object>
	//todo : title을 키값으로 mList를 검색하여 해당하는 위치(index) 및 인스턴스를 Map으로 묶어서 리턴
	public Map<String, Object> searchModifyMusic(String title){
		Map<String, Object> res = new HashMap<String, Object>();
		for(int i=0; i<mList.size(); i++) {
			if(mList.get(i).getTitle().equals(title)) {
				res.put("music", mList.get(i));
				res.put("index", i);
				
				return res;
			}
		}
		return null;
	}
	
	//arg : title:String
	//return : int
	//todo : title로 mList를 조회하여 해당하는 인덱스 리턴
	public int searchIndexByTitle(String title) {
		for(int i=0; i<mList.size(); i++) 
			if(mList.get(i).getTitle().equals(title))
				return i;
		return -1;
	}
	
	//arg : index:int, music:Music
	//return : void
	//todo : mList의 index값 위치를 매개변수의 music 인스턴스로 대체
	public void modifyOne(int index, Music music) {
		mList.set(index, music);
	}
	
}
