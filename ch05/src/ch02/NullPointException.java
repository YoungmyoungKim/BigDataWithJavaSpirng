package ch02;

public class NullPointException {

	public static void main(String[] args) {
		//����Ÿ�� �� �迭Ÿ���� ���� ����
		//Ÿ��[] ������ = �迭 ��ü;
		int[] arr1=null;
		
		
		//arr1[0] = 10;   //NullPointException �߻�
		
		//���� = new Ÿ��[���� ������ ����];
		arr1=new int[5];  //int Ÿ���� �� 5���� ������ ���� ���� �� �ε����� ����
		arr1[0]=10;    //heap ������ ��������� �� ������� ����
		//������ �迭�� ����(������ �� �ִ� ����)
		System.out.println(arr1.length);
		
		arr1=null;    //������ ���� ����
		System.out.println(arr1.length);   //NullPointException �߻�
	}

}
