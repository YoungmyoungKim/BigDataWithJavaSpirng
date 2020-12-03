package ch07.ch01;

abstract class Parent{
	int childField;
	void childMethod() {}
}

public class A {
	public static void main(String[] args) {
		//무명 클래스- 생성시 바깥 클래스$순번.class
		Parent parent=new Parent() {};
		
		//무명 클래스의 선언은 상속을 한 것과 같다.
		//new Parent(){}로 선언 된 객체는 상속받은 객체와 동일한 효과 발생
		//자식 객체를 생성하여 부모 참조변수에 대입한 것과 동일한 결과 
		Parent parent2=new Parent() {
			@Override
			void childMethod() {
				System.out.println("자식 메소드에서 재정의");
			}
			void newMethod() {}  //추가 된 메소드
			void method2() {}
		};
		
		//자식 객체에서 추가된 메소드로 인식하므로 접근 불가
		//parent2.newField=0;
		//parent2.newMethod();
		
		parent.childField=10;
		parent.childMethod();
		
		parent2.childField=10;
		parent2.childMethod();
		
	}
}



/*
class Child extends Parent{
	int newField;
	
	@Override
	void childMethod() {
		System.out.println("자식 메소드에서 재정의");
	}
	void newMethod() {}  //추가 된 메소드
}
*/