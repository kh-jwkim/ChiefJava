package org.chief.day12.collection.list;

public class ObjectList {
	Object[] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	//추가
	public void add(Object obj) {
		objects[size] = obj;
		size++;
	}
	
	//조회
	public Object get(int index) {
		return objects[index];
	}
	
	//크기
	public int size() {
		return size;
	}
	
	//초기화
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
