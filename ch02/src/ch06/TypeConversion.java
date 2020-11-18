package ch06;

public class TypeConversion {

	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		//byte + int -> int + int => int
		System.out.println(b+i);
		
		//int / int -> int
		System.out.println(10/4);
		
		//double/int -> double(10.0)/double(4.0) -> double(2.5)
		System.out.println(10.0/4);
		
		//int -> char -> ���� 3byte�� �����, ������ 2byte�� ��ȿ
		System.out.println((char)0x12340041);
		
		System.out.println((byte)(b+i));    //�����÷ο� 
		
		//2.9 -> int 2 + 1.8 -> 3.8 
		System.out.println((int)2.9 + 1.8);
		
		//double + double -> double -> int �� �� ��ȯ 
		System.out.println((int)(2.9 + 1.8));
		
		//double 2.9 -> int 2, double 1.8 -> int 1, int + int -> int (1 + 2 = 3)
		System.out.println((int)2.9 + (int)1.8);
		
		//54 �ڷ��� ����. 12���� �л����� ���ڷ羿 �������ְ�, ���� ������ �?
		int res=(int)(54/12);   //��
		int l=54-12*res;        //������ 
		
		System.out.println("��: "+res);
		System.out.println("������: "+l);
				
	}

}
