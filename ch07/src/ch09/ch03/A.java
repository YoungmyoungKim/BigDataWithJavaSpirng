package ch09.ch03;

public abstract class A {   
	void method() {System.out.println("abstract class A");}   //실체 메소드
	abstract void method2();    //추상 메소드
}

abstract class B extends A{ 
	//추상 메소드 추가
	abstract void method3();
}
//추상 클래스에 누적되어 선언된 추상메소드는 실체 클래스에서 모두 재정의 되어야 함. 
class C extends B{
	@Override
	void method2() {System.out.println("class C: method2");}
	
	@Override
	void method3() {System.out.println("class C: method3");}
}

