package ch06;

public class BitOperator2 {

	public static void main(String[] args) {
		byte c=20;    //0x14
		byte d=-8;    //0xf8
		
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2);    //c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c>>2);    //c�� 2��Ʈ ������ ����Ʈ, 0 ����
		System.out.println(d>>2);    //���� ��ȣ ��Ʈ 1�� ä����
		System.out.println(d>>>2);    //0�� ä���� 
		System.out.printf("%x\n", (d>>>2));    
		
		
	}

}
