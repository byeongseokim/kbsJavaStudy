package ch04.sec06;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("id를 입력: ");
		String inputString;
		inputString = scanner.nextLine();
		
		System.out.println("password를 입력: ");
		
		String inputString2;
	    
	    
	    if(  inputString.equals("ezen"))
	    {
	    	System.out.println();
	    for (int i=1; i<4; i++) {
				inputString2 = scanner.nextLine();
				 
		   System.out.println();
	   
		if(  inputString2.equals("12345"))
		       
	            System.out.println("ok");
		else if (! inputString2.equals("12345"))	 
			System.out.println("password를 입력: ");
	    
		if (i==3) 
		     System.out.println("Get Out!");
		
		
		   
		
	   }
	}
  }
}