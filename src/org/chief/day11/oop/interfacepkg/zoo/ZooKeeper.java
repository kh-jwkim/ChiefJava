package org.chief.day11.oop.interfacepkg.zoo;

public class ZooKeeper {
	
	public void feed(FoodInterface animal) {
		System.out.println("feed " + animal.animalFood());
	}
	
//	public void feed(Object animal) {
//		if(animal instanceof Lion) {
//			System.out.println("feed gazel");
//		}else if(animal instanceof Tiger) {
//			System.out.println("feed rabbit");
//		}else if(animal instanceof Bear) {
//			System.out.println("feed honey");
//		}else
//			System.out.println("잘못된 타입의 인스턴스입니다.");
//	}
	
}
