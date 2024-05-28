package org.chief.miniproject.FarmingMudGame;

import java.util.Scanner;

public class Store {
	Product[] buy = new Product[4];
	Product[] sell = new Product[8];
	Scanner sc = new Scanner(System.in);
	
	public Store() {
//		Product[] buyList = new Product[4];
		buy[0] = new Product("감자    ",10);
		buy[1] = new Product("옥수수",20);
		buy[2] = new Product("무      ",40);
		buy[3] = new Product("토마토",100);
		
		sell[0] = new Product("감자모종",5);
		sell[1] = new Product("옥수수씨",10);
		sell[2] = new Product("무 씨앗 ",20);
		sell[3] = new Product("토마토씨",50);
		sell[4] = new Product("감자",30);
		sell[5] = new Product("옥수수",60);
		sell[6] = new Product("무",120);
		sell[7] = new Product("토마토",300);
	}
	
	public void printProduct() {
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│            구           매           │");
		System.out.println("├────────────┬────────────┬────────────┤");
		System.out.println("│   품  목   │   가  격   │   재  고   │");
		System.out.println("├────────────┼────────────┼────────────┤");
		for(int i=0; i<buy.length; i++) 
			System.out.printf("│ %d.%-5s │ %10s │ %10s │\n", (i+1), this.buy[i].productName,this.buy[i].productPrice,this.buy[i].stock);
		System.out.println("└────────────┴────────────┴────────────┘");
	}
	
	public void buyProduct(Status stat) {
		System.out.print("구매할 품목 : ");
		int product = sc.nextInt();
		System.out.print("구매 수량 : ");
		int mount = sc.nextInt();
		if(product<0 || product>4)
			System.out.println("품목을 정확하게 입력해주세요[1~4]");
		else if(mount>this.buy[product-1].stock) 
			System.out.println("죄송합니다 "+this.buy[product-1].productName+"의 재고가 부족합니다");
		else if((this.buy[product-1].productPrice*mount)>stat.getMoney())
			System.out.println("구매하기에 돈이 부족합니다");
		else {
			System.out.print(this.buy[product-1].productName+mount+"개를 "+(this.buy[product-1].productPrice*mount)+"원에 구매 하시겠습니까?[y/n] : ");
			switch (sc.next().charAt(0)) {
			case 'y':
				stat.setMoney(stat.getMoney()-(this.buy[product-1].productPrice*mount));
				switch (product) {
				case 1:
					stat.setPotato(stat.getPotato()+mount);
					break;
				case 2:
					stat.setCorn(stat.getCorn()+mount);
					break;
				case 3:
					stat.setRadish(stat.getRadish()+mount);
					break;
				case 4:
					stat.setTomato(stat.getTomato()+mount);
					break;

				default:
					break;
				}
				System.out.println("구매 완료되었습니다.");
				break;
	
			default:
				break;
			}
		}
	}
	
	public void sellProduct(Status stat) {
		stat.inventoryCheck();
		System.out.print("판매할 품목 : ");
		int product = sc.nextInt();
		System.out.print("판매할 수량 : ");
		int amount = sc.nextInt();
		switch (product) {
			case 1:
				if(stat.getPotato()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setPotato(stat.getPotato()-amount);
				break;
			case 2:
				if(stat.getCorn()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setCorn(stat.getCorn()-amount);
				break;
			case 3:
				if(stat.getRadish()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setRadish(stat.getRadish()-amount);
				break;
			case 4:
				if(stat.getTomato()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setTomato(stat.getTomato()-amount);
				break;
			case 5:
				if(stat.getPOTATO()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setPOTATO(stat.getPOTATO()-amount);
				break;
			case 6:
				if(stat.getCORN()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setCORN(stat.getCORN()-amount);
				break;
			case 7:
				if(stat.getRADISH()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setRADISH(stat.getRADISH()-amount);
				break;
			case 8:
				if(stat.getTOMATO()<amount) {
					System.out.println("수량이 맞지 않습니다.");
					return;
				}
				stat.setTOMATO(stat.getTOMATO()-amount);
				break;
	
			default:
				System.out.println("가게에서 취급하는 품목이 아닙니다.[1~8사이 입력 필요]");
				break;
		}
		stat.setMoney(stat.getMoney()+(amount*this.sell[product-1].productPrice));
		System.out.println(this.sell[product-1].productName+"품목 "+amount+"개를 총 "+(amount*this.sell[product-1].productPrice)+"원에 판매했습니다.");
	}
	
	
}

class Product{
	String productName;
	int productPrice;
	int stock;
	
	public Product(String pName, int pPrice) {
		this.productName=pName;
		this.productPrice=pPrice;
		this.stock=5;
	}
	
	
}