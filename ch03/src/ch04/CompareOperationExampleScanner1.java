package ch04;

import java.util.Scanner;

public class CompareOperationExampleScanner1 {

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
			char yesNo=scanner.next().charAt(0);   //��ĳ�ʷ� �Է¹��� ������ 0��° ���ڸ� ����
			if(yesNo=='n'||yesNo=='N') op=!op;
		}
		scanner.close();
		System.out.println("����");
	}
}
