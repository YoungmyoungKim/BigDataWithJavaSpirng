package ch02.ch01;

public class A {
	A(){super();   //ù�ٿ�, ��� Ŭ������ object Ŭ������ ��ӹ���. 
		System.out.println("A ������ ȣ��");
	}
}

class B extends A{
	B(){super();
		System.out.println("B ������ ȣ��");
	}
}

class C extends B{
	C(){super();
		System.out.println("C ������ ȣ��");
	}
}