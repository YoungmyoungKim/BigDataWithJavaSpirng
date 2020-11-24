package ch02;

public class NullExample {

	public static void main(String[] args) {
		String refVal1=new String("hello");
		String refVal2=null;
		
		refVal2=refVal1;  
		System.out.println("refVal1: "+refVal1);
		System.out.println("refVal2: "+refVal2);
		System.out.println("refVal2 length: "+refVal2.length());
		
		if(refVal2==refVal1) System.out.println("���� ��ü�� ������");
		else System.out.println("�ٸ� ��ü�� ������");
		
		if(refVal1.equals(refVal2)) System.out.println("������ ����");
		else System.out.println("������ �ٸ�");
		System.out.println();
		
		refVal2=new String("hi");  //"hello" ��ü�� ������ ��������, "hi" ��ü�� ������
		
		System.out.println("refVal1: "+refVal1);
		System.out.println("refVal2: "+refVal2);
		System.out.println("refVal2 length: "+refVal2.length());
		
		if(refVal2==refVal1) System.out.println("���� ��ü�� ������");
		else System.out.println("�ٸ� ��ü�� ������");
		
		if(refVal1.equals(refVal2)) System.out.println("������ ����");
		else System.out.println("������ �ٸ�");
		System.out.println();
		
		//"hi" ��ü�� ������ ������. �����ϴ� ��ü�� ������ �������� �� ���� ������ �ϸ� 
		//NullPointException �߻�
		refVal2=null; 
		
		System.out.println("refVal2: "+refVal2);
		System.out.println("refVal2 length: "+refVal2.length());
	}

}
