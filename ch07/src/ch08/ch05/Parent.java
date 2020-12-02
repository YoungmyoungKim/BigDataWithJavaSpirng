package ch08.ch05;

public class Parent {

	public static void main(String[] args) {
		//처음부터 부모 객체를 자식객체로 대입 불가
		//Child child=new Parent();
		
		//자식 -> 부모 -> 자식 형변환 가능. 
		Parent p=new Child();
		Child c=(Child)p;

	}

}

class Child extends Parent{
	
}