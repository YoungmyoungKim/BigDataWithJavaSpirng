package ch07;

public class A {
	public static void main(String[] args) {
		//�߻� Ŭ����, �������̽��� ��ü ���� �Ұ�. 
		//�߻� Ŭ������ �ڽ� Ŭ���� ���� ����.
		//Parent field= new Parent(); 

		Parent p=new Child();
		p.childField=10;
		System.out.println(p.childField);
		p.childMethod();
		
		//���� �Ұ�  
		//parent.newField=10;  
		//parent.newMethod();
	}
}

abstract class Parent{
	public int childField;
	void childMethod() {}
	int getChildField() {return childField;} 
}

class Child extends Parent{
	public int newField;
	@Override
	void childMethod() {
		System.out.println("�ڽ� �޼ҵ忡�� ������");
	}
	void newMethod() {}  //�߰� �� �޼ҵ�
}