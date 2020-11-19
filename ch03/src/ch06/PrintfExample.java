package ch06;

import java.util.Date;

//System.out.printf(format, ��);
//%n: �ٹٲ�
//%s: string
//%d: integer
//%f: float
//%0: 8����
//%x: 16����
//%b: boolean
//%e: �������� 
public class PrintfExample {

	public static void main(String[] args) {
		System.out.printf("%b%n", null);
		System.out.printf("%b%n", true);
		
		System.out.printf("Hello %s %n", "�浿");
		System.out.printf("%15s%n", "����");   //��ü ���ڿ��� ���̸� 15�� ��� ������ ����
		System.out.printf("%-15s%n", "����");    //��ü ���ڿ��� ���̸� 15�� ��� ���� ����
		System.out.printf("%2.4s%n", "Hello World!");    //.4s: ����� ���� ���� 
		
		System.out.printf("%d%n", 100L);
		System.out.printf("%f%n", 123.456);
		System.out.printf("%5.2f%n", 123.456);   //.2f: �Ҽ��� �� �ڸ���
		System.out.printf("%5.2e%n", 123.456);    //e ���� ǥ�� 
		
		Date date=new Date();
		System.out.printf("hours:%tH, minute: %tM, second: %tS %n", date, date, date);
		System.out.printf("%tA, %tB, %tY %n", date, date, date);
		
		
		

	}

}
