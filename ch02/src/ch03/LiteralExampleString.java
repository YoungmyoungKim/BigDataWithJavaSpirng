package ch03;

import ch01.A;

//string ���ͷ�
public class LiteralExampleString {

	public static void main(String[] args) {
		//���� ����� �ʱ�ȭ 
		String str="Good";
		
		//���� Ÿ�� �� �����ϴ� new ������() ȣ�������� �� ���� 
		String str2=new String("Good");
		
		System.out.println(str);
		System.out.println(str2);
		
		//����� ���� Ŭ���� A�� �����ϰ� �ʱ�ȭ 
		A a=new A();
		/*
		 * ���� Ÿ���� ��� new �����ڸ� �̿��Ͽ� �ʱ�ȭ �ؾ��� 
		 * �Ʒ� ����� �Ұ��� 
		A a=10;
		A a="10"
		*/
	}

}
