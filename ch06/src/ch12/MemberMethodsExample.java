package ch12;

public class MemberMethodsExample {
	//매개변수 받고, 리턴 타입 있는 메소드
	Member method1(String name, int age, String address) {
		return new Member(name, age, address);
	}
	
	//매개변수를 받고, 리턴 타입이 없는 경우
	void method2(String name, int age, String address) {
		Member m= new Member(name, age, address);
		System.out.println(m.name+", "+m.age+", "+m.address);
	}
	void method2_1(Member m) {
		System.out.println(m.name+", "+m.age+", "+m.address);
	}
	
	//매개변수 안받고 리턴타입 있는 메소드
	Member method3() {
		Member m=new Member("홍길동", 13, "서울시");
		return m;
	}
	
	//매개변수 안받고 리턴타입 있는 메소드
	void method4() {
		Member m=new Member("홍길동", 20, "수원시");
		System.out.println(m.name+", "+m.age+", "+m.address);
	}
	
	public static void main(String[] args) {
		MemberMethodsExample m1=new MemberMethodsExample();
		Member m2=m1.method1("홍길동", 20, "서울시");
		m1.method2("홍길동", 20, "서울시");
		Member m3=m1.method3();
		m1.method4();
	}
}
