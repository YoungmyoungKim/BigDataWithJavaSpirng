package ch08.ch05;

public class Parent {

	public static void main(String[] args) {
		//ó������ �θ� ��ü�� �ڽİ�ü�� ���� �Ұ�
		//Child child=new Parent();
		
		//�ڽ� -> �θ� -> �ڽ� ����ȯ ����. 
		Parent p=new Child();
		Child c=(Child)p;

	}

}

class Child extends Parent{
	
}