package ch01;

public class StringExample {

	public static void main(String[] args) {
		//���ڿ� ������ ���ڿ� ������ ����
		String str1="abc";
		System.out.println(str1);
		
		//����Ÿ�� �迭 ����=�ʱⰪ
		char data[]= {'a', 'b', 'c'};
		System.out.println(data);
		
		//����Ÿ�� �迭�� ���ڿ� �����ϴ� ��ɹ�
		String str=new String(data);
		System.out.println(str);
		
		//����Ÿ�� �迭�� �� ��Ҹ� ���
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
  