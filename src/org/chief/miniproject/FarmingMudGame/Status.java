package org.chief.miniproject.FarmingMudGame;

class Crops {
	
}

public class Status {
	private int potato, POTATO, corn, CORN, radish, RADISH, tomato, TOMATO;
	private int health;

	private int nextWeather;
	private int money;
	
	Status(){
		health=100;
		nextWeather=0;
		money=50;
		
		potato=0;
		POTATO=0;
		corn=0;
		CORN=0;
		radish=0;
		RADISH=0;
		tomato=0;
		TOMATO=0;
	}
	
	public void inventoryCheck() {
		System.out.println("┌──────────┬──────────┬──────────┐");
		System.out.println("│ 종    류 │ 씨    앗 │ 작    물 │");
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-6s│1.%5d개 │5.%5d개 │\n","감자모종",this.potato,this.POTATO);
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-6s│2.%5d개 │6.%5d개 │\n","옥수수씨",this.corn,this.CORN);
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-8s│3.%5d개 │7.%5d개 │\n","무씨",this.radish,this.RADISH);
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-6s│4.%5d개 │8.%5d개 │\n","토마토씨",this.tomato,this.TOMATO);
		System.out.println("└──────────┴──────────┴──────────┘");
	}
	
	public void statCheck() {
		System.out.printf("체력 : %3d/100\n",this.health);
		System.out.printf("돈 : %d\n",this.money);
	}
	
	
	
	public int getPotato() {
		return potato;
	}
	public void setPotato(int potato) {
		this.potato = potato;
	}
	public int getPOTATO() {
		return POTATO;
	}
	public void setPOTATO(int pOTATO) {
		POTATO = pOTATO;
	}
	public int getCorn() {
		return corn;
	}
	public void setCorn(int corn) {
		this.corn = corn;
	}
	public int getCORN() {
		return CORN;
	}
	public void setCORN(int cORN) {
		CORN = cORN;
	}
	public int getRadish() {
		return radish;
	}
	public void setRadish(int radish) {
		this.radish = radish;
	}
	public int getRADISH() {
		return RADISH;
	}
	public void setRADISH(int rADISH) {
		RADISH = rADISH;
	}
	public int getTomato() {
		return tomato;
	}
	public void setTomato(int tomato) {
		this.tomato = tomato;
	}
	public int getTOMATO() {
		return TOMATO;
	}
	public void setTOMATO(int tOMATO) {
		TOMATO = tOMATO;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getNextWeather() {
		return nextWeather;
	}
	public void setNextWeather(int nextWeather) {
		this.nextWeather = nextWeather;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
