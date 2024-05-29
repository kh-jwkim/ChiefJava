package org.chief.miniproject.FarmingMudGame;

class Crops {
	
}

public class Status {
	private int[] crops = new int[8];
	private int health;

	private int nextWeather;
	private int money;
	
	Status(){
		health=100;
		nextWeather=0;
		money=50;
	}
	
	public void inventoryCheck() {
		System.out.println("┌──────────┬──────────┬──────────┐");
		System.out.println("│ 종    류 │ 씨    앗 │ 작    물 │");
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-8s│1.%5d개 │5.%5d개 │\n","감자",this.crops[0],this.crops[4]);
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-7s│2.%5d개 │6.%5d개 │\n","옥수수",this.crops[1],this.crops[5]);
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-9s│3.%5d개 │7.%5d개 │\n","무",this.crops[2],this.crops[6]);
		System.out.println("├──────────┼──────────┼──────────┤");
		System.out.printf("│%-7s│4.%5d개 │8.%5d개 │\n","토마토",this.crops[3],this.crops[7]);
		System.out.println("└──────────┴──────────┴──────────┘");
	}
	
	public void statCheck() {
		System.out.printf("체력 : %3d/100\n",this.health);
		System.out.printf("돈 : %d\n",this.money);
	}
	
	public void gotoSleep() {
		this.health = 100;
	}
	
	public void storeCrop(char crop) {
		switch (crop) {
		case 'p':
			this.crops[0]++;
			break;
		case 'c':
			this.crops[1]++;
			break;
		case 'r':
			this.crops[2]++;
			break;
		case 't':
			this.crops[3]++;
			break;
		case 'P':
			this.crops[4]++;
			break;
		case 'C':
			this.crops[5]++;
			break;
		case 'R':
			this.crops[6]++;
			break;
		case 'T':
			this.crops[7]++;
			break;

		default:
			break;
		}
	}
	
	public int getPotato() {
		return crops[0];
	}
	public void setPotato(int potato) {
		this.crops[0] = potato;
	}
	public int getPOTATO() {
		return crops[4];
	}
	public void setPOTATO(int pOTATO) {
		this.crops[4] = pOTATO;
	}
	public int getCorn() {
		return crops[1];
	}
	public void setCorn(int corn) {
		this.crops[1] = corn;
	}
	public int getCORN() {
		return crops[5];
	}
	public void setCORN(int cORN) {
		crops[5] = cORN;
	}
	public int getRadish() {
		return crops[2];
	}
	public void setRadish(int radish) {
		this.crops[2] = radish;
	}
	public int getRADISH() {
		return crops[6];
	}
	public void setRADISH(int rADISH) {
		crops[6] = rADISH;
	}
	public int getTomato() {
		return crops[3];
	}
	public void setTomato(int tomato) {
		this.crops[3] = tomato;
	}
	public int getTOMATO() {
		return crops[7];
	}
	public void setTOMATO(int tOMATO) {
		crops[7] = tOMATO;
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
	public int getCrops(int crop) {
		return crops[crop];
	}
	public void setCrops(int crop, int amount) {
		this.crops[crop]+=amount;
	}
}
