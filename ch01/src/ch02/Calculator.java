package ch02;
//Ŭ������ ��ü ��θ�: ch02.Calculator;

/* �ּ�: java ���α׷��� Ŭ���� ���� �ִ� �޼ҵ�(method)�� ��ɾ��� �����.  */
public class Calculator {
	
	//main method - ���α׷��� ������(�����)
	public static void main(String[] args) {
		//���� Ÿ���� ���� ����� ���ÿ� ��(30)�� ���� 
		int result = 10+20;  //������(���� ��)���� ����(���� ����)���� ���� ����. 
		/*
		 *int result;   //���� Ÿ���� ���� ����
		 *result=10+20;  //���� Ÿ�� ������ 10+20 (30) �� ���� ����.
		 */
		//���� Ÿ�� ���� result�� ����Ű�� ��������� ���� ���
		System.out.println("���: "+result);  
		System.out.println(Calculator.class.getName());
		
		//����� ���� ���̺귯�� ���, ���� ��Ű�� ���� �ֱ� ������ import �ʿ� ����. 
		MySystem.mysystem.out.println("my ���: "+result);
		
	}//The end of main method

}
