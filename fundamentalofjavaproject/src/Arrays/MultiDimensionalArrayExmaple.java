package Arrays;

public class MultiDimensionalArrayExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[][] = {
				{42,56,85,92},
				{55,88,66,44},
				{77,99,11,33},
				{10,30,57,90},
				{22,80,15,81}};
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <4; j++) {
				System.out.print(marks[i][j] + "\t" );
			}
			System.out.println();
		}

	}

}
