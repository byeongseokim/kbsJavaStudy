package ch03.sec11;
import java.util.Scanner;  
public class Conditional10perationExample {

	public static void main(String[] args) {
	
    	 Scanner Scanner = new Scanner(System.in);
		
		int score = 0;
		char grade = 0;
		
	  //  char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');   //if문으로 짜보기
	 
	   
	    	
	    
		
	
		while(true) {
   		 System.out.print("점수 입력: ");
   		 String data = Scanner.nextLine();
   		 if(data.equals("q"))   
   			 break;
   		score = Integer.parseInt(data);
   		if(90 <= score) 
   			grade = 'A';
   		else if(80 <= score) 
   			grade = 'B';
   		else if(70 <= score) 
   			grade = 'C';
   		else if(60 <= score) 
   			grade = 'D';
   		else 
   			grade = 'F';
	    
	    System.out.println(score + "점은 " + grade + "동급입니다.");
   		
	   
		}
		System.out.println("종료");
  }
 }