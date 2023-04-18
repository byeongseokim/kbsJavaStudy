package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		
		for (int k=2; k<9; k++) {
			for(int j=1; j<=9 ; j++) {
				for(int i=2+(k*4); i<=5+(k*4); i++) {
					System.out.print(i+" x "+j+" = " +String.format("%2d", i*j + " "));	}
			         //System.out.printf("%d x %d = %2d ",i,j,i*j);//
			}
			//System.out.println("***" + m +"단 ***");//
		    //for (int n=1; n<=9; n++) {  //
		     //System.out.println(m+ " x " + n + " = " + (m*n)); //
		    }
		}

	}





