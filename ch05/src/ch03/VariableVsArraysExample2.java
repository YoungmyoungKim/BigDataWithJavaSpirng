package ch03;

public class VariableVsArraysExample2 {

	public static void main(String[] args) {
		//���� Ÿ���� ���� ���� ��� ���
		//�迭 ���� �� ���߿� �迭 ��ü�� �����ؼ� ���Խô� new Ÿ��[]{�ʱⰪ}���� ����
		int[] arr1;
		arr1=new int[]{10, 20, 30, 40, 50};    
		System.out.println(arr1[2]);
		
		arr1[2]=arr1[1]+arr1[3];   //arr1[1]=20 + arr1[3]=40  =>60
			
		System.out.println(arr1[2]);
		
		int i=0;
		System.out.println(++arr1[i]);  //�迭�� �� ����
		System.out.println(arr1[++i]);	 //�ε����� �� ����
	}
}
