package ch14;

public class CarMainExample {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="Sonata";
		c1.color="White";

		Car c2=new Car();
		c2.name="Grandeur";
		c2.color="Red";
		
		Car c3=new Car();
		c3.name="Avante";
		c3.color="blue";
		
		//non=static 멤버의 호출
		//객체 생성 후
		//참조변수.멤버명
		c1.carInfo();
		c2.carInfo();
		c3.carInfo();
		
		//static 멤버의 호출
		//클래스명.멤버명
		Car.Calc();
		
		
	}

}
