package ch06;

public class MethodExample {

	public static void main(String[] args) {
		

	}
	
	//1. �Ű��� O ��ȯ�� O
	int method1(int value) {
		return value+10;
	}
	
	//2. �Ű��� O ��ȯ�� X
	void method2(int value) {
		System.out.println(value);
	}
	
	//3. �Ű��� X ��ȯ�� O
	int method3() {
		return 100;
	}
	
	//4. �Ű��� X ��ȯ�� X
	void method4() {
		System.out.println("����� ���⼭ ����ϰ� ����");
	}
}
