package conditional;

public class ConditionWithOperatorsExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean isLoggedIn = true;
		boolean isEmailValid = false;
		boolean iscardInfoVaild = true;	
		
		if(isLoggedIn && isEmailValid && iscardInfoVaild)
		System.out.println(" you are allowed to make purchase.");
		else
			System.out.println(" you are not allowed to make purchase");
		
		
		if(isLoggedIn) {
			if(isEmailValid) {
				if(iscardInfoVaild) {
					System.out.println(" you are allowed to make a purchased ");
				}
			}
		}

	}

}
