package ch10_02;

public class Person {
	Car myCar=new Car();
	//메소드에서 참조 변수가 가리키는 객체의 필드값에 접근 - 참조변수.필드 
	void method() {
		myCar.speed=60;
		System.out.println("speed: "+myCar.speed);
	}
	
}
