package ch07;

import java.util.Scanner;

public class ThreeConditionOperationExample3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean op=true;
		while(op) {
			System.out.println("Ȯ���� ���ڸ� �Է��ϼ���: ");
			char c=scanner.next().charAt(0);
			
			String str=((c>'0')&&(c<'9')? "����": 
				((c>='A')&&(c<='Z')? "���� �빮��": 
					((c>='a')&&(c<='z')? "���� �ҹ���":"��Ÿ ����")));
			System.out.println(str+" �Դϴ�!");
			
			System.out.println("��� �ұ��?(y/n�� ���ϼ���)");
			String yesNo=scanner.next();
			
			op=(yesNo.equals("n")||yesNo.equals("N"))? !op :op;
		}
		scanner.close();
		System.out.println("����");
	}
}
