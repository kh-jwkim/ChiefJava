package org.chief.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
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

	public void sortyByTitleASC() {
		// TODO Auto-generated method stub
		Collections.sort(mList);	//이거 쓰려면 클래스에 implements Comparable<Music> 해주고 compareTo 메서드를 오버라이딩 해줘야 한다!!
									//지금은 기본 오름차순 정렬로 진행됨
		// collection - list, set, map 크기 - size()
//		for(int i=0; i<mList.size()-1; i++) {			// i = 루프가 돌 때 마다 1씩 증가, 비교할 범위를 줄이는데 사용된다
//			for(int j=0; j<mList.size()-1-i; j++) {	// j = 비교할 기준이 되는 인덱스, i값 -1 까지(비교범위 가장 오른쪽) 진행된다
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				//문제점 : 객체비교는 부등호로는 무리
//				//비교해야 하는것은 곡명(title)
//				//title을 서로 비교하여 늦은 순서인 경우 교체
//				//문자열 비교는 equals()
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {	// j에 있는 값이 오른쪽의 값보다 크면 서로 바꿔준다
//					mList.set(j, mTwo);		//mOne, mTwo를 따로 만든 변수에 저장했으므로 그냥 set하면 됨
//					mList.set(j+1, mOne);
//				}
//			}
//		}
	}

	public void sortyByTitleDESC() {
		Collections.sort(mList, new DescTitle());
		// TODO Auto-generated method stub
//		for(int i=0; i<mList.size()-1; i++) {			// i = 루프가 돌 때 마다 1씩 증가, 비교할 범위를 줄이는데 사용된다
//			for(int j=0; j<mList.size()-1-i; j++) {	// j = 비교할 기준이 되는 인덱스, i값 -1 까지(비교범위 가장 오른쪽) 진행된다
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				//비교해야 하는것은 곡명(title)
//				//title을 서로 비교하여 빠른 순서인 경우 교체
//				//문자열 비교는 compareTo() 사용
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {	// j에 있는 값이 오른쪽의 값보다 작으면 서로 바꿔준다
//					mList.set(j, mTwo);		//mOne, mTwo를 따로 만든 변수에 저장했으므로 그냥 set하면 됨
//					mList.set(j+1, mOne);
//				}
//			}
//		}
		
	}

	public void sortyBySingerASC() {
		// TODO Auto-generated method stub
		for(int i=0; i<mList.size()-1; i++) {			// i = 루프가 돌 때 마다 1씩 증가, 비교할 범위를 줄이는데 사용된다
			for(int j=0; j<mList.size()-1-i; j++) {	// j = 비교할 기준이 되는 인덱스, i값 -1 까지(비교범위 가장 오른쪽) 진행된다
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				//문제점 : 객체비교는 부등호로는 무리
				//비교해야 하는것은 곡명(title)
				//singer를 서로 비교하여 늦은 순서인 경우 교체
				//문자열 비교는 compareTo() 사용
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {	// j에 있는 값이 오른쪽의 값보다 크면 서로 바꿔준다
					mList.set(j, mTwo);		//mOne, mTwo를 따로 만든 변수에 저장했으므로 그냥 set하면 됨
					mList.set(j+1, mOne);
				}
			}
		}
		
	}

	public void sortyBySingerDESC() {
		// TODO Auto-generated method stub
		for(int i=0; i<mList.size()-1; i++) {			// i = 루프가 돌 때 마다 1씩 증가, 비교할 범위를 줄이는데 사용된다
			for(int j=0; j<mList.size()-1-i; j++) {	// j = 비교할 기준이 되는 인덱스, i값 -1 까지(비교범위 가장 오른쪽) 진행된다
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				//문제점 : 객체비교는 부등호로는 무리
				//비교해야 하는것은 곡명(title)
				//singer을 서로 비교하여 빠른 순서인 경우 교체
				//문자열 비교는 compareTo() 사용
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {	// j에 있는 값이 오른쪽의 값보다 작으면 서로 바꿔준다
					mList.set(j, mTwo);		//mOne, mTwo를 따로 만든 변수에 저장했으므로 그냥 set하면 됨
					mList.set(j+1, mOne);
				}
			}
		}
		
	}
	
}
