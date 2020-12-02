package ch01;

public interface MyInterface {
	int const1=0;   //상수 선언, 컴파일 할 때  final static 자동으로 붙음.
	//추상 메소드 선언 [public abstract] 생략
	void method();
}

class MyClass implements MyInterface{
	@Override
	public void method() {
		System.out.println("재정의한 메소드");
	}
}