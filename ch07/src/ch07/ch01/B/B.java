package ch07.ch01.B;
import ch07.ch01.A.A;

public class B extends A {
	void sub() {
		pub=1;
		pro=2;
		//def=3;   default: 서로 다른 패키지=> 접근 불가
		//pri=4;   private: 접근 불가
	}
}

class C{
	void sub() {
		A a=new A();
		a.pub=1;
		//a.pro=2;  자식 아닌 클래스, 서로 다른 패키지 => 접근 불가 
	}
}
