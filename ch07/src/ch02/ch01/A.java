package ch02.ch01;

public class A {
	A(){super();   //첫줄에, 모든 클래스는 object 클래스를 상속받음. 
		System.out.println("A 생성자 호출");
	}
}

class B extends A{
	B(){super();
		System.out.println("B 생성자 호출");
	}
}

class C extends B{
	C(){super();
		System.out.println("C 생성자 호출");
	}
}