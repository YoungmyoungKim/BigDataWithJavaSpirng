package ch11;

public class Member {
	//field
	String name;
	int age;
	String address;
	String email;
	String phone;
	
	//Constructor
	public Member() {}
	public Member(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public Member(String name, int age, String address, String email) {
		this(name, age, address);   //this 메소드(생성자를 부르는 메소드)는 반드시 첫줄에 있어야 함 
		this.email = email;
	}
		
	public Member(String name, int age, String address, String email, String phone) {
		this(name, age, address, email);
		this.phone = phone;
	}
	
	
}
