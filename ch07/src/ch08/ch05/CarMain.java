package ch08.ch05;

public class CarMain {
	public static void main(String[] args) {
		Car car=new Car();
		//Tire 타입 필드에 자식 클래스 KumhoTire객체 대입
		//객체의 다형성
		car.tire=new KumhoTire();
	}

}
