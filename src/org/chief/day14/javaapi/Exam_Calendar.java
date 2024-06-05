package org.chief.day14.javaapi;

import java.util.Calendar;

public class Exam_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONDAY)+1 + "월");
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(today.get(Calendar.HOUR)+"시");
		System.out.println(today.get(Calendar.MINUTE)+"분");
		System.out.println(today.get(Calendar.SECOND)+"초");
		System.out.println(today.get(Calendar.MILLISECOND)+"밀리초");
		System.out.println(today.get(Calendar.AM_PM)+"오전오후");
		
		Calendar startDate = Calendar.getInstance();
		printDate("개강한 날은 ", startDate);
		// 개강한 날은 2024/05/07/화요일(9시)오전9시 00분 0초 0밀리초
	}

	public static void printDate(String title, Calendar date) {
		
	}
}
