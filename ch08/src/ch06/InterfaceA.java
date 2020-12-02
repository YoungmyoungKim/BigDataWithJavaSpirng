package ch06;

public interface InterfaceA {
	void method1();
	//디폴트 메소드
	default void method2() {}   //실체 메소드로 만들면 method2를 사용하지 않는 클래스들은 재정의 안해도 됨. 
	//static 메소드
	static void method3() {}   
}

class B implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
}

class C implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
}

class D implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
	
}