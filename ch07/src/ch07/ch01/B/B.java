package ch07.ch01.B;
import ch07.ch01.A.A;

public class B extends A {
	void sub() {
		pub=1;
		pro=2;
		//def=3;   default: ���� �ٸ� ��Ű��=> ���� �Ұ�
		//pri=4;   private: ���� �Ұ�
	}
}

class C{
	void sub() {
		A a=new A();
		a.pub=1;
		//a.pro=2;  �ڽ� �ƴ� Ŭ����, ���� �ٸ� ��Ű�� => ���� �Ұ� 
	}
}
