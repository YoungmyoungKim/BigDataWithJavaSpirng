package ch08_01;

//�ڹٿ��� ��� Ŭ������ �ֻ���Ŭ������ Object Ŭ������ ��ӹ޾Ƽ� ����
public class A /* extends Object */{  //<- extends Object �ڵ�� �����Ͻ� �߰� 
	public A() {   //default(�⺻) ������ -����: ��ü ������ �ʱ�ȭ ����
		System.out.println("A ������ ȣ��"); 
	}  
	//main method�� �ִ� Ŭ������ �����, ������ ���̺귯���� 
	public static void main(String[] args) {
		B b=new B();   //�ҽ����Ͽ��� ������ �����Ͻ� �⺻ ������ B�� �߰��Ǳ� ������ ȣ�� ����.
		A a=new A();
	}
}   

class B{
	//public B(){}   => �⺻ ������ : ���� ������ �ʾƵ� �����Ϸ��� �˾Ƽ� �߰����� -> ��� Ŭ������ �����ڰ� ���� 
}
