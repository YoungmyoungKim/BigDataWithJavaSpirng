package ch08;
//�ڹٴ� ���� ������ ��� int Ÿ������ ��ȯ �� ���� ��. �ǿ����ڸ� 4byte ������ �����ϱ� ����. 
//(byte, short, char, int) -> int 
public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3= byteValue1+byteValue2;   //int + int -> int     
		
		int intValue1=byteValue1+byteValue2;    //int + int -> int 
		System.out.println(intValue1);
		
		char charValue1='A';
		char charValue2=1;
		
		//int + int -> int 
		//char charValue3=charValue1+charValue2;    //int Ÿ���� ����� char�� ���� X 	
		int intValue2=charValue1+charValue2;
		
		//��½� char Ÿ������ ���� ��ȯ �� ��� ���� 
		System.out.println("�����ڵ� = "+intValue2);   //int�� 66, 0x41
		System.out.println("��¹��� = "+(char)intValue2);   //���ڷ� 'B'
		
		int intValue3=10;
		int intValue4=intValue3/4;
		System.out.println(intValue4);
		
		int intValue5=10;
		//int intValue6=10/4.0;    // int / double -> double
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
