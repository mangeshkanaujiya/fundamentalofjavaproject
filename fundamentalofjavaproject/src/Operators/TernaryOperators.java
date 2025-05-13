package Operators;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isAuthenticated = true;
		
		
		if(isAuthenticated)
		  System.out.println(" You are Logged-in successfully. ");
		else
		   System.out.println("You are not Logged-in.");

		String result =(isAuthenticated)? "LoggedIn" : "Not LoggedIn";
		System.out.println(result);
	
	}

}


//package Operators;
//
//public class TernaryOperators {
//
//    public static void main(String[] args) {
//        boolean isAuthenticated = true;
//
//        if (isAuthenticated)
//            System.out.println("You are Logged-in successfully.");
//        else
//            System.out.println("You are not Logged-in.");
//
//        String result = (isAuthenticated) ? "LoggedIn" : "Not LoggedIn";
//        System.out.println(result);
//    }
//}

