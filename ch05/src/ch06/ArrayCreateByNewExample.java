package ch06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1=new int[3];    //�ʱⰪ 0���� �ʱ�ȭ 
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		System.out.println(arr1[0]+10);
		
		double[] arr2=new double[3];    //�ʱⰪ 0.0���� �ʱ�ȭ 
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]: "+arr2[i]);
		}
		System.out.println(arr2[0]+10);
		
		boolean[] arr3=new boolean[3];    //�ʱⰪ false�� �ʱ�ȭ 
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]: "+arr3[i]);
		}
		System.out.println(arr3[0]|true);  //false| true => true
		
		String[] arr4=new String[3];    //���� Ÿ���� null�� �ʱ�ȭ 
		
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]: "+arr4[i]);
		}
		//���� Ÿ���� ��ҿ� ����
		arr4[1]="hello";   //[null][hello][null]
		System.out.println(arr4[1].length());
		if(arr4[0]==null) System.out.println("�ش� ����� ���� ��� ���� �Ұ��Դϴ�.");
		else System.out.println(arr4[0]);
	}

}
