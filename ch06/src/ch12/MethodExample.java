package ch12;

public class MethodExample {
	//�Ű����� �ް�, ����� �����ϴ� �޼ҵ�
	double method(int x, double y) {
		if(x>10) return 0.0;
		return x+y;
	}
	
	//�Ű����� �ް�, ����� �������� �ʴ� �޼ҵ�
	void method1(double x, double y) {
		System.out.println(x+y);
	}
	
	//�Ű����� �ȹް� ����� �����ϴ� �޼ҵ�
	double method2() {
		return 10.0;
	}
	
	//�Ű����� �ȹް� ����� �������� �ʴ� �޼ҵ�
	void method3() {
		System.out.println(55);
	}
	
	public static void main(String[] args) {
		MethodExample m=new MethodExample();
		//���� �� �޼ҵ� ȣ��ô� �������� �Ű������� �Ѱ���. 
		double result=m.method(10, 20);
		//voidŸ�� �޼ҵ�� ȣ�⸸�ϰ� ���ϰ��� ��������.
		m.method1(10, 20);
		//�Ű��� ���� ����� �����ϴ� �޼ҵ� ȣ��
		result=m.method2();
		//�Ű��� ����, ����� �������� �ʴ� �޼ҵ� ȣ��
		m.method3();
	}
}
