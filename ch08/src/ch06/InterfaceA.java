package ch06;

public interface InterfaceA {
	void method1();
	//����Ʈ �޼ҵ�
	default void method2() {}   //��ü �޼ҵ�� ����� method2�� ������� �ʴ� Ŭ�������� ������ ���ص� ��. 
	//static �޼ҵ�
	static void method3() {}   
}

class B implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
}

class C implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
}

class D implements InterfaceA{
	@Override
	public void method1() {	}
	public void method2() {	}
	
}