package ch07;

public class A {
	public static void main(String[] args) {
		//추상 클래스, 인터페이스는 객체 생성 불가. 
		//추상 클래스는 자식 클래스 만들어서 생성.
		//Parent field= new Parent(); 

		Parent p=new Child();
		p.childField=10;
		System.out.println(p.childField);
		p.childMethod();
		
		//접근 불가  
		//parent.newField=10;  
		//parent.newMethod();
	}
}

abstract class Parent{
	public int childField;
	void childMethod() {}
	int getChildField() {return childField;} 
}

class Child extends Parent{
	public int newField;
	@Override
	void childMethod() {
		System.out.println("자식 메소드에서 재정의");
	}
	void newMethod() {}  //추가 된 메소드
}