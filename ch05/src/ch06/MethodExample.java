package ch06;

public class MethodExample {

	public static void main(String[] args) {
		

	}
	
	//1. 매개값 O 반환값 O
	int method1(int value) {
		return value+10;
	}
	
	//2. 매개값 O 반환값 X
	void method2(int value) {
		System.out.println(value);
	}
	
	//3. 매개값 X 반환값 O
	int method3() {
		return 100;
	}
	
	//4. 매개값 X 반환값 X
	void method4() {
		System.out.println("결과는 여기서 출력하고 끝냄");
	}
}
