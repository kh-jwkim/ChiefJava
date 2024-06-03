package org.chief.day12.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List 인터페이스 존재
		// List 인터페이스를 구현하여 만든 클래스가 존재
		// ArrayList 클래스라고 하면 이것을 사용한다.
		List<String> list = new ArrayList<String>();	//인터페이스로 타입을 주고 업캐스팅 하는게 프레임워크에서 자주 사용하는 스타일
		list.add("김만규");
		list.add("김지혁");
		list.add("양희준");
		list.add("오정민");
		list.add("김태우");
		list.add("이용재");
		list.add("조홍빈");
		list.add("오준석");		//가변길이로 계속 늘릴 수 있다!
		list.add(2,"조승효");	//파라미터로 인덱스값을 주는것이기 때문에 리스트의 3번째 순서에 데이터를 추가
		
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		System.out.println("크기 : " + list.size());
		System.out.println("마지막 값 : " + list.get(list.size()-1));
		for(int i = 0; i<list.size(); i++) 
			System.out.println(i + " : " + list.get(i));
		
		list.remove(list.size()-1);
		list.remove(2);
		list.clear();
		for(String name : list)
			System.out.println(name);
		System.out.println("isEmpty() : " + list.isEmpty() + ", size() : " + list.size());
	}
	
	public void geneicSample() {
		GenericList<String> strList = new GenericList<String>();
		
		strList.add("김정욱");
		strList.add("이현주");
		strList.add("강신욱");
		
		String a1 = strList.get(0);
		String a2 = strList.get(1);
		String a3 = strList.get(2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		ObjectList obj = new ObjectList();
		obj.add("개강");
		obj.add("프로젝트");
		obj.add("종강");
		
		String start = (String)obj.get(0);
		String project = (String)obj.get(1);
		String end = (String)obj.get(2);
		
		System.out.println(start);
	}
	
	public void genListSample() {
		GenericList<String> genList = new GenericList();
		genList.add("개강");
		genList.add("프로젝트");
		genList.add("종강");
		
		System.out.println(genList.get(0));
		System.out.println(genList.get(1));
		System.out.println(genList.get(2));
	}
	
	public void objListSample() {
		ObjectList objList = new ObjectList();
		objList.add(5.7);
		objList.add(1023);
		objList.add("종강");
		
		double start = (double)objList.get(0);
		int end = (int)objList.get(1);
		String msg = (String)objList.get(2);
		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
	}

	public void intListSample() {
		intList nums = new intList();
		nums.add(5);
		nums.add(7);
		nums.add(1023);
		
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : "+nums.size());
		nums.clear();	//모두 삭제
		System.out.println("크기 : "+nums.size());
	}
}
