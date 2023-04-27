package ch08.sec04;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		
		//Televison 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnON();
		rc.setVolume(5);
		rc.turnOff();
		
		//Audio 객체ㅡㄹ 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnON();
		rc.setVolume(5);
		rc.turnOff();
	}

}
