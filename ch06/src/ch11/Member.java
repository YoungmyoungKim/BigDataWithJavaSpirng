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
		this(name, age, address);   //this �޼ҵ�(�����ڸ� �θ��� �޼ҵ�)�� �ݵ�� ù�ٿ� �־�� �� 
		this.email = email;
	}
		
	public Member(String name, int age, String address, String email, String phone) {
		this(name, age, address, email);
		this.phone = phone;
	}
	
	
}
