package Arrays;

import java.util.Iterator;

public class SingleDimensionalArrayExample {
	
	public static void main (String[] args) {
		
//       Declaring an Array 
//		 int [] age;
//		 age = new int [6];
//       OR
//       int [] marks =new int[5];
//		Initializing an arrays 
//		int [] marks = new int [] {10,20,30,40,50,60};
// 
		int[] marks = new int [5];
		marks [0]=100;
		marks[1]=60;
		marks[2]=78;
		marks[3]=50;
		marks[4]=80;
		
		for (int i = 0; i < marks.length; i++) {
		    System.out.println(marks[i]);
			
		}
		System.out.println("*****************************\n*****************************\n*****************************");
		for(int value  : marks ) {
			System.out.println(value);
		}
		
		
	}

}
