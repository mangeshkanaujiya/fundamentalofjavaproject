package oops;


class Preson{
	 
	private String fristName;
	private String lastName;
	private int Age;
	
	public String getfristName() {
		return  this.fristName;
	}
	public void setfristName(String firstName) {
		this.fristName = firstName;
	}
	
	public String getlastName() {
		return  this.lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return  this.Age;
	}
	public void setAge(int Age) {
		if(Age>= 18)
		   this.Age = Age;
		else
			System.out.println("Invalid Age" );
	}
}




public class EncapsulationsExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Preson preson = new Preson();
		preson.setfristName("King");
		System.out.println(preson.getfristName());
		preson.setlastName("kochhar");
		System.out.println(preson.getlastName());
		preson.setAge(10);
		System.out.println(preson.getAge());

	}

}
