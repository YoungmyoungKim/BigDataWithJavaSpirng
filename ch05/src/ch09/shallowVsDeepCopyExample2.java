package ch09;

public class shallowVsDeepCopyExample2 {

	public static void main(String[] args) {
		// ���� ����: ���� ��ü�� ����   Vs ���� ����: ���� �ٸ� ��ü�� ���� ����
		int[] arr= {1, 2, 3, 4, 5};
		int[] arr2=arr;
		System.out.println("arr2�� arr�� ���� ����, ���� ��ü ����");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		arr[0]=9; arr[1]=8; arr[2]=7;
		System.out.println("arr�� �� ���� �� arr2�� ��");
		//���� �����̱� ������ arr2�� ������ �ٲ�. �� ��ü�� ������. 
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
	}

}
