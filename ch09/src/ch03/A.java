package ch03;

public class A {
	
	void method() {//인스턴스 멤버
		class D{//인스턴스 멤버 안의 인스턴스 클래스
			D(){}
			int field1;  //인스턴스 필드
			void method() {System.out.println("D");}
		}//class D 끝
		D d=new D();
		d.field1=3;
		d.method();
	}//method 영역 끝
}
