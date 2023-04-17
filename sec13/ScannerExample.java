package ch02.sec13;

import java.util.Scanner;       //Scanner가 java.util패치지에 있다는 것을 컴파일러에게 알려주는 역활

public class ScannerExample {
     public static void main(String[] args) throws Exception {
    	 Scanner Scanner = new Scanner(System.in);
    	 
    	 System.out.print("x값 입력: ");
    	 String strX = Scanner.nextLine();
    	 int x = Integer.parseInt(strX);
    	 
		
    	 System.out.print("y값 입력: ");
    	 String strY = Scanner.nextLine();
    	 int y = Integer.parseInt(strY);
    	 
    	 int result = x + y;
    	 System.out.println("x + y: " + result);
    	 System.out.println();
    	 
    	 while(true) {
    		 System.out.print("입력 문자열: ");
    		 String data = Scanner.nextLine();
    		 if(data.equals("q")) {    //입력된문자열이 q라면 반복을 중지
    			 break;
    		 }
    		 System.out.println("출력 문자열: " + data);
    		 System.out.println();
    	 }
    	 
    	 System.out.println("종료");

	}

}
