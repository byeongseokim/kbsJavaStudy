package ch05.sec00;

public class Test01 {
	public static void main(String[] args) {
		
		
		
	    int i =10;
	    int j=2;
	    char t ='*';
	    String pandan = "";
	    int result = calculate(i, j, t);
	    
	    if (t=='+')
	    	pandan = "덧셈";
	    else if (t=='-')
	        pandan = "뺄셈";
	    else if (t=='*')
	    	pandan = "곱셈";
	    else	
	    	pandan = "나눗셈";
	    
	    System.out.println("두 수의 "+ pandan+"의 결과 : " + result);

		

	}
	
	static int calculate(int a, int b, char c) {
		
		switch(c) {
		
		case '+' :
			return a+b;
		case '-' :
			return a-b;
		case '*' :
			return a*b;
		case '/' :
			return a/b;
		default:
			return 0;
		}
	}
 }

