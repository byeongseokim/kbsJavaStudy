package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20;
		//long var3 = 100000000000; //컴파일러는 int로 간주하기 때문에 에러 발생
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.print(var2+"\n");
		System.out.println(var4);
	}

}
