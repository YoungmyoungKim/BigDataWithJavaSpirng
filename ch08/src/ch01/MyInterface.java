package ch01;

public interface MyInterface {
	int const1=0;   //��� ����, ������ �� ��  final static �ڵ����� ����.
	//�߻� �޼ҵ� ���� [public abstract] ����
	void method();
}

class MyClass implements MyInterface{
	@Override
	public void method() {
		System.out.println("�������� �޼ҵ�");
	}
}