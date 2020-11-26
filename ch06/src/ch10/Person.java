package ch10;

public class Person {
	//고유 상태
	String name;
	String gender;
	String birth;
	
	//현재 상태
	int age;   //클래스 내에서 사용되는 멤버필드는 사용자가 초기화하지 않으면 해당 타입의 초기값으로 초기화됨. 
	
	//부품
	Car car=new Car();  //객체 타입의 필드 초기화
	
	void method() {
		int i=age;   //method()내의 로컬 변수 
		System.out.println("age: "+i);   //로컬변수는 초기화 후 읽기 가능 
	}
}
