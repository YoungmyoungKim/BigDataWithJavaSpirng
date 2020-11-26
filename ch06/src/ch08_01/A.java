package ch08_01;

//자바에서 모든 클래스는 최상위클래스인 Object 클래스를 상속받아서 생성
public class A /* extends Object */{  //<- extends Object 코드는 컴파일시 추가 
	public A() {   //default(기본) 생성자 -역할: 객체 생성시 초기화 역할
		System.out.println("A 생성자 호출"); 
	}  
	//main method가 있는 클래스는 실행용, 없으면 라이브러리용 
	public static void main(String[] args) {
		B b=new B();   //소스파일에는 없지만 컴파일시 기본 생성자 B가 추가되기 때문에 호출 가능.
		A a=new A();
	}
}   

class B{
	//public B(){}   => 기본 생성자 : 직접 만들지 않아도 컴파일러가 알아서 추가해줌 -> 모든 클래스는 생성자가 존재 
}
