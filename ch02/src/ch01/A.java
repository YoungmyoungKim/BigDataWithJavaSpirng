package ch01;

public class A {
	//���� a, b�� �ĺ���
	int a;
	int b;
	//��� PI�� �ĺ��� 
	final double PI=3.141592; //�������� ��� PI�� �ʱ�ȭ�ϴ� ������: ���ͷ� 
	
	//�޼ҵ�� 'method1', 'method2'�� �ĺ���
	static void method1() {System.out.println("Hi");}
	static void method2() {System.out.println("Hello");}
	
	public static void main(String[] args) {
		method2();  
	}
	
}
