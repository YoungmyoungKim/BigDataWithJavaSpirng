package ch01;
//Ŭ������ ��ü ��θ�: ch01.Calculator;

//�ٸ� ��Ű��(ch02)�� �ִ� ���̺귯���� Ŭ������
//���� ������ Ŭ�������� ����ϱ� ���� import���� �̿��Ͽ� ����. 
//import.��Ű�����.���̺귯��Ŭ������;
import ch02.MySystem;

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
		
		//System.out : ������ import ���� ��� ����. 
		MySystem.mysystem.out.println("my ���: "+result);
		
	}//The end of main method

}
