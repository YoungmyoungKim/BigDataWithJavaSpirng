package ch07.ch01;

abstract class Parent{
	int childField;
	void childMethod() {}
}

public class A {
	public static void main(String[] args) {
		//���� Ŭ����- ������ �ٱ� Ŭ����$����.class
		Parent parent=new Parent() {};
		
		//���� Ŭ������ ������ ����� �� �Ͱ� ����.
		//new Parent(){}�� ���� �� ��ü�� ��ӹ��� ��ü�� ������ ȿ�� �߻�
		//�ڽ� ��ü�� �����Ͽ� �θ� ���������� ������ �Ͱ� ������ ��� 
		Parent parent2=new Parent() {
			@Override
			void childMethod() {
				System.out.println("�ڽ� �޼ҵ忡�� ������");
			}
			void newMethod() {}  //�߰� �� �޼ҵ�
			void method2() {}
		};
		
		//�ڽ� ��ü���� �߰��� �޼ҵ�� �ν��ϹǷ� ���� �Ұ�
		//parent2.newField=0;
		//parent2.newMethod();
		
		parent.childField=10;
		parent.childMethod();
		
		parent2.childField=10;
		parent2.childMethod();
		
	}
}



/*
class Child extends Parent{
	int newField;
	
	@Override
	void childMethod() {
		System.out.println("�ڽ� �޼ҵ忡�� ������");
	}
	void newMethod() {}  //�߰� �� �޼ҵ�
}
*/