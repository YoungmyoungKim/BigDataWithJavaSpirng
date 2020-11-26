package ch10;

public class PersonMainExample {

	public static void main(String[] args) {
		Person person = new Person();   
		person.age=20;  //변수가 초기화가 안 된 상태에서 읽으려고 함. 
		
		person.car.company="현대자동차";   
		person.car.engineStart=true;
		
		System.out.println(person.car.engineStart);
		System.out.println(person.car.company);
	}
}
