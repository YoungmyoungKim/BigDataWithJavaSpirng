package ch09;

public class shallowVsDeepCopyExample {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		 //���ο� ��ü ����. -> ���� ����
		int[] arr2=new int[arr.length];  
		
		//�� ��� ����
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		
		System.out.println("arr�� �� ���� ��: arr2");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		arr[0]=9; arr[1]=8; arr[2]=7;
		System.out.println();
		System.out.println("arr�� �� ���� ��: arr");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
		
		//���� �����̱� ������ arr2�� ���� ���� ����. ���� �ٸ� ��ü. 
		System.out.println("arr�� �� ���� ��: arr2");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
	}

}
