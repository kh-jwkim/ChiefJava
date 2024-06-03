package org.chief.day12.collection.list;

import java.util.List;

public class GenericList<T> {
	Object[] objects;
	int size;
	
	List<String> newlist;
	
	public GenericList() {
		objects = new Object[3];
		size = 0;
	}
	
//	public void add(Object object) {}
	public void add(T object) {
		objects[size] = object;
		size++;
	}
	
	public T get(int index) {
		return (T)objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
