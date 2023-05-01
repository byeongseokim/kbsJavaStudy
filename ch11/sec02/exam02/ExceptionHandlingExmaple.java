package ch11.sec02.exam02;

public class ExceptionHandlingExmaple {
	public static void main(String[] args) {
	//public static void printLength(String data) {
	try {
		Class.forName("java.lang.String");
		System.out.println("java.lang.String 클래스가 존재합니다.");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
  	System.out.println();
  	
  	try {
		Class.forName("java.lang.String2");
		System.out.println("java.lang.String2 클래스가 존재합니다.");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();

	}
     			
		
	}
		

}
