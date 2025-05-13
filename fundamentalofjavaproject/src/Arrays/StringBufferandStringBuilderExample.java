package Arrays;

public class StringBufferandStringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long StarTime = System.currentTimeMillis(); 
		
		
		 StringBuffer buffer=new StringBuffer("Hello ");  
		 System.out.println(buffer.capacity());
	        //buffer.append("World");  
	        //System.out.println(buffer);  
		for(int i=0;i<1000;i++) {
			buffer.append( "world");
		}
		System.out.println("Time taken by StringBuffer :" + (System.currentTimeMillis()- StarTime));
	        
	        StringBuilder builder=new StringBuilder("Hello ");
	        System.out.println(builder.capacity());
	      //  builder.append("World");  
	       // System.out.println(builder);  
	        
	        for(int i=0;i<1000;i++) {
				builder.append( "world");
			}
	        
			System.out.println("Time taken by  stringbuilder :" + (System.currentTimeMillis()- StarTime));


	}

}
