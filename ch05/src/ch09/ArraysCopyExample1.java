package ch09;

public class ArraysCopyExample1 {

	public static void main(String[] args) {
		int[] arr1= {10, 20, 30};
		int[] arr2= {40, 50, 60};
		
		//���� �迭 �ΰ��� ��ģ ũ��� �迭 ����
		int[] arr3=new int[arr1.length+arr2.length];
		
		//ù��° �迭 ����
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		//�ι�° �迭 ����
		for(int i=0; i<arr2.length; i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		//��ģ �迭 ���
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]��  ��: "+arr3[i]);
		}
		System.out.println();
		//���� for��
		for(int num: arr3) {
			System.out.print(num+"\t");
		}

	}

}
