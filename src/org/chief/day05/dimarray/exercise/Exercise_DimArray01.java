package org.chief.day05.dimarray.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_DimArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력 : ");
		int arrSize = sc.nextInt();
		
		char [][] array = new char[arrSize][arrSize];
		
		Random rand = new Random();
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = (char)(rand.nextInt(26)+97);
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
		

	}

}
