package ch01;

import java.util.Scanner;

public class NestedIfExample2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0~100): ");
		int score=scanner.nextInt();
		System.out.println("�г��� �Է��ϼ���(1~4): ");
		int year=scanner.nextInt();
		
		if(score>=60) {
			if(year != 4) {
				System.out.println("�հ�");   //4�г� �ƴϰ� 60�� �̻�
			}else if(score>=70) System.out.println("�հ�");  //4�г� & 70�� �̻�
			
			else System.out.println("���հ�");   //4�г� & 70�� �̸�
			
		}else System.out.println("���հ�");
		
		scanner.close();
	}

}
