package org.chief.day05.dimarray.exercise;


public class Exercise_DimArray {
	
	int arrSize = 5;
	int [][] array = new int[arrSize][arrSize];
	
	public void practice1() {
		for(int i=0; i<array.length; i++) {
			int count = (i+1)*5;
			for(int j=0; j<array[i].length; j++) {
//				array[i][j] = count--;
				array[i][j] = (i + 1)*array[i].length - j;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
	}

	public void practice2() {
		int count = 1;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = count + 5*j;
			}
			count++;
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
	}
	
	public void practice3() {

		int count = 5;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = count + 5*j;
			}
			count--;
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
	}
	
	public void practice4() {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i%2==0)
					array[i][j] = (array[i].length * i) + j + 1;
				else
					array[i][j] = (array[i].length * (i + 1)) - j;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
	}
	
	public void practice5() {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i%2==0)
					array[i][j] = (array[i].length * (i + 1)) - j;
				else
					array[i][j] = (array[i].length * i) + j + 1;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
	}
	
	public void practice6() {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(j%2==0)
					array[i][j] = (array[j].length * j) + i + 1;
				else
					array[i][j] = (array[j].length * (j + 1)) - i;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
	}
	
	public void practice7() {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(j%2==0)
					array[i][j] = (array[j].length * (j + 1)) - i;
				else
					array[i][j] = (array[j].length * j) + i + 1;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%-2d ",array[i][j]);
			}System.out.println();
		}
	}
	
	
}
