package ch12;

public class MethodExample {
	//매개변수 받고, 결과를 리턴하는 메소드
	double method(int x, double y) {
		if(x>10) return 0.0;
		return x+y;
	}
	
	//매개변수 받고, 결과를 리턴하지 않는 메소드
	void method1(double x, double y) {
		System.out.println(x+y);
	}
	
	//매개변수 안받고 결과만 리턴하는 메소드
	double method2() {
		return 10.0;
	}
	
	//매개변수 안받고 결과도 리턴하지 않는 메소드
	void method3() {
		System.out.println(55);
	}
	
	public static void main(String[] args) {
		MethodExample m=new MethodExample();
		//선언 된 메소드 호출시는 실제값을 매개값으로 넘겨줌. 
		double result=m.method(10, 20);
		//void타입 메소드는 호출만하고 리턴값을 받지않음.
		m.method1(10, 20);
		//매개값 없고 결과만 리턴하는 메소드 호출
		result=m.method2();
		//매개값 없고, 결과도 리턴하지 않는 메소드 호출
		m.method3();
	}
}
