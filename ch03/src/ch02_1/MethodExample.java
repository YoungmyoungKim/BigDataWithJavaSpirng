package ch02_1;

public class MethodExample {
	public static void main(String[] args) {
		//반환 값이 있는 메소드 호출시 결과 값을 받아서 처리
		int result1=method1(5);
		System.out.println(result1);
		
		//void 타입 메소드 호출 메소드명 호출
		method2(5);
		
		//값을 안 받고 결과만 리턴하는 메소드 호출
		String msg=method3();
		System.out.println(msg);
		
		//매개값도 받지않고 리턴값도 없는 메소드 
		method4();
		
		
	}
	//값을 입력받고 결과를 되돌려주는 메소드
	static int method1(int x) {
		return 0;
	}
	
	//값을 입력받고 결과를 되돌려주지 않는 메소드
	static void method2(int x) {
		System.out.println(x);
	}
	
	//값을 받지 않고 결과를 반환하는 메소드
	static String method3() {
		return "결과만 되돌려줌";
	}
	
	//값을 받지 않고 결과도 반환하지 않는 메소드
	static void method4() {
		System.out.println("값도 안받고 되돌려주지도 않음");
	}
}
