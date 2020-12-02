package ch09.ch02;

public abstract class A {   
	void method() {System.out.println("abstract class A");}
	//선언부만 선언된 메소드 - 추상 메소드, 추상 메소드는 추상 클래스 내에만 존재 가능
	//추상 클래스 내에는 추상 메소드, 일반 메소드 모두 존재 가능. 
	abstract void absMethod();
}

class B extends A{
	//부모 클래스의 추상 메소드는 자식 클래스에서 반드시 재정의 해야한다. 
	@Override
	void absMethod() {
		System.out.println("Overriding abstract method: class B");
	}
	
}

//추상 클래스를 상속받은 추상 클래스에서는 추상 메소드 재정의 안해도 됨. 
abstract class C extends A{}

//추상클래스를 상속받은 추상 클래스의 실체 클래스에서도 추상 메소드는 재정의 해야 됨.
class D extends C{
@Override
void absMethod() {
	System.out.println("Overriding abstract method: class D");}
}
