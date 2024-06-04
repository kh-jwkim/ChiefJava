package org.chief.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<Student> searchOneByName(String name) {	//리턴용 List를 따로 만들어서 던져주자
		// TODO Auto-generated method stub
		List<Student> resList = new ArrayList<Student>();
		for(Student student: sList) {
			if(student.getName().equals(name)) {
				resList.add(student);
			}
		}
		return resList;
	}
	
	public int searchIndexByName(String name) {
		for(int i=0; i<sList.size(); i++) 
			if(sList.get(i).getName().equals(name)) 
				return i;
		return -1;
	}
	
	public boolean checkScore(String name) {
		for(Student student: sList) {
			if(student.getName().equals(name)) {
				return ((student.getFirstScore()+student.getSecondScore())/2 >= 60);
					
			}
		}
		return false;
	}
	
	public Map<String, Object> searchModifyStudent(String name) {	//리턴용 List를 따로 만들어서 던져주자
		// TODO Auto-generated method stub
		if(name != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for(int i=0; i<sList.size(); i++) {
				Student student = sList.get(i);
				if(name.equals(student.getName())) {
					result.put("student", student);
					result.put("index", i);
					return result;
				}
			}
//		for(Student student: sList) {
//			if(student.getName().equals(name)) {
//				return student;
//			}
//		}
		}
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		sList.set(index, student);
	}

	@Override
	public void deleteStudent(int index) {
		// TODO Auto-generated method stub
		sList.remove(index);
	}

}
