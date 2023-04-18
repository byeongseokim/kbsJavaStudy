package ch03.sec11;

public class Test01 {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = new String ("abc");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		}

}
