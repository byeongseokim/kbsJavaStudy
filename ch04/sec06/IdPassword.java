package ch04.sec06;
//id는 ezen이고 password: 12345 3번 이내에 통과하면 ok, 초과하면 Get Out!출력되는 프로그램 작성
import java.util.Scanner;

public class IdPassword {
	public static void main(String[] args) {
		System.out.println("아이디를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("ezen"));
				
				System.out.println();
				System.out.println("ok");
				
	    System.out.println("비밀번호를 입력하세요.");
	    
	    do {
	    	System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("12345"));
	   
	           System.out.println();
	           System.out.println("ok");

	}

}
