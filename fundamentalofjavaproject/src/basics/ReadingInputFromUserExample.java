package basics;

import java.util.Scanner;

public class ReadingInputFromUserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name =scanner.nextLine();
		
		System.out.print("Enter your Age :");
		int Age = scanner.nextInt();
		
		System.out.print("Enter your gender M/F :");
		char gender = scanner.next().charAt(0);
		
		System.out.print("Enter your Contact Number :");
		double contact = scanner.nextDouble();
		
		System.out.println("USER DETAILS :");
		System.out.println("Name :" + name);
		System.out.println("Age :" + Age);
		System.out.println("Gender :" +gender);
		System.out.println("Contact Number  :" + contact);
		
				
	}

}
