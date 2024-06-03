package org.chief.day12.collection.student;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent implements ManageInterface{

	private List<Student> sList;
	
	public ManageStudent() {
		// TODO Auto-generated constructor stub
		sList = new ArrayList<Student>();
	}
	
	@Override
	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		sList.add(student);
	}

	@Override
	public List<Student> searchOneByName(String name) {
		// TODO Auto-generated method stub
		for(Student student: sList) {
			if(student.getName().equals(name)) {
				System.out.println("이름 : "+student.getName());
				System.out.println("1번째 점수 : "+student.getFirstScore());
				System.out.println("2번째 점수 : "+student.getSecondScore());
			}
		}
		return null;
	}
//	public Student searchOneByName1(String name) {
//		// TODO Auto-generated method stub
//		if(sList.contains(name))
//		for(Student student: sList.) {
//		}
//		return null;
//	}
	
	public int searchIndexByName(String name) {
		for(int i=0; i<sList.size(); i++) 
			if(sList.get(i).getName().equals(name)) 
				return i;
		return -1;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		sList.remove(index);
		sList.add(index, student);
	}

	@Override
	public void deleteStudent(int index) {
		// TODO Auto-generated method stub
		sList.remove(index);
	}

}
