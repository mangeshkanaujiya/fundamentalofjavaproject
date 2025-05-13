package conditional;

public class FizzBuzzProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Check conditions
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
		

	}

}
