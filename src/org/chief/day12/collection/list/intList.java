package org.chief.day12.collection.list;

public class intList { 
	private int [] nums;				//객체 필드값 선언만 하고 초기화는 생성자로 하는게 국룰
	private int size;
	
	public intList() {			//원칙적으로 생성자로 객체의값을 초기화 한다
		nums = new int[3];
		size = 0;
	}
	
	public void add(int num) {
		nums[size] = num;
		size++;
	}
	
	//전체값을 가져올때는매개변수 필요없음
	//그런데 1개의 값을 가져올때는 그 위치가 필요하므로 매개변수 필요함
//	public int[] get(int index) {
	public int get(int index) {
//		return nums;		//리턴타입 int[]	<- 리턴값의 자료형
		return nums[index];	//리턴타입 int		<- 리턴값의 자료형
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		//1. for문 돌면서 초기화
		//2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	}
}
