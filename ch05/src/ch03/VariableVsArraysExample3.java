package ch03;

public class VariableVsArraysExample3 {

	public static void main(String[] args) {
		//���� Ÿ���� ���� ���� ��� ���
		//�迭 ���� �� ���߿� �迭 ��ü�� �����ؼ� ���Խô� new Ÿ��[]{�ʱⰪ}���� ����
		//int[] arr1;
		//arr1=new int[]{10, 20, 30, 40, 50};   => ���� 
		
		int[] arr1= {10, 20, 30, 40, 50};
		//�迭�� ���̴� ����� ������- ���� �� �迭�� ���̰��� length��� �ʵ尡 ������ ����. �б����� �����Ұ�.
		System.out.println(arr1.length);
		
		
		int sum=0;
		for(int i=0; i<arr1.length; i++) {
			sum+=arr1[i]; 
		}
		
		System.out.println(sum);
		System.out.println((double)sum/arr1.length);
	}

}
