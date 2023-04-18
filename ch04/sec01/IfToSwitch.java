package ch04.sec01;

import java.util.Scanner;

public class IfToSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char hak ='f';
		int num = 0, grade=0;
		String jumsu =" ";
		
		while(true) {
			
		System.out.print("점수를 입력(종료:Q) :");
		jumsu = scanner.nextLine();
		
		
		if (jumsu.equals("Q"))
				break;
		
		
		
	    num = Integer.parseInt(jumsu);
		
		grade = num/10;
		
		
		
		switch (grade) {
		
		case 9 :
		    hak = 'A';
		case 8 :
		    hak = 'B';
		case 7 :
		    hak = 'C';
		case 6 :
		    hak = 'D';
		default:
            hak = 'F';				
		
		}
		System.out.println("당신의 점수는" + jumsu + "이고 학점은" + hak + "입니다.");
	}
		System.out.println("프로그램을 종료합니다.");
  }	
}