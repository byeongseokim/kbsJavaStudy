package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		//car객체 생성
		Car myCar = new Car();
		
		//tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		
		//HankkokTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		
		//KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();


	}

}
