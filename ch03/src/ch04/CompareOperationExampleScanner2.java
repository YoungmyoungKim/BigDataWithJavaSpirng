package ch04;

import java.util.Scanner;

public class CompareOperationExampleScanner2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean op=true;
		while(op) {
			System.out.println("Ȯ���� ���ڸ� �Է��ϼ���: ");
			char c=scanner.next().charAt(0);
			
			//�ƽ�Ű�ڵ忡 �ش��ϴ� ���������� �ٲ� �� �� 
			if((c>'0')&&(c<'9')) System.out.println("�����Դϴ�!");
			else if((c>='A')&&(c<='Z'))  System.out.println("���� �빮�� �Դϴ�!");
			else if((c>='a')&&(c<='z'))  System.out.println("���� �ҹ��� �Դϴ�!");
			else System.out.println("���ڳ� ������ �ƴմϴ�!");
			
			System.out.println("��� �ұ��?(y/n�� ���ϼ���)");
			String yesNo=scanner.next();
			
			/*�⺻ Ÿ�Ը� �񱳿����ڷ� ���� ����, ���� Ÿ��(ex. String)�� �޼ҵ� ����ؾ� ��. 
			if(yesNo=="n"||yesNo=="N") op=!op;
			*/
			
			//����.equals(��) <- ������ ���� �񱳴���� ������ ���ϴ� �޼ҵ� 
			if(yesNo.equals("n")||yesNo.equals("N")) op=!op;
		}
		scanner.close();
		System.out.println("����");
	}
}
