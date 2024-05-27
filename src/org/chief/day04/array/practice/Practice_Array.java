package org.chief.day04.array.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	
	public static void main(String[] args) {
		Practice_Array arr = new Practice_Array();
		
		arr.practice12();
	}
	
	public void practice1() {
		//	메소드 명 : public void practice1(){}
		//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//	순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//
		//	ex.
		//	1 2 3 4 5 6 7 8 9 10
		int[] arr = new int[10];
		
		for(int i=1; i<=10; i++) {
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}
	}
	
	public void practice2() {
		//	메소드 명 : public void practice2(){}
		//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//	역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//
		//	ex.
		//	10 9 8 7 6 5 4 3 2 1
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		//	메소드 명 : public void practice3(){}
		//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		//
		//	ex.
		//	양의 정수 : 5
		//	1 2 3 4 5
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
	public void practice4() {
		//	길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		//	배열 인덱스를 활용해서 귤을 출력하세요.
		//
		//	ex.
		//	귤
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
//		System.out.println(fruits[1]);
		
		for(String fru: fruits)
			if(fru.equals("귤"))
				System.out.println(fru);
	}
	
	public void practice5() {
		//	메소드 명 : public void practice5(){}
		//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		//
		//	ex.
		//	문자열 : application
		//	문자 : i
		//	application에 i가 존재하는 위치(인덱스) : 4 8
		//	i 개수 : 2
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String text = sc.next();					//문자열 입력
		
		char[] textArr = new char[text.length()];	//문자열 길이만큼 char 배열생성
		for(int i=0; i<textArr.length; i++) {
			textArr[i] = text.charAt(i);			//인덱스값을 문자열과 char배열에 대입하여 값 복사
		}
		
		System.out.print("문자 : ");
		char key = sc.next().charAt(0);				//비교할 문자를 입력받는다. 이 때 .charAT() 메서드를 이용하여 첫 문자를 key에 저장
		int count=0;
		
		System.out.println(text+"에 i가 존재하는 위치(인덱스) : ");
		for(int i=0; i<textArr.length; i++) {
			if(textArr[i]==key) {					//i번 인덱스에서 검색하려는 문자와 일치한 경우
				System.out.print(i+" ");			//화면에 인덱스값 i 출력
				count++;							//카운트값 증가
			}
		}
		System.out.println("\n" + key + " 개수 : "+count);	//최종 카운트값 출력
		
		sc.close();
	}
	
	public void practice6() {
			//	메소드 명 : public void practice6(){}
			//	“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
			//	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
			//	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
			//
			//	ex.
			//	0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
			//	금요일 잘못 입력하셨습니다.
		Scanner sc = new Scanner(System.in);
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		int day;
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		while((day=sc.nextInt())<0 || day>6)
			System.out.print("잘못 입력하셨습니다.\n\n0 ~ 6 사이 숫자 입력 : ");
		
		System.out.println(week[day]);
		
		sc.close();
	}
	
	public void practice7() {
//		메소드 명 : public void practice7(){}
			//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
			//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
			//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
			//
			//	ex.
			//	정수 : 5
			//	배열 0번째 인덱스에 넣을 값 : 4
			//	배열 1번째 인덱스에 넣을 값 : -4
			//	배열 2번째 인덱스에 넣을 값 : 3
			//	배열 3번째 인덱스에 넣을 값 : -3
			//	배열 4번째 인덱스에 넣을 값 : 2
			//	4 -4 3 -3 2
			//	총 합 : 2
			
			Scanner sc = new Scanner(System.in);
			int sum=0;
			
			System.out.print("정수 : ");
			int[] arr = new int[sc.nextInt()];		//배열 길이를 입력받는다
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
				arr[i] = sc.nextInt();				//배열의 i번째에 입력받은 값을 저장
				sum += arr[i];						//sum에 해당 숫자를 합산
			}
			
			for(int i: arr)
				System.out.print(i+" ");			//배열의 각 값을 출력
			System.out.println("\n총 합 : "+sum);	//배열의 각 값의 합을 출력
			
			sc.close();
	}
	
	public void practice8() {
		//	메소드 명 : public void practice8(){}
		//	3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//	다시 정수를 받도록 하세요.
		//
		//	ex.
		//	정수 : 4
		//	다시 입력하세요.
		//	정수 : -6
		//	다시 입력하세요.
		//	정수 : 5
		//	1, 2, 3, 2, 1
		
		Scanner sc = new Scanner(System.in);
		int inputNum, count=0;
		
		System.out.print("정수 : ");
		while((inputNum=sc.nextInt())<3 || inputNum%2==0)		//숫자 입력받고 3미만 또는 짝수인 경우 재입력
			System.out.print("다시 입력하세요.\n\n정수 : ");
		
		int[] arr = new int[inputNum];
		
		for(int i=0; i<inputNum; i++) {
			if(i*2 < inputNum) {								//인덱스 i값이 배열 길이의 절반 미만일 때(시작 부터 중간값 직전)
				arr[i] = ++count;
				System.out.print(arr[i]+", ");
			}
			else {												//인덱스 i값이 배열 길이의 절반 미만일 때(중간값 부터 끝 까지)
				arr[i] = --count;
				System.out.print(arr[i]);
				if(i!=inputNum-1)								//i가 마지막 값이 아닌 경우에 , 출력
					System.out.print(", ");
			}
		}
		sc.close();
	}
	
	public void practice9() {
		//	메소드 명 : public void practice9(){}
		//	사용자가 입력한 값이 배열에 있는지 검색하여
		//	있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//	단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		//
		//	ex.
		//	치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
		//	양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		
		String[] menuArray = {"양념","후라이드","간장","불닭","까르보나라","개매운","뿌링클"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String inputMenu = sc.next();
		
		int flag=0;
		for(String menu: menuArray) {
			if(menu.equals(inputMenu))
				flag=1;
		}
		if(flag==1)
			System.out.println(inputMenu+"치킨 배달 가능");
		else
			System.out.println(inputMenu+"치킨은 없는 메뉴입니다.");
		
		sc.close();

	}
	
	public void practice10() {
		//	메소드 명 : public void practice10(){}
		//	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		//	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		//
		//	ex.
		//	주민등록번호(-포함) : 123456-1234567
		//	123456-1******
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String inputNumber = sc.next();
		
		char[] number = new char[inputNumber.length()];
		for(int i=0; i < number.length; i++)			//number 배열에는 원본 데이터 저장
			number[i] = inputNumber.charAt(i);
			
		char[] blockedNumber = new char[number.length];
		for(int i=0; i < number.length; i++) {			//blockedNumber 배열에는 성별자리 이후부터 *로 저장
			if(i<8)
				blockedNumber[i] = number[i];			//성별 자리 까지는 number의 값을 blockedNumber에 저장!
			else
				blockedNumber[i] = '*';					//성별 자리 이후는 *을 blockedNumber에 저장!
		}
		
		for(int i=0; i < blockedNumber.length; i++)
			System.out.print(blockedNumber[i]);
		
		sc.close();
	}
	
	public void practice11() {
		//	메소드 명 : public void practice11(){}
		//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		//
		//	ex.
		//	3 4 15 17 28 40
		
		Random random = new Random();
		int[] res = new int[6];
		
		for(int i=0; i<6; i++) {
			int randNum = random.nextInt(45)+1;
			//System.out.println("i="+i);
			//randNum이 res에 포함된 숫자인지 체크해야 함
			//배열의 처음(0번째) 부터 현개 데이터가 저장된 마지막(i)번째 까지를 체크해야함
			for(int j=0 ; j<i; j++) {
				if(res[j]==randNum) {
					randNum = random.nextInt(45)+1;
					j=0;
				}
			}
			for(int j=0 ; j<i; j++) {
				if(res[j]>randNum) {
					int tmp = res[j];
					res[j] = randNum;
					randNum = tmp;
				}
			}
			
			res[i] = randNum;
			
		}
		for(int i: res)
			System.out.print(i+" ");

	}
	
	public void practice12() {
		//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		//	문자의 개수와 함께 출력하세요.
		//
		//	ex.
		//	문자열 : application
		//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
		//	문자 개수 : 8
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String inputText = sc.next();
		char[] textArray = new char[inputText.length()];
		
		System.out.print("문자열 : ");
		for(int i=0; i < inputText.length(); i++) {
			textArray[i] = inputText.charAt(i);
			
			System.out.print(textArray[i]);
			if(i!=inputText.length()-1)
				System.out.print(", ");
		}
		System.out.println("\n문자 개수 : "+textArray.length);
		
		sc.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
