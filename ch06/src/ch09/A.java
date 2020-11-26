package ch09;

//필드, 생성자, 메소드가 없는 소스코드 => 컴파일 후 class 파일에는 기본 생성자 A(){} 는 생성 됨.
public class A {}

//필드만 있는 소스코드 => 컴파일 후 class 파일에 int field1과 B(){} 생성 됨.
class B{
	//필드
	int field1;
}

//필드와 메소드만 있는 소스코드 => 컴파일 후 class 파일에 field와 C(){}와 method1(){} 생성 됨. 
class C{
	int field1;
	void method1() {}
}

//필드와 메소드와 생성자 모두 있는 소스코드 => 컴파일 수 class 파일에 field, d(){}, method(){} 생성 됨
class D{
	int field;   //멤버 필드
	D(){}    //생성자
	void method() {}    //멤버 메소드
}