package org.chief.day05.array;

public class Exam_HallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = new int[4];
		for(int i=0; i < arrs.length; i++) {
			arrs[i] = i*i;
		}
//		for-each문
//		원래
//		for(int i=0; i < arrs.length; i++)
		for(int i : arrs)
			System.out.print(i + " ");
		System.out.println();
		
		int[] copy = arrs;		//배열 얕은 복사(copy에 arrs의 주소값만 복사된다!!!)
		
		copy[1] = 279;			//copy 배열의 두번째(index 1번)값 변경

		for(int i : arrs)		//arrs 배열 출력
			System.out.print(i + " ");
		System.out.println();
		
		for(int i : copy)		//copy 배열 출력
			System.out.print(i + " ");
		
	}

}
