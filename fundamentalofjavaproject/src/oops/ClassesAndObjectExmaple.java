package oops;

import java.util.Scanner;




class student {
	//Data members
	int studentID;
	String studentname;
	int studentAge;
	Scanner scanner = new Scanner(System.in);
	
	
	//member of function
	public void acceptDetail() {
		System.out.println(" Enter student ID : ");
		studentID =scanner.nextInt();
		System.out.println(" Enter student name : ");
		studentname =scanner.next();
		System.out.println(" Enter student Age :");
		studentAge =scanner.nextInt();
	}
	public void displayDetails(){
		System.out.println("student ID : " + studentID);
		System.out.println("student name : " + studentname);
		System.out.println("student Age : " + studentAge);
		
		
	}
}
	
public class ClassesAndObjectExmaple {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object of class student 
		student student = new student();
		student.acceptDetail();
		student.displayDetails();
		
		
		student student1 = new student();
		student1.acceptDetail();
		student1.displayDetails();

	}

}
