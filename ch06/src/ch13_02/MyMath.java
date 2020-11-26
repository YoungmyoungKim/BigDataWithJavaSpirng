package ch13_02;

public class MyMath {
	//같은 이름의 메소드가 매개변수의 타입, 개수만 다르게 선언됨 = 메소드 오버로딩 
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	static double plus(double x, double y) {
		return x+y;
	}
}
