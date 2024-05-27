package org.chief.miniproject.FarmingMudGame;

class Furrow{
	char crop;
	int days;
	boolean water;
	
	public Furrow(){
		if(Math.random()<0.2)
			this.crop='@';
		this.days=0;
		this.water=false;
	}
	
	public void pourWater() {
		String target;
		target = this.checkType(crop);
		System.out.println(target+"에 물을 줬습니다.");
		this.water=true;
	}
	
	public char harvesting() {
		String target = this.checkType(crop);
		if(crop!='@' || crop!='#')
			System.out.println(target+"을 수확했습니다.");
		else
			System.out.println("여기엔 작물이 없습니다.");
		return this.crop;
	}
	
	public void plowing() {
		if(this.crop=='@') 
			System.out.println("밭을 갈았습니다.");
		else 
			System.out.println(this.checkType(crop)+"을 갈았습니다.");
		
		this.crop='#';
	}
	
	public char getCrop() {
		return this.crop;
	}
	
	String checkType(char crop) {
		switch (crop) {
		case 'P':
			return "감자";
		case 'C':
			return "옥수수";
		case 'R':
			return "무";
		case 'T':
			return "토마토";
		case 'p':
			return "감자 새싹";
		case 'c':
			return "옥수수 새싹";
		case 'r':
			return "무 새싹";
		case 't':
			return "토마토 새싹";
		case '@':
			return "돌멩이";
		case '#':
			return "흙";
		default:
			return "덜 익은 작물";
		}
	}
}
class Crop extends Furrow{
	public char harvesting() {
		String cropType;
		switch (this.crop) {
		case 'P':
			cropType="감자";
			break;
		case 'C':
			cropType="옥수수";
			break;
		case 'R':
			cropType="무";
			break;
		case 'T':
			cropType="토마토";
			break;
		default:
			cropType="덜 익은 작물";
			break;
		}
		System.out.println(cropType+"을(를) 수확했습니다.");
		return this.crop;
	}
}

public class Field {

	private Furrow[][] field = new Furrow[5][5];
	
	public void Field() {
		this.initial();
	}
	
	void initial(){	//최초 초기화(랜덤하게 돌이 나오게)
		for(Furrow[] field: this.field) {
			for(int i=0; i<field.length; i++) {
				field[i] = new Furrow();
			}
		}
	}
	
	void plowing(int x, int y) {
		this.field[y][x].plowing();
	}
	void pourWater(int x, int y) {
		this.field[y][x].pourWater();
	}
	char harvest(int x, int y) {
		return this.field[y][x].harvesting();
	}
	void checkField() {
		System.out.print("  ");
		for(int i=0;i<this.field[0].length;i++)
			System.out.print(i+" ");
		System.out.println();
		for(int i=0;i<this.field.length;i++) {
			System.out.println((i+1)+" ");
			for(Furrow furrow: field[i])
				System.out.println(furrow.getCrop());
			System.out.println();
		}
	}
}

