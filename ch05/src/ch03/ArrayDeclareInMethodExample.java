package ch03;

public class ArrayDeclareInMethodExample {

	public static void main(String[] args) {
		//�迭�� �Ű������� �޴� �޼ҵ忡 �迭�� ���޽ÿ��� 
		//new Ÿ��[]{�ʱⰪ} ���·� ���� 
		int sum2=add(new int[] {10, 20, 30});   //�޼ҵ�� ���޽� �ʱⰪ���� �迭 ��ü �����Ͽ� ���� 
		
		int[] arr= {10, 20, 30, 40};    //�̹� ���� �� �迭�� �޼ҵ�� ���޽� ������ ����. 
		int sum3=add(arr);
		
  		
		System.out.println("��� : "+sum2);
		System.out.println("��� : "+sum3);


	}
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		return sum;
	}
}
