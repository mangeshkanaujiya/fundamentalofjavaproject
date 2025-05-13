package basics;

import java.util.Date;


class Point {
    int x, y ;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
 }
public class VariableAndDataTypesExample {

	public static void main(String[] args) {
// primitive Data types
		byte age = 23;
		long ViewCount = 1_112_345_678;
		float price =235.54F;
		char gender = 'M';
		boolean  isValid = true;
		System.out.println(age);
		System.out.println(ViewCount);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(isValid);
		//Non-primitive data types
		
		String name = "king kochhar";
		System.out.println(name);
		Date now = new Date();
		System.out.println(now);
		
		
		Point point1 = new Point(10,20);
		Point point2 = point1;
		
		System.out.println(point1.x + ":" + point1.y);
		System.out.println(point2.x + ":" + point2.y);
		
		point1.y=25;
		
		System.out.println(point1.x + ":" + point1.y);
		System.out.println(point2.x + ":" + point2.y);
		
	}
}
