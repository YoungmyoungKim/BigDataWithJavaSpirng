package ch03;

public class WrapperClassExample {

	public static void main(String[] args) {
		//Wrapprt Ŭ���� ����: �⺻ Ÿ���� Ŭ����ȭ ��Ų ��. 
		Integer iValue=new Integer(10);
		Integer iValue2=new Integer("10");
		
		//���� Ÿ���� ���ڿ��� ��ȯ toString();
		String value=iValue.toString();
		System.out.println(value);
		
		//���ڿ� �� ������ ��ȯ valueOf(���ڿ� ��);
		iValue=Integer.valueOf("200");
		
		System.out.println(iValue);
		System.out.println(iValue.intValue());
		
		//Wrapper Ŭ���� �������� �⺻Ÿ�� int�� ��ȯ intValue();
		int i=iValue.intValue();
		
		//�⺻Ÿ�� int ���� Wrapper Ŭ������ (��ü Ÿ������)��ȯ new Integer(������);
		iValue=new Integer(i);
		System.out.println(iValue2);

	}

}
