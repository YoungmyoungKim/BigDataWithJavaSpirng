package ch08;

public class ReferenceTypeArraysExample {

	public static void main(String[] args) {
		String[] arr=new String[3];
		
		arr[0]="Java";
		arr[1]="C++";
		arr[2]="C#";
		
		//������ ������ �ּҰ�
		System.out.println("������ ������ �ּҰ�");
		System.out.println("arr[0]�� �ּ�: "+System.identityHashCode(arr[0]));
		System.out.println("arr[1]�� �ּ�: "+System.identityHashCode(arr[1]));
		System.out.println("arr[2]�� �ּ�: "+System.identityHashCode(arr[2]));
		System.out.println();
		//������ ������ ��
		System.out.println("������ ������ ��");
		System.out.println("arr[0]�� �ּ�: "+arr[0]);
		System.out.println("arr[1]�� �ּ�: "+arr[1]);
		System.out.println("arr[2]�� �ּ�: "+arr[2]);
	}

}
