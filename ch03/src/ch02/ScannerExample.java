package ch02;

import java.util.Scanner;

//Ű����κ��� �Է¹޴� api
public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		final double PI=3.141592;
		
		System.out.println("���ڿ��� �Է��ϼ���> ");
		String message=scanner.next();
		//int message=scanner.nextInt();  //���ڿ��� �Էµ� ������ ���ڸ� ������ ��ȯ
		System.out.println("�Է°� : "+message);
		System.out.println("�Է°��� ���� :"+message.length());
		
		System.out.println("�������� �Ǽ��� �Է��ϼ���> ");
		double doubleNumber=scanner.nextDouble();
		System.out.println(PI*doubleNumber*doubleNumber);
		
	}

}
