package ch08;

public class ReferenceTypeArraysExample2 {

	public static void main(String[] args) {
		String[] arr=new String[4];
		
		//���� Ÿ���� �迭�� ��� �迭�� �� ��Ұ� �ϳ��� ��ü�� ������ �� ����. 
		arr[0]="Java";
		arr[1]="Java"; 
		arr[2]="Java";//���� ���� �� ��ü "Java"�� arr[0]�� arr[1], arr[2]�� ���� ����Ŵ 
		arr[3]=new String("Java");    //������ ��ü ����
		
		//������ ������ �ּҰ�
		System.out.println("������ ������ �ּҰ�");
		System.out.println("arr[0]�� �ּ�: "+System.identityHashCode(arr[0]));
		System.out.println("arr[1]�� �ּ�: "+System.identityHashCode(arr[1]));
		System.out.println("arr[2]�� �ּ�: "+System.identityHashCode(arr[2]));
		System.out.println("arr[3]�� �ּ�: "+System.identityHashCode(arr[3]));
		System.out.println();
		
		//������ ������ ��
		System.out.println("������ ������ ��");
		System.out.println("arr[0]��  ��: "+arr[0]);
		System.out.println("arr[1]��  ��: "+arr[1]);
		System.out.println("arr[2]��  ��: "+arr[2]);
		System.out.println("arr[3]��  ��: "+arr[3]);
		
		arr[2]="C++";
		System.out.println();
		System.out.println("arr[2]�� �� ����");
		System.out.println();
		//������ ������ �ּҰ�
		System.out.println("������ ������ �ּҰ�");
		System.out.println("arr[0]�� �ּ�: "+System.identityHashCode(arr[0]));
		System.out.println("arr[1]�� �ּ�: "+System.identityHashCode(arr[1]));
		System.out.println("arr[2]�� �ּ�: "+System.identityHashCode(arr[2]));
		System.out.println("arr[3]�� �ּ�: "+System.identityHashCode(arr[3]));
		System.out.println();
		
		//������ ������ ��
		System.out.println("������ ������ ��");
		System.out.println("arr[0]��  ��: "+arr[0]);
		System.out.println("arr[1]��  ��: "+arr[1]);
		System.out.println("arr[2]��  ��: "+arr[2]);
		System.out.println("arr[3]��  ��: "+arr[3]);
	}

}
