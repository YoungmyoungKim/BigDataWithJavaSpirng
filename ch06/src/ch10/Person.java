package ch10;

public class Person {
	//���� ����
	String name;
	String gender;
	String birth;
	
	//���� ����
	int age;   //Ŭ���� ������ ���Ǵ� ����ʵ�� ����ڰ� �ʱ�ȭ���� ������ �ش� Ÿ���� �ʱⰪ���� �ʱ�ȭ��. 
	
	//��ǰ
	Car car=new Car();  //��ü Ÿ���� �ʵ� �ʱ�ȭ
	
	void method() {
		int i=age;   //method()���� ���� ���� 
		System.out.println("age: "+i);   //���ú����� �ʱ�ȭ �� �б� ���� 
	}
}
