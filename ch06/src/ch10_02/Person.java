package ch10_02;

public class Person {
	Car myCar=new Car();
	//�޼ҵ忡�� ���� ������ ����Ű�� ��ü�� �ʵ尪�� ���� - ��������.�ʵ� 
	void method() {
		myCar.speed=60;
		System.out.println("speed: "+myCar.speed);
	}
	
}
