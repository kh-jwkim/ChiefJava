package org.chief.day01.inputsc;

import java.util.Scanner;

public class Exercise_Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요
		//Kim Seoul 20 65.1 true
		//이름은 Kim, 도시는 Seoul, 나이는 20살, 체중은 65.1kg, 독신 여부는 true입니다.
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean marry = sc.nextBoolean();
//		String marry;
//		while (true) {
//			System.out.println("독신?");
//			marry = sc.next();
//			if(marry.equals("미혼")||marry.equals("기혼")) {
//				break;
//			}
//		}
		
		System.out.println("이름은 "+name+", 도시는 "+city+", 나이는 "+age+"살, 체중은 "+weight+", 독신 여부는 "+marry+"입니다.");
		
		
		
//		String test="";
//		
//		System.out.println("Enter some text (type 'exit' to quit):");
//		// hasNext()를 사용하여 입력이 있는 동안 계속 읽음
//        while (sc.hasNext()) {
//            String input = sc.next();
//            if (input.equalsIgnoreCase("exit")) {
//                break;
//            }
//            System.out.println("You entered: " + input);
//            test = test + input;
//        }
//        
//        sc.close();
//        System.out.println("total text is : "+test);
	}

}
