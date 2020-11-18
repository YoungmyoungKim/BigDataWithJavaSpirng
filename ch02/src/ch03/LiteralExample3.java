package ch03;

//���� ���ͷ�
//���� �� ���� ��
public class LiteralExample3 {

	public static void main(String[] args) {
		//���� Ÿ�� (char) ������ ���� Ÿ�� ���ͷ� ���� 
		char a='A';
		char b='��';
		
		//Ư�� ���� \�������� ���� �ڵ�� ��ɼ� �����̴�.  
		//���� �ڵ忡 �ش��ϴ� ������ �ٲ��� ��
		char c='\u0041';   //unicode 0041 �� �ش��ϴ� �� 'A' ����
		char d='\uae00';   //unicode ae00 �� �ش��ϴ� �� '��' ����
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		char fName='\uae40';
		char midName='\uc601';
		char lName='\uba85';
		
		System.out.println("��: "+fName);
		System.out.println("�߰�: "+midName);
		System.out.println("��: "+lName);
		
		//���� ���ͷ��� ������ ���� �迭�� arr ������ ����
		char[] arr= {'\uae40', '\uc601', '\uba85'};  //���ڷ� ��ȯ �Ǿ ����. 
		
		//���� �迭�� �̿��Ͽ� ���ڿ� ��ü�� ����
		String myName=new String(arr);   //������ 
		System.out.println(myName);
		
	}

}
