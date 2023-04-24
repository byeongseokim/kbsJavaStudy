package ch06.sec00;
import java.io.IOException;
import java.util.Scanner;

public class Java_Jinsu {
	public static void main(String[] args) {
		System.out.print("10진수를 입려하세요.");
		//my_in은 Scannerfj 시스템에서 입력을 읽어오는 객체
		Scanner my_in = new Scanner(System.in);
		//ken은 my_in에서 읽어온 값을 정수형으로 변환한 값
		int ken = Integer.parseInt(my_in.next());
		//Scanner는 계속 입력을 받기 때문에 닫아주어야 함.
		my_in.close();
		//10진수 2진수, 8진수 16진수 출력
		System.out.println("10진수는 : " + ken);
		System.out.println("2진수는 : " + Integer.toBinaryString(ken));
		System.out.println("8진수는 : " + Integer.toOctalString(ken));
		System.out.println("16진수는 : " + Integer.toHexString(ken));

	}

}
