package ch17;

public class Person {
	final String nation="Korea";   //상수는 선언과 동시에 초기화
	final String ssn;    //생성자에서 초기화하기 때문에 오류 아님. 
	String name;
	
	public Person(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
	}
}
