package ch15_02;

public class InstanceStaticExample {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {};
	
	static {
		/* �ν��Ͻ� ����� ������ ������. 
		field1=10;
		method1();
		*/
		field2=10;
		method2();
	}
	
	static void method3() {
		/* static �����̱� ������ �ν��Ͻ� ����� �� �� ����. 
		this.field1=10;
		this.method1();
		*/
		field2=10;
		method2();
	}
	
	public static void main(String[] args) { }

}
