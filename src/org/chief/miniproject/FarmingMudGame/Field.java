package org.chief.miniproject.FarmingMudGame;

class Furrow{
	private char crop;
	private int days;
	private boolean water;
	
	public Furrow(){
		if(Math.random()<0.3)
			this.crop='@';
		else
			this.crop='#';
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
	public void setCrop(char crop) {
		this.crop = crop;
	}
	public int getDays() {
		return this.days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public boolean getWater() {
		return this.water;
	}
	public void setWater(boolean water) {
		this.water = water;
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
		switch (this.getCrop()) {
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
		return this.getCrop();
	}
}

public class Field {

	private Furrow[][] field = new Furrow[5][5];
	private char cropList[] = {'p','c','r','t','P','C','R','T'};
	
	public Field() {
		this.initial();
	}
	
	void initial(){	//최초 초기화(랜덤하게 돌이 나오게)
		for(Furrow[] field: this.field) {
			for(int i=0; i<field.length; i++) {
				field[i] = new Furrow();
			}
		}
	}
	
	void plowing(Status stat, int x, int y) {
		if(stat.getHealth()>=10) {
			this.field[y][x].plowing();
			stat.setHealth(stat.getHealth()-10);
		}else {
			System.out.println("체력이 부족해서 밭을 갈 수 없었습니다.\n체력 : "+stat.getHealth()+"/100");
		}
	}
	
	void sowing(Status stat, int seed, int x, int y) {
		if(this.getFurrow(x, y)=='#') {

			if(stat.getHealth()<10) {
				System.out.println("체력이 부족해서 심을 수 없습니다.");
			}
			else if(stat.getCrops(seed-1)>0) {
				stat.setCrops(seed-1, -1);
				this.field[y][x].setCrop(this.cropList[seed-1]);
				System.out.println("작물을 성공적으로 심었습니다.");
			}else {
				System.out.println("해당 작물이 부족합니다.");
			}
		}else
			System.out.println("비어있는 위치(#)에만 심을 수 있습니다.");
		
	}
	
	void pourWater(int x, int y) {
		this.field[y][x].pourWater();
	}
	char harvest(int x, int y) {
		char res = this.field[y][x].harvesting();
		this.field[y][x] = new Furrow();
		return res;
	}
	void checkField() {
		System.out.print("  ");
		for(int i=0;i<this.field[0].length;i++)
			System.out.print(i+" ");
		System.out.println("x축");
		for(int i=0;i<this.field.length;i++) {
			System.out.print(i+" ");
			for(Furrow furrow: field[i]) {
				if(furrow.getCrop()!='#' && furrow.getCrop()!='@') {
					if(96<furrow.getCrop()) {
						if(furrow.getWater()) 
							System.out.print(", ");
						else
							System.out.print(". ");
					}else
						System.out.print(furrow.getCrop()+" ");
				}else
					System.out.print(furrow.getCrop()+" ");
			}
			System.out.println();
		}
		System.out.println("y축");
		System.out.println("\n@=돌멩이\r\n"
				+ ".=씨앗\r\n"
				+ ",=물 준 씨앗\r\n"
				+ "P=감자\r\n"
				+ "C=옥수수\r\n"
				+ "R=무\r\n"
				+ "T=토마토");
	}
	
	char getFurrow(int x, int y) {
		return field[y][x].getCrop();
	}
	
	void growCrop() {
		for(int i=0;i<this.field.length;i++) {
			for(Furrow furrow: field[i]) {
				if(furrow.getCrop()!='@' && furrow.getCrop()!='#' && 96<furrow.getCrop() && furrow.getWater()==true) {
					furrow.setDays(furrow.getDays()+1);
					if(furrow.getDays()>2) {
						furrow.setCrop((char)((int)furrow.getCrop()-32));
						furrow.setDays(0);
					}
				}
				furrow.setWater(false);
			}
		}
	}
	
	void changeWeather() {
		int weather = (int)(Math.random()*10);
		if(weather>3) {
			System.out.println("오늘의 날씨는 맑습니다.");
		}else if(weather>=0) {
			System.out.println("오늘은 비가 내립니다.");
			for(int i=0;i<this.field.length;i++) {
				for(Furrow furrow: field[i]) {
					furrow.setWater(true);
				}
			}
		}
	}
}

