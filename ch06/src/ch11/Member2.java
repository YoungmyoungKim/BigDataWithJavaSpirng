package ch11;

public class Member2 {
	//field
	String name;
	int age;
	String address;
	String email;
	String phone;
	
	//Constructor
	public Member2() {
		this(null, 0, null, null, null);
	}
	public Member2(String name, int age, String address) {
		this(name, age, address, null, null);
	}
	
	public Member2(String name, int age, String address, String email) {
		//super();
		this(name, age, address, email, null);
	}
		
	public Member2(String name, int age, String address, String email, String phone) {
		//super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	
}
