package ch06.sec12.Hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.Hankook.SnowTire;
import ch06.sec12.Kumho.AllSeasonTire;

public class Car {
	//부품 필드 선언
	ch06.sec12.Hankook .Tire tire1 = new ch06.sec12.Hankook.Tire();
    ch06.sec12.Kumho.Tire tire2 = new ch06.sec12.Kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();

}
