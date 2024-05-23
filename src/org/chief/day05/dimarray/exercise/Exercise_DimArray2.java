package org.chief.day05.dimarray.exercise;


public class Exercise_DimArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrSize = 5;
		
		int [][] array = new int[arrSize][arrSize];
		
		System.out.println("//Exam1////////////////////////////////////////////////////////////");
		
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
		
		System.out.println("\n\n//Exam2////////////////////////////////////////////////////////////");
		
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
		
		System.out.println("\n\n//Exam3////////////////////////////////////////////////////////////");
		
		count = 5;
		
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
		
		
		System.out.println("\n\n//Exam4////////////////////////////////////////////////////////////");
		
		
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
		
		
		System.out.println("\n\n//Exam5////////////////////////////////////////////////////////////");
		
		
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
		
		System.out.println("\n\n//Exam6////////////////////////////////////////////////////////////");
		
		
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
		
		System.out.println("\n\n//Exam7////////////////////////////////////////////////////////////");
		
		
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
