package ch03;

//���ͷ��� ���Ǵ� ���� �� \�� �����ϴ� ���ڴ� Ư�� ���
public class LiteralExampleEscapeExample {

	public static void main(String[] args) {
		//�ֵ���ǥ ��� �� \"�� ��� 
		String str1="ȫ�浿�� \"�ȳ��ϼ���\"��� ���ߴ�";
		System.out.println(str1);
		
		//����ǥ ��� �� \'�� ��� 
		String str2= "\'java\'�� ��մ�";
		System.out.println(str2);
		
		//�齺���̽� \b
		String str3="������ ���ٰ�    \b\b�ڷ� �� ĭ ����";
		System.out.println(str3);
		
		//���� �� \r, \n, \r\n  (\n\r �� �� �� �Ѿ)
		String str4="���� �ٷ� �̵� \n ���� �� ���";
		System.out.println(str4);
		
		//�Ǹ�ŭ ���� \t
		String str5="��ũ ����ŭ \t �ǳʶٱ�";
		System.out.println(str5);
		
		// \���� ǥ��  \\
		String str6="c:\\temp";
		System.out.println(str6);
	}

}
