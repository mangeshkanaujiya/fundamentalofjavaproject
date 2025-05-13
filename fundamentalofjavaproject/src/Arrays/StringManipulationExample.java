package Arrays;

public class StringManipulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using string literal 
		String str1 = "Hello ";
		System.out.println(str1);
		
		//using string object 
		String str2 = new String("World");
		System.out.println(str2);
		
		//Concatenating String literal and string object 
		String str3 = (str1)  + (str2);
		System.out.println(str3);
		// string method 
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		System.out.println(str1.concat(str3));
		System.out.println(str3.substring(0,5));
		System.out.println(str1.equals(str2));
		System.out.println(str3.contains("Hello"));
		System.out.println(str3.toLowerCase());
     	System.out.println(str3.toUpperCase());
     	System.out.println(str3.trim());
		

	}

}
