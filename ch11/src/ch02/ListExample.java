package ch02;

import java.util.List;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		List list=new Vector();
		
		//��ü�� ����
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Double(10.5));
		list.add(new Boolean(true));
		
		//�÷��� ��Ҵ� ��ü�� ����
		//�⺻ Ÿ�� �־ ���� �ȳ� => AutoBoxing �Ǳ� ����
		list.add(50);  
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //�ش� �ε����� ����� ��
			//������ 50�� ����� Integer.toString() �޼ҵ忡 ���� "50"���� ���
		}
	}
}
