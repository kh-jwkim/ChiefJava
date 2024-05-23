package org.chief.day05.array;

public class Exam_DeepCopy {

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
		
		int[] copy = new int[arrs.length];		//arrs의 길이만큼 int 배열 생성!!
		for(int i=0; i<copy.length; i++)		//깊은 복사 : copy의 각 공간에 arrs의 값 복사
			copy[i] = arrs[i];
		
		int[] copy2 = arrs.clone();				//.clone 메서드로 arrs의 복사본 생성 하여 copy2에 주소 저장
		
		copy[1] = 279;			//copy 배열의 두번째(index 1번)값 변경
		arrs[0] = 100;			//copy 배열의 두번째(index 1번)값 변경

		for(int i : arrs)		//arrs 배열 출력
			System.out.print(i + " ");
		System.out.println();
		
		for(int i : copy)		//copy 배열 출력
			System.out.print(i + " ");
		System.out.println();
		
		for(int i : copy2)		//copy2 배열 출력
			System.out.print(i + " ");
		
	}

}
