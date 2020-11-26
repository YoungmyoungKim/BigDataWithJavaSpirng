package ch15_02;

public class InstanceStaticExample {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {};
	
	static {
		/* 인스턴스 멤버라서 컴파일 에러남. 
		field1=10;
		method1();
		*/
		field2=10;
		method2();
	}
	
	static void method3() {
		/* static 영역이기 때문에 인스턴스 멤버가 올 수 없음. 
		this.field1=10;
		this.method1();
		*/
		field2=10;
		method2();
	}
	
	public static void main(String[] args) { }

}
