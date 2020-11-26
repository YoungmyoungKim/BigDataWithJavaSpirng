package ch13_02;

public class MyMathMainExample {

	public static void main(String[] args) {
		//static 선언 했기 때문에 객체 생성할 필요 없음. 
		System.out.println(MyMath.plus(10,  20));
		System.out.println(MyMath.plus(10.0,  10.5));
		System.out.println(MyMath.minus(20, 10));
	}
}
